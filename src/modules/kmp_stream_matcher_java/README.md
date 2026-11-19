# Knuth-Morris-Pratt Failure-Table Exact Substring Scanner (`kmp_stream_matcher_java`)

> Category: **String Matching** | Language: **Java 21**

## Overview

Precomputes the KMP longest-proper-prefix-suffix array pi[] in O(M) time and emits all pattern occurrence start indices in O(N).

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N + M) zero-backtrack prefix-function scan` |
| **Space Complexity** | `O(M)` |

## Mathematical & Safety Invariants

- Every emitted start index matches substring equality cleanly.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.kmp_stream_matcher_java.UnitTests
```

---
© 2026 Igor Kan
