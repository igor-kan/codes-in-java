# Canonical Huffman Optimal Prefix Code & Bitstream Codec (`huffman_canonical_codec`)

> Category: **Data Compression** | Language: **Java 21**

## Overview

Constructs optimal prefix-free binary code lengths via min-heap frequency merging, normalizes them into canonical codes ordered by (bitLen, symbol), and compresses/decompresses bytes losslessly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(K log K + N) encoding/decoding for alphabet size K` |
| **Space Complexity** | `O(K) canonical codebook` |

## Mathematical & Safety Invariants

- Code lengths strictly satisfy Kraft inequality sum 2^{-L_i} <= 1.
- Decode(Encode(msg)) equals msg identically byte-for-byte.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.huffman_canonical_codec.UnitTests
```

---
© 2026 Igor Kan
