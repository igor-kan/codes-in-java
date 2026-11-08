# Performance optimizations and vectorization for Foreign Function and Memory (FFM) Off-Heap Arena
# Module: panama_offheap_arena
# - Stride-1 sequential memory access
# - In-place scratchpad reuse to avoid garbage collection pressure
# - Cacheline blocking for problem sizes exceeding L2 capacity
