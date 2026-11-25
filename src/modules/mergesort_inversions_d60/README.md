# Divide-and-Conquer Merge-Sort Inversion Pair Counter (`mergesort_inversions_d60`)

> Category: **Sorting & Order** | Language: **Java 21**

## Overview

Counts exact out-of-order pairs (i < j, a[i] > a[j]) simultaneously while stably sorting the input integer array.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) divide-and-conquer inversion count` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Inversion count matches brute O(N^2) comparison and array is strictly sorted afterwards.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.mergesort_inversions_d60.UnitTests
```

---
© 2026 Igor Kan
