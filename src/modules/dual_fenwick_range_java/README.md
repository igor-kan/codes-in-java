# Dual-BIT Fenwick Tree for O(log N) Range Add & Range Sum (`dual_fenwick_range_java`)

> Category: **Prefix & Range Structures** | Language: **Java 21**

## Overview

Maintains twin long[] Binary Indexed Trees encoding linear prefix transforms so arbitrary [l, r] interval increments and [l, r] interval sum queries execute in O(log N) time.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) range add and prefix sum` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- rangeSum(l, r) equals naive prefix array oracle across all subintervals.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.dual_fenwick_range_java.UnitTests
```

---
© 2026 Igor Kan
