# LinkedHashMap Access-Order Capacity Eviction Store (`lru_ordered_java_d59`)

> Category: **Caching** | Language: **Java 21**

## Overview

Implements a capacity-bounded LRU dictionary backed by accessOrder LinkedHashMap evicting oldest unaccessed entries cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) lookup and put` |
| **Space Complexity** | `O(C)` |

## Mathematical & Safety Invariants

- Stored key count never exceeds capacity and recently accessed keys survive eviction.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.lru_ordered_java_d59.UnitTests
```

---
© 2026 Igor Kan
