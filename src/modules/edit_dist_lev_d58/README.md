# Linear-Space Rolling Levenshtein Edit Distance (`edit_dist_lev_d58`)

> Category: **String Metrics** | Language: **Java 21**

## Overview

Evaluates minimum insert/delete/replace edit cost between ASCII/UTF-16 strings using a compact O(N) single rolling vector cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(M * N)` |
| **Space Complexity** | `O(min(M, N))` |

## Mathematical & Safety Invariants

- Distance is symmetric d(a, b) == d(b, a) and vanishes iff strings are equal.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.edit_dist_lev_d58.UnitTests
```

---
© 2026 Igor Kan
