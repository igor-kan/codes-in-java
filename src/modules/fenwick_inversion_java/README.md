# Binary Indexed Tree Inversion Count & Order-Statistic Locator (`fenwick_inversion_java`)

> Category: **Order-Statistic Structures** | Language: **Java 21**

## Overview

Counts strictly reversed index pairs (i < j, a[i] > a[j]) in O(N log N) via coordinate compression and backward Binary Indexed Tree sweeps.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) coordinate-compressed BIT inversion sweep` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Strictly sorted ascending array yields 0 inversions; strictly descending yields N*(N-1)/2.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.fenwick_inversion_java.UnitTests
```

---
© 2026 Igor Kan
