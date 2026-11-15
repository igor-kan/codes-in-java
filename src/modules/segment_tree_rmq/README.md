# Lazy-Propagation Range-Add / Range-Minimum Segment Tree (`segment_tree_rmq`)

> Category: **Range Query Structures** | Language: **Java 21**

## Overview

Supports O(log N) arbitrary interval additive updates [l, r] += delta paired with range minimum queries by deferring subtree pushes through lazy tags.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) build, O(log N) range add & range min query` |
| **Space Complexity** | `O(4N) tree + lazy arrays` |

## Mathematical & Safety Invariants

- Every internal node min equals min(left, right) + lazy[node].
- Queries match exhaustive array minimum scan on every interval after arbitrary mixed updates.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.segment_tree_rmq.UnitTests
```

---
© 2026 Igor Kan
