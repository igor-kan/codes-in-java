package com.igorkan.modules.vose_alias_sampler_java;

public interface Contract {
    int sample(Types.AliasTable tbl, int bucket, double u01);
}
