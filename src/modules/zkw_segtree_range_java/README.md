# Iterative Bottom-Up Range-Max & Sum ZKW Segment Tree in Java 21 (`zkw_segtree_range_java`)

> Category: **Range Data Structures** | Language: **Java 21**

## Overview

Indexes a complete binary tree iteratively from leaf offset base = nextPow2(N) upward for minimal allocation overhead.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) recursion-free bit-shift point update & range sum` |
| **Space Complexity** | `O(2 * N)` |

## Mathematical & Safety Invariants

- Bottom-up range sum equals exact slice total over [l, r].

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.zkw_segtree_range_java.UnitTests
```

---
© 2026 Igor Kan
