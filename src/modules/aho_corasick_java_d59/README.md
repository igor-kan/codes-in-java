# Aho-Corasick Failure Automaton Keyword Counter (`aho_corasick_java_d59`)

> Category: **Multi-Pattern Search** | Language: **Java 21**

## Overview

Compiles lowercase ASCII keywords into a BFS failure-link DFA automaton and sums overlapping match hits across target text cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(|text| + sum(|pats|) * 26)` |
| **Space Complexity** | `O(states * 26)` |

## Mathematical & Safety Invariants

- Per-pattern hits summed across the automaton agree with linear scanning.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.aho_corasick_java_d59.UnitTests
```

---
© 2026 Igor Kan
