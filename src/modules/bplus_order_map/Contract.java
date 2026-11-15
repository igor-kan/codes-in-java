package com.igorkan.modules.bplus_order_map;

import java.util.List;

public interface Contract {
    void put(long key, String val);
    String get(long key);
    List<String> rangeScan(long lo, long hi);
}
