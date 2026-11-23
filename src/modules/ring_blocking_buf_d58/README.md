# Fixed-Capacity Circular Wraparound Ring Queue (`ring_blocking_buf_d58`)

> Category: **Bounded Queues** | Language: **Java 21**

## Overview

Implements a fixed-capacity modular ring buffer tracking head/tail wraparound with overflow/underflow checks cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) enqueue and dequeue` |
| **Space Complexity** | `O(C)` |

## Mathematical & Safety Invariants

- FIFO dequeue sequence mirrors enqueue order while never exceeding declared capacity.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.ring_blocking_buf_d58.UnitTests
```

---
© 2026 Igor Kan
