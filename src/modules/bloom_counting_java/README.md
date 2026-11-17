# Saturating Counting Bloom Filter with Safe Deletion (`bloom_counting_java`)

> Category: **Probabilistic Structures** | Language: **Java 21**

## Overview

Implements a Counting Bloom Filter with k independent SplitMix64 hash projections and integer counter buckets supporting safe deletion without false-negative corruption.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(K) hash probes for add, remove, and mayContain` |
| **Space Complexity** | `O(M) 16-bit saturating counters` |

## Mathematical & Safety Invariants

- Every currently inserted live element returns true from mayContain.
- Deleting one element never drops counters for remaining elements to zero.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.bloom_counting_java.UnitTests
```

---
© 2026 Igor Kan
