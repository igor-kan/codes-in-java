package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Core implements Contract {
    public static final class Node {
        public final Types.PointKD pt;
        public final int axis;
        public final Node left;
        public final Node right;

        public Node(Types.PointKD pt, int axis, Node left, Node right) {
            this.pt = pt;
            this.axis = axis;
            this.left = left;
            this.right = right;
        }
    }

    private final List<Types.PointKD> points;
    private final Node root;

    public Core(List<Types.PointKD> pts) {
        this.points = new ArrayList<>(pts);
        this.root = build(new ArrayList<>(pts), 0);
    }

    private static Node build(List<Types.PointKD> slice, int depth) {
        if (slice.isEmpty()) return null;
        int dim = slice.get(0).coords().length;
        int axis = depth % dim;
        slice.sort(Comparator.comparingDouble(p -> p.coords()[axis]));
        int mid = slice.size() / 2;
        return new Node(
            slice.get(mid),
            axis,
            build(new ArrayList<>(slice.subList(0, mid)), depth + 1),
            build(new ArrayList<>(slice.subList(mid + 1, slice.size())), depth + 1)
        );
    }

    public static double distSq(double[] a, double[] b) {
        double s = 0.0;
        for (int i = 0; i < a.length; i++) {
            double d = a[i] - b[i];
            s += d * d;
        }
        return s;
    }

    private static void search(Node node, double[] q, int[] bestId, double[] bestD2) {
        if (node == null) return;
        double d2 = distSq(node.pt.coords(), q);
        if (d2 < bestD2[0]) {
            bestD2[0] = d2;
            bestId[0] = node.pt.id();
        }
        double diff = q[node.axis] - node.pt.coords()[node.axis];
        Node near = (diff <= 0.0) ? node.left : node.right;
        Node far  = (diff <= 0.0) ? node.right : node.left;
        search(near, q, bestId, bestD2);
        if (diff * diff < bestD2[0]) {
            search(far, q, bestId, bestD2);
        }
    }

    @Override
    public Types.NearestHit nearest(double[] query) {
        Errors.require(root != null, "empty kd-tree");
        int[] bestId = {-1};
        double[] bestD2 = {Double.POSITIVE_INFINITY};
        search(root, query, bestId, bestD2);
        return new Types.NearestHit(bestId[0], bestD2[0]);
    }

    @Override
    public List<Types.PointKD> allPoints() {
        return points;
    }
}
