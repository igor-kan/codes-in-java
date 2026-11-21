# Longest Common Subsequence Rolling-Row DP (`lcs_hirschberg_dp_d56`)

> Category: **Sequence Alignment** | Language: **Java 21**

## Overview

Computes exact Longest Common Subsequence length over integer/character arrays in strictly linear auxiliary space using dual rolling DP rows.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(M * N)` |
| **Space Complexity** | `O(min(M, N))` |

## Mathematical & Safety Invariants

- LCS(a, b) == LCS(b, a) and satisfies 0 <= LCS <= min(|a|, |b|).

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.lcs_hirschberg_dp_d56.UnitTests
```

---
© 2026 Igor Kan
