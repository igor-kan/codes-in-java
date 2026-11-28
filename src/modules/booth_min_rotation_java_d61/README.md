# Booth Minimal String Rotation Finder (`booth_min_rotation_java_d61`)

> Category: **String Algorithms** | Language: **Java 21**

## Overview

Finds the lexicographically smallest rotation of a string by advancing two candidate offsets through a doubled copy and skipping equivalent prefixes.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) least-rotation scan with two candidate offsets` |
| **Space Complexity** | `O(N) doubled character buffer` |

## Mathematical & Safety Invariants

- The returned start index lies in [0, N) and its rotation is no greater than every other rotation.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.booth_min_rotation_java_d61.UnitTests
```

---
© 2026 Igor Kan
