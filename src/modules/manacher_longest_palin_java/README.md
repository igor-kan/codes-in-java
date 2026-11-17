# Manacher O(N) Odd/Even Palindrome Radius Engine (`manacher_longest_palin_java`)

> Category: **String Algorithms** | Language: **Java 21**

## Overview

Computes exact longest palindrome radii at every integer and half-integer center in linear time using mirror boundary reuse, returning longest palindrome slice and palindrome count.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) mirrored center-expansion` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every reported substring [center - r .. center + r] is strictly palindromic.
- Total palindromic substrings equals sum of (radius + 1)/2 across sentinel-transformed array.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.manacher_longest_palin_java.UnitTests
```

---
© 2026 Igor Kan
