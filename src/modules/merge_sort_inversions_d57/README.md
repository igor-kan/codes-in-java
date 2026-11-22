# Divide-and-Conquer Merge-Sort Inversion Pair Counter (`merge_sort_inversions_d57`)

> Category: **Order Statistics** | Language: **Java 21**

## Overview

Counts exact unordered out-of-order pairs i < j with a[i] > a[j] using stable bottom-up/recursive merge split inversion accumulation.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N)` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Strictly ascending slices yield 0 inversions while reverse sorted slices yield N*(N-1)/2.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.merge_sort_inversions_d57.UnitTests
```

---
© 2026 Igor Kan
