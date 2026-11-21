# O(K^3 log N) Matrix Exponentiation Linear Recurrence (`matrix_expo_linear_rec_d56`)

> Category: **Algebra & Recurrences** | Language: **Java 21**

## Overview

Computes exact Fibonacci and arbitrary K-order linear recurrences modulo 1_000_000_007 using binary square-and-multiply 2x2/KxK matrix exponentiation.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(K^3 log N)` |
| **Space Complexity** | `O(K^2)` |

## Mathematical & Safety Invariants

- Modular Fibonacci satisfies F(n+2) == F(n+1) + F(n) mod 1e9+7.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.matrix_expo_linear_rec_d56.UnitTests
```

---
© 2026 Igor Kan
