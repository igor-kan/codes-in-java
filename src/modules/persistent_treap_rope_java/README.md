# Path-Copied Persistent Implicit Treap Sequence in Java 21 (`persistent_treap_rope_java`)

> Category: **Persistent Structures** | Language: **Java 21**

## Overview

Represents immutable sequence versions as persistent implicit treap nodes where functional split and merge allocate new path nodes without mutating earlier roots.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) functional split, merge, and range sum` |
| **Space Complexity** | `O(N + Q log N)` |

## Mathematical & Safety Invariants

- Earlier version roots preserve their exact elements and range sums after updates.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.persistent_treap_rope_java.UnitTests
```

---
© 2026 Igor Kan
