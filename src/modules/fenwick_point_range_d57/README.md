# Java Binary Indexed Tree Prefix & Range Query Engine (`fenwick_point_range_d57`)

> Category: **Range Query Trees** | Language: **Java 21**

## Overview

Maintains mutable integer slices supporting point increments and O(log N) prefix and closed interval sum lookups cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) add and prefix query` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Closed interval sum [l, r] equals elementwise sum across identical entries.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.fenwick_point_range_d57.UnitTests
```

---
© 2026 Igor Kan
