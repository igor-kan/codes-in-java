package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Core implements Contract {
    @Override
    public Types.BridgeReport findBridges(int n, List<Types.Edge> edges) {
        Validation.validate(n, edges);
        int m = edges.size();
        int[] head = new int[n];
        Arrays.fill(head, -1);
        int[] to = new int[2 * m];
        int[] eid = new int[2 * m];
        int[] next = new int[2 * m];
        int ptr = 0;
        for (int i = 0; i < m; i++) {
            Types.Edge e = edges.get(i);
            to[ptr] = e.v(); eid[ptr] = i; next[ptr] = head[e.u()]; head[e.u()] = ptr++;
            to[ptr] = e.u(); eid[ptr] = i; next[ptr] = head[e.v()]; head[e.v()] = ptr++;
        }

        int[] tin = new int[n];
        int[] low = new int[n];
        Arrays.fill(tin, -1);
        int[] stkNode = new int[n + 5];
        int[] stkEdge = new int[n + 5];
        int[] stkParent = new int[n + 5];
        int[] stkCur = new int[n + 5];
        int sp = 0;
        int timer = 0;
        int comps = 0;
        List<Integer> bridges = new ArrayList<>();

        for (int root = 0; root < n; root++) {
            if (tin[root] != -1) continue;
            comps++;
            tin[root] = low[root] = timer++;
            stkNode[sp] = root;
            stkEdge[sp] = -1;
            stkParent[sp] = -1;
            stkCur[sp] = head[root];
            sp++;

            while (sp > 0) {
                int top = sp - 1;
                int u = stkNode[top];
                int cur = stkCur[top];
                if (cur != -1) {
                    stkCur[top] = next[cur];
                    int v = to[cur];
                    int id = eid[cur];
                    if (id == stkEdge[top]) continue;
                    if (tin[v] != -1) {
                        if (tin[v] < low[u]) low[u] = tin[v];
                    } else {
                        tin[v] = low[v] = timer++;
                        stkNode[sp] = v;
                        stkEdge[sp] = id;
                        stkParent[sp] = u;
                        stkCur[sp] = head[v];
                        sp++;
                    }
                } else {
                    int p = stkParent[top];
                    int id = stkEdge[top];
                    sp--;
                    if (p != -1) {
                        if (low[u] < low[p]) low[p] = low[u];
                        if (low[u] > tin[p]) bridges.add(id);
                    }
                }
            }
        }
        Collections.sort(bridges);
        return new Types.BridgeReport(bridges, comps);
    }
}
