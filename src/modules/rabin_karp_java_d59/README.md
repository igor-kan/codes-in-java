# Rolling Polynomial Substring Hash Matcher (`rabin_karp_java_d59`)

> Category: **Rolling Hashes** | Language: **Java 21**

## Overview

Scans string payloads via modular polynomial hash mod 1_000_000_007 verifying exact String regionMatches equality upon candidate hash match.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(|T| + |P|) expected` |
| **Space Complexity** | `O(1)` |

## Mathematical & Safety Invariants

- Returned first offset matches String.indexOf across all valid patterns.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.rabin_karp_java_d59.UnitTests
```

---
© 2026 Igor Kan
