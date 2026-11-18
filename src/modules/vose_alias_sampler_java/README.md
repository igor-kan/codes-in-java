# Vose O(1) Alias Table Discrete Categorical Sampler in Java 21 (`vose_alias_sampler_java`)

> Category: **Randomized Algorithms** | Language: **Java 21**

## Overview

Partitions normalized categorical weights into N equal-mass two-element alias buckets using small/large worklists for O(1) exact sampling.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) table construction + O(1) bucket draw` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every bucket probability lies in [0, 1] and total outcome mass is conserved.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.vose_alias_sampler_java.UnitTests
```

---
© 2026 Igor Kan
