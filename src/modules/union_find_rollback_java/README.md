# Persistent-Undo Rollback Disjoint Set Union in Java 21 (`union_find_rollback_java`)

> Category: **Dynamic Connectivity** | Language: **Java 21**

## Overview

Implements union-by-size Disjoint Set Union with an explicit mutation undo stack, supporting O(log N) unions and checkpointed rollback restoration for divide-and-conquer dynamic connectivity.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) union/find without path compression, O(1) rollback step` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Sum of active component sizes always equals total element count N.
- Rolling back to a saved checkpoint restores exact component count and disjointness.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.union_find_rollback_java.UnitTests
```

---
© 2026 Igor Kan
