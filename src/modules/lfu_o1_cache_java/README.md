# Strict O(1) LFU Cache with Frequency-Bucket Doubly-Linked Lists (`lfu_o1_cache_java`)

> Category: **Cache & Memory Structures** | Language: **Java 21**

## Overview

Implements exact O(1) Least Frequently Used page replacement maintaining HashMap key index and HashMap<freq, DoublyLinkedList> with LRU tie-breaking at minFreq.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) get, put & min-frequency LRU eviction` |
| **Space Complexity** | `O(Capacity)` |

## Mathematical & Safety Invariants

- Cache size never exceeds configured capacity.
- Every eviction strictly selects the least recently used entry inside minFreq bucket.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.lfu_o1_cache_java.UnitTests
```

---
© 2026 Igor Kan
