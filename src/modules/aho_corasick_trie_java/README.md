# Multi-Pattern Aho-Corasick Failure-Link Automaton in Java 21 (`aho_corasick_trie_java`)

> Category: **String Matching** | Language: **Java 21**

## Overview

Compiles a dictionary of lowercase patterns into a deterministic Aho-Corasick trie with BFS suffix links to count all pattern occurrences in a single pass.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N + sum(|P|)) BFS suffix-failure automaton scan` |
| **Space Complexity** | `O(Sigma * sum(|P|))` |

## Mathematical & Safety Invariants

- Total match count equals exact sum of occurrences across all patterns.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.aho_corasick_trie_java.UnitTests
```

---
© 2026 Igor Kan
