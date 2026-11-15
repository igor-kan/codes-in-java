# Immutable-Style Concatenated Rope Text Structure (`rope_balanced_text`)

> Category: **String Data Structures** | Language: **Java 21**

## Overview

Represents large mutable text buffers as binary trees whose leaves store compact String slices and internal nodes record exact left-subtree weights for O(log N) indexing, split, and concatenation.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) concat/charAt/substring slice` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Internal node leftWeight equals exact total length of its left subtree.
- Flattened inorder traversal equals concatenation of all leaf fragments.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.rope_balanced_text.UnitTests
```

---
© 2026 Igor Kan
