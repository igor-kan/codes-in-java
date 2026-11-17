# Split/Merge Randomized Treap with Order Statistics (`treap_split_merge_java`)

> Category: **Balanced Trees** | Language: **Java 21**

## Overview

Implements an ordered Treap combining binary-search-tree key invariants with deterministic SplitMix64-seeded max-heap priorities to support O(log N) split, merge, and K-th rank lookup.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) expected insert, delete, split, and kth_smallest` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Heap priority invariant and BST strict left/right key ordering hold across all mutations.
- In-order traversal equals sorted insertion set minus erased keys.

## Module Architecture

| File | Lifecycle Role |
| :--- | :--- |
| `Types.java` | Stage 01 |
| `Errors.java` | Stage 02 |
| `Contract.java` | Stage 03 |
| `Core.java` | Stage 04 |
| `Validation.java` | Stage 05 |
| `FastPath.java` | Stage 06 |
| `Concurrent.java` | Stage 07 |
| `Invariants.java` | Stage 08 |
| `UnitTests.java` | Stage 09 |
| `PropertyTests.java` | Stage 10 |
| `Benchmark.java` | Stage 11 |
| `README.md` | Stage 12 |

## Verification & Execution Example

```text
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.treap_split_merge_java.UnitTests
```

---
© 2026 Igor Kan
