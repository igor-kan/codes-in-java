# Prefix-Counted Trie Dictionary with Longest Common Prefix Query (`trie_radix_compact_d60`)

> Category: **Trie Structures** | Language: **Java 21**

## Overview

Tracks exact subtree terminal counts along lowercase ASCII trie nodes for fast autocomplete cardinality and LCP probes.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(|S|) insertion, lookup, and prefix count` |
| **Space Complexity** | `O(total characters)` |

## Mathematical & Safety Invariants

- Prefix count equals sum of distinct terminal strings sharing that prefix.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.trie_radix_compact_d60.UnitTests
```

---
© 2026 Igor Kan
