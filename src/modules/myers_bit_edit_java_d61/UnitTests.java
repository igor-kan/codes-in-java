package com.igorkan.modules.myers_bit_edit_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.distance("kitten", "sitting") != 3) throw new AssertionError("kitten");
        if (c.distance("", "abc") != 3) throw new AssertionError("empty pattern");
        if (c.distance("abc", "") != 3) throw new AssertionError("empty text");
        if (c.distance("abc", "abc") != 0) throw new AssertionError("identical");
        if (c.distance("ab", "ba") != 2) throw new AssertionError("swap");
        String longPat = "0123456789012345678901234567890123456789012345678901234567890123456789";
        if (c.distance(longPat, longPat) != 0) throw new AssertionError("fallback");
        Invariants.ensure(true, "unit ok");
    }
}
