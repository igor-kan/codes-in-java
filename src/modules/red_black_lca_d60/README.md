# Left-Leaning Red-Black Balanced Search Tree with Subtree Sizes (`red_black_lca_d60`)

> Category: **Balanced Trees** | Language: **Java 21**

## Overview

Implements Sedgewick's Left-Leaning Red-Black BST maintaining black-height balance, zero right-leaning red links, and subtree counts.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) lookup, insertion, and k-th order rank` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Black height is uniform across all leaves and no right-leaning red edges exist.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.red_black_lca_d60.UnitTests
```

---
© 2026 Igor Kan
