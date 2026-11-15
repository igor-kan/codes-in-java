package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.Arrays;
import java.util.List;

public final class Core implements Contract {
    public static final class IndexedHeap {
        public final int[] heap;
        public final int[] pos;
        public final double[] key;
        public int size = 0;

        public IndexedHeap(int n) {
            this.heap = new int[n];
            this.pos = new int[n];
            this.key = new double[n];
            Arrays.fill(this.pos, -1);
            Arrays.fill(this.key, Double.POSITIVE_INFINITY);
        }

        private void swap(int i, int j) {
            int vi = heap[i], vj = heap[j];
            heap[i] = vj;
            heap[j] = vi;
            pos[vj] = i;
            pos[vi] = j;
        }

        private void siftUp(int i) {
            while (i > 0) {
                int p = (i - 1) >>> 1;
                if (key[heap[p]] <= key[heap[i]]) break;
                swap(i, p);
                i = p;
            }
        }

        private void siftDown(int i) {
            while (true) {
                int l = 2 * i + 1, r = l + 1, sm = i;
                if (l < size && key[heap[l]] < key[heap[sm]]) sm = l;
                if (r < size && key[heap[r]] < key[heap[sm]]) sm = r;
                if (sm == i) break;
                swap(i, sm);
                i = sm;
            }
        }

        public void decreaseKey(int v, double newDist) {
            key[v] = newDist;
            if (pos[v] < 0) {
                int idx = size++;
                heap[idx] = v;
                pos[v] = idx;
                siftUp(idx);
            } else {
                siftUp(pos[v]);
            }
        }

        public int pollMin() {
            int root = heap[0];
            pos[root] = -1;
            int last = heap[--size];
            if (size > 0) {
                heap[0] = last;
                pos[last] = 0;
                siftDown(0);
            }
            return root;
        }
    }

    @Override
    public Types.PathResult shortestPaths(List<List<Types.Edge>> adj, int source) {
        int n = adj.size();
        double[] dist = new double[n];
        int[] parent = new int[n];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        Arrays.fill(parent, -1);
        IndexedHeap pq = new IndexedHeap(n);
        dist[source] = 0.0;
        pq.decreaseKey(source, 0.0);

        while (pq.size > 0) {
            int u = pq.pollMin();
            for (Types.Edge e : adj.get(u)) {
                double nd = dist[u] + e.weight();
                if (nd < dist[e.to()]) {
                    dist[e.to()] = nd;
                    parent[e.to()] = u;
                    pq.decreaseKey(e.to(), nd);
                }
            }
        }
        return new Types.PathResult(dist, parent);
    }
}
