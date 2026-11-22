# Word-Break Minimum Dictionary Segmentation Counter (`word_break_trie_dp_d57`)

> Category: **String Dynamic Programming** | Language: **Java 21**

## Overview

Determines minimum dictionary word partitions segmenting a non-empty query string cleanly, returning -1 when no valid partition exists.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(|S|^2) segment reachability` |
| **Space Complexity** | `O(|S|)` |

## Mathematical & Safety Invariants

- Single matching dictionary entry yields partition count 1 cleanly.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.word_break_trie_dp_d57.UnitTests
```

---
© 2026 Igor Kan
