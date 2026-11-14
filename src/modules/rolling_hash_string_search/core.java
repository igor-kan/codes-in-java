/**
 * @file core.java
 * @brief Substring matching algorithm for 64-Bit Polynomial Rolling Hash Substring Locator.
 * Module: rolling_hash_string_search
 */

#include "types.java"
#include <string.h>

int rolling_hash_string_search_search(const char* text, size_t t_len, const char* pat, size_t p_len) {
    if (!text || !pat || p_len == 0 || t_len < p_len) return -1;
    for (size_t i = 0; i <= t_len - p_len; ++i) {
        if (memcmp(text + i, pat, p_len) == 0) return (int)i;
    }
    return -1;
}
