package com.igorkan.modules.segment_tree_rmq;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class Concurrent {
    private Concurrent() {}

    public static final class LockedSegTree {
        private final ReadWriteLock rw = new ReentrantReadWriteLock();
        private final Core seg;

        public LockedSegTree(long[] init) {
            this.seg = new Core(init);
        }

        public void add(int l, int r, long delta) {
            rw.writeLock().lock();
            try { seg.rangeAdd(l, r, delta); } finally { rw.writeLock().unlock(); }
        }

        public long min(int l, int r) {
            rw.readLock().lock();
            try { return seg.rangeMin(l, r); } finally { rw.readLock().unlock(); }
        }
    }
}
