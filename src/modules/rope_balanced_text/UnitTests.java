package com.igorkan.modules.rope_balanced_text;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        Core rope = new Core();
        Types.RopeNode r = rope.concat(new Types.RopeNode("Hello, "), new Types.RopeNode("Balanced Rope!"));
        Validation.verifyWeights(r);
        Invariants.verifyCharacterParity(r, rope, "Hello, Balanced Rope!");
        Types.RopeNode[] parts = rope.split(r, 7);
        assert FastPath.flatten(parts[0]).equals("Hello, ");
        assert FastPath.flatten(parts[1]).equals("Balanced Rope!");
    }
}
