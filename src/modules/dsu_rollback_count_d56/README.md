# Undoable Rollback Disjoint Set Union (`dsu_rollback_count_d56`)

> Category: **Disjoint Sets** | Language: **Java 21**

## Overview

Supports dynamic edge insertions paired with checkpoint snapshots and LIFO stack rollbacks without path compression aliasing.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) per union with O(1) rollback` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Rolling back to a checkpoint restores exact connected component counts.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.dsu_rollback_count_d56.UnitTests
```

---
© 2026 Igor Kan
