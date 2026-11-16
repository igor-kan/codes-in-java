# Iterative Low-Link Tarjan Graph Bridge Finder in Java 21 (`tarjan_bridge_graph_java`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Detects every cut-edge bridge in undirected sparse graphs via explicit non-recursive DFS call frames (avoiding JVM stack overflow on deep path graphs) and verifies every cut against component-count oracles.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V + E) iterative stack safe` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Iterative traversal avoids StackOverflowError even on chains of 50,000 vertices.
- Every reported bridge strictly increases connected component count upon removal.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.tarjan_bridge_graph_java.UnitTests
```

---
© 2026 Igor Kan
