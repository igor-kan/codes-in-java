# TreeMap Disjoint Interval Union & Range Coalescer in Java 21 (`interval_coalesce_tree_java`)

> Category: **Interval & Geometric Structures** | Language: **Java 21**

## Overview

Maintains a normalized collection of disjoint closed-integer [lo, hi] intervals in a TreeMap, coalescing overlapping and adjacent ranges on insertion and reporting total covered integer cardinality in O(1).

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) amortized insert/merge` |
| **Space Complexity** | `O(M) disjoint intervals` |

## Mathematical & Safety Invariants

- Stored TreeMap intervals are strictly separated: prev.hi + 1 < next.lo.
- Tracked coveredPoints() equals sum(hi - lo + 1) across stored intervals.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.interval_coalesce_tree_java.UnitTests
```

---
© 2026 Igor Kan
