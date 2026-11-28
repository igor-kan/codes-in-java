# Gale-Shapley Stable Marriage Solver (`gale_shapley_stable_java_d61`)

> Category: **Matching** | Language: **Java 21**

## Overview

Runs deferred-acceptance proposal rounds between two equal-sized groups and returns a perfect stable matching with no blocking pairs.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N^2) proposal queue with constant-time preference ranks` |
| **Space Complexity** | `O(N^2)` |

## Mathematical & Safety Invariants

- The returned matching is a bijection and contains no pair that both sides prefer over their assigned partner.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.gale_shapley_stable_java_d61.UnitTests
```

---
© 2026 Igor Kan
