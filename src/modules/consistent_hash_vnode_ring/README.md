# Consistent Hashing Virtual-Node Ring Router (FNV-1a TreeMap) (`consistent_hash_vnode_ring`)

> Category: **Distributed Systems** | Language: **Java 21**

## Overview

Routes keys deterministically across physical nodes using virtual token replicas placed along a 64-bit FNV-1a ring backed by TreeMap ceiling lookups with wrap-around.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V log(N*V)) ring build, O(log(N*V)) key routing` |
| **Space Complexity** | `O(N * V) TreeMap virtual token entries` |

## Mathematical & Safety Invariants

- Every non-empty key routes deterministically to an active physical node.
- Adding or removing a single node remaps primarily keys owned by that node's tokens.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.consistent_hash_vnode_ring.UnitTests
```

---
© 2026 Igor Kan
