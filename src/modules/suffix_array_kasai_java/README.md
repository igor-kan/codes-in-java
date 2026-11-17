# O(N log N) Prefix-Doubling Suffix Array & Kasai LCP (`suffix_array_kasai_java`)

> Category: **String Indexing** | Language: **Java 21**

## Overview

Builds suffix arrays via prefix-doubling rank sorting and computes Longest Common Prefix arrays via Kasai's linear-time algorithm with binary-search pattern count queries.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) suffix array sort, O(N) Kasai LCP reconstruction` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Suffixes ordered by SA are strictly lexicographically ascending.
- lcp[i] equals exact character match length between sa[i-1] and sa[i].

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.suffix_array_kasai_java.UnitTests
```

---
© 2026 Igor Kan
