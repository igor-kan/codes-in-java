# Myers Bit-Parallel Edit Distance Matcher (`myers_bit_edit_java_d61`)

> Category: **String Metrics** | Language: **Java 21**

## Overview

Computes exact Levenshtein edit distance by propagating match, positive, and negative bit vectors over the text bytes and falling back to row DP beyond 64 bytes.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N * ceil(M/64)) word-parallel edit distance` |
| **Space Complexity** | `O(M/64 + 256) bit masks` |

## Mathematical & Safety Invariants

- Distance equals zero exactly when pattern and text are identical.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.myers_bit_edit_java_d61.UnitTests
```

---
© 2026 Igor Kan
