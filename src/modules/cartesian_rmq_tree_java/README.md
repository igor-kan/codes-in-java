# Linear-Time Stack Cartesian Tree & Range Minimum Index (`cartesian_rmq_tree_java`)

> Category: **Trees & RMQ** | Language: **Java 21**

## Overview

Builds a min-heap Cartesian tree over an array in O(N) time using a right-spine monotonic stack and answers range minimum index queries via binary search descent.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) monotonic stack construction + O(H) LCA range minimum` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every node index lies between its left and right subtrees and has minimum value in its range.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.cartesian_rmq_tree_java.UnitTests
```

---
© 2026 Igor Kan
