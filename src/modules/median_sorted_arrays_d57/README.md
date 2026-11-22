# O(log min(M, N)) Binary Partition Median of Two Sorted Arrays (`median_sorted_arrays_d57`)

> Category: **Binary Search Partitions** | Language: **Java 21**

## Overview

Finds the exact combined median of two ascending integer arrays using binary partition search over the shorter array cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log min(M, N))` |
| **Space Complexity** | `O(1)` |

## Mathematical & Safety Invariants

- Matches naive merged sort median for odd and even combined lengths.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.median_sorted_arrays_d57.UnitTests
```

---
© 2026 Igor Kan
