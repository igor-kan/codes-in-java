# Thread-Safe Nanosecond Token Bucket Rate Limiter (`token_bucket_rate_guard`)

> Category: **Concurrency & Rate Limiting** | Language: **Java 21**

## Overview

Enforces bounded burst capacity and steady-state token replenishment rate using monotonic nanosecond deltas, thread-safe lock synchronization, and strict token balance conservation.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) synchronized refill & token permit acquisition` |
| **Space Complexity** | `O(1)` |

## Mathematical & Safety Invariants

- Available token balance strictly stays inside [0, capacity].
- Over any window of duration T seconds starting empty, cumulative granted tokens <= capacity + rate * T.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.token_bucket_rate_guard.UnitTests
```

---
© 2026 Igor Kan
