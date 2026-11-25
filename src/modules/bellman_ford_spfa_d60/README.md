# SPFA Queue-Optimized Single-Source Shortest Paths with Cycle Guard (`bellman_ford_spfa_d60`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Relaxes directed edges using an active in-queue FIFO while tracking per-vertex relaxation counts to abort on reachable negative cycles.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(E) average / O(V * E) worst case relaxation` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Rejects graphs where any vertex relaxes N or more times.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.bellman_ford_spfa_d60.UnitTests
```

---
© 2026 Igor Kan
