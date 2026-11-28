# Bitmask N-Queens Solution Counter (`n_queens_bitmask_java_d61`)

> Category: **Backtracking** | Language: **Java 21**

## Overview

Counts and reconstructs N-Queens placements using three bitmasks for occupied columns and both diagonal directions.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N!) pruned bitmask placement search` |
| **Space Complexity** | `O(N) recursion and column vector` |

## Mathematical & Safety Invariants

- Every reconstructed placement has one queen per row with no shared column or diagonal.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.n_queens_bitmask_java_d61.UnitTests
```

---
© 2026 Igor Kan
