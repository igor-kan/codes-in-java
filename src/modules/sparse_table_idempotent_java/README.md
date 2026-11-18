# O(1) Idempotent Range Minimum & Range GCD Sparse Table in Java 21 (`sparse_table_idempotent_java`)

> Category: **Range Query Structures** | Language: **Java 21**

## Overview

Precomputes power-of-two range minima and range greatest common divisors to answer arbitrary interval [L, R] queries in O(1) using Integer.highestOneBit.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) power-of-two table build + O(1) overlapping-block query` |
| **Space Complexity** | `O(N log N)` |

## Mathematical & Safety Invariants

- Overlapping intervals [L, L+2^k-1] and [R-2^k+1, R] preserve idempotent min and gcd.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.sparse_table_idempotent_java.UnitTests
```

---
© 2026 Igor Kan
