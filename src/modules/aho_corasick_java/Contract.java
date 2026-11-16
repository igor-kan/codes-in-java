package com.igorkan.modules.aho_corasick_java;

import java.util.List;

public interface Contract {
    List<Types.Match> findAll(String text);
}
