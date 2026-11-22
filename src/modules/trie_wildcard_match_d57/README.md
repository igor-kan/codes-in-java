# Prefix Trie With '.' Single-Char Wildcard Matcher (`trie_wildcard_match_d57`)

> Category: **Pattern Tries** | Language: **Java 21**

## Overview

Stores ASCII lowercase strings inside a 26-way prefix trie supporting exact insertion and recursive '.' wildcard matching.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(W) insert, DFS wildcard match` |
| **Space Complexity** | `O(chars * 26)` |

## Mathematical & Safety Invariants

- Wildcard patterns equal concatenation of exact character and any-branch matches cleanly.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.trie_wildcard_match_d57.UnitTests
```

---
© 2026 Igor Kan
