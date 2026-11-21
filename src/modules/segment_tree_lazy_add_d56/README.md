# Lazy-Propagation Range-Add & Range-Sum Tree (`segment_tree_lazy_add_d56`)

> Category: **Segment Trees** | Language: **Java 21**

## Overview

Maintains an integer array supporting interval range additions and exact interval sum queries in logarithmic depth using deferred lazy tags.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) per range update or query` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Interval queries strictly match direct elementwise accumulation across arbitrary updates.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.segment_tree_lazy_add_d56.UnitTests
```

---
© 2026 Igor Kan
