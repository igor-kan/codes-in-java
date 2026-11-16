# Deterministic Aho-Corasick Multi-Pattern Search Automaton in Java 21 (`aho_corasick_java`)

> Category: **String Searching** | Language: **Java 21**

## Overview

Builds an ASCII Aho-Corasick finite state automaton with BFS failure links and dictionary outputs to match dozens of patterns in a single linear text scan.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(Text + Matches + Sum(|P|))` |
| **Space Complexity** | `O(Trie States * 128 ASCII)` |

## Mathematical & Safety Invariants

- Matches reported at (start, patternId) obey text.startsWith(patterns[patternId], start).
- Result set matches exhaustive naive multi-pattern search identically.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.aho_corasick_java.UnitTests
```

---
© 2026 Igor Kan
