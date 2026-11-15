package com.igorkan.modules.rope_balanced_text;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        Core rope = new Core();
        Types.RopeNode r = new Types.RopeNode("abcdef");
        String ref = "abcdef";
        for (int i = 0; i < 15; i++) {
            String add = "_s" + i;
            r = rope.concat(r, new Types.RopeNode(add));
            ref = ref + add;
        }
        Validation.verifyWeights(r);
        Invariants.verifyCharacterParity(r, rope, ref);
        Types.RopeNode[] s = rope.split(r, 10);
        assert (FastPath.flatten(s[0]) + FastPath.flatten(s[1])).equals(ref);
    }
}
