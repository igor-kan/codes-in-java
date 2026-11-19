# Tarjan Lowlink Cut-Vertex Articulation Points & Bridges Analyzer (`tarjan_articulation_java`)

> Category: **Graph Connectivity** | Language: **Java 21**

## Overview

Computes all cut vertices (articulation points) and bridge count in undirected graphs using Tarjan DFS tin/low numbers.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V + E) single-pass DFS discovery & lowlink cutoff` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Non-root vertex u is an articulation point iff any child v satisfies low[v] >= tin[u].

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.tarjan_articulation_java.UnitTests
```

---
© 2026 Igor Kan
