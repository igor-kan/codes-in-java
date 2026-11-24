# O(N^3) Hungarian Square Linear Assignment Solver (`hungarian_cost_java_d59`)

> Category: **Combinatorial Optimization** | Language: **Java 21**

## Overview

Solves exact minimum-cost linear assignment problems over integer N x N matrices using Jonker-Volgenant potential labels.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N^3)` |
| **Space Complexity** | `O(N^2)` |

## Mathematical & Safety Invariants

- Assigned sum strictly beats all non-optimal permutation diagonals.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.hungarian_cost_java_d59.UnitTests
```

---
© 2026 Igor Kan
