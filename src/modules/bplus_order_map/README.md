# B+ Tree Ordered Map with Leaf-Chained Range Scan (`bplus_order_map`)

> Category: **Database Storage Engines** | Language: **Java 21**

## Overview

Implements an ordered B+ Tree mapping Long keys to values across fixed-order internal/leaf nodes linked at the leaf level, verified against java.util.TreeMap.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log_B N) put/get, O(log_B N + K) range query` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- All leaf nodes lie at equal depth from the root.
- Chained leaf keys traverse strictly in ascending order matching TreeMap.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.bplus_order_map.UnitTests
```

---
© 2026 Igor Kan
