# Conservative-Update Count-Min Sketch in Java 21 (`count_min_sketch_java`)

> Category: **Streaming & Probabilistic Sketches** | Language: **Java 21**

## Overview

Implements conservative-update Count-Min Sketch using SplitMix64 pairwise-independent row hashes, minimum-preserving counter increments, and mergeable replica tables.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(d) update & query` |
| **Space Complexity** | `O(d * w) longs` |

## Mathematical & Safety Invariants

- Query frequency estimate never underestimates exact true frequency for any observed key.
- Merging two equal-dimension sketches preserves additive frequency monotonicity.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.count_min_sketch_java.UnitTests
```

---
© 2026 Igor Kan
