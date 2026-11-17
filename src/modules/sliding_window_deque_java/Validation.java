package com.igorkan.modules.sliding_window_deque_java;

public final class Validation {
    public static void validate(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new Errors.MonotonicDequeException(Errors.ErrorCode.INVALID_INPUT, "invalid array or window k");
        }
    }
}
