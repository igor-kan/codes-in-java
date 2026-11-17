package com.igorkan.modules.sliding_window_deque_java;

public final class Core implements Contract {
    @Override
    public Types.WindowExtrema compute(int[] arr, int k) {
        Validation.validate(arr, k);
        int n = arr.length;
        int outLen = n - k + 1;
        int[] mins = new int[outLen];
        int[] maxs = new int[outLen];
        int[] dqMin = new int[n];
        int[] dqMax = new int[n];
        int hMin = 0, tMin = 0, hMax = 0, tMax = 0;
        for (int i = 0; i < n; i++) {
            while (hMin < tMin && dqMin[hMin] <= i - k) hMin++;
            while (hMin < tMin && arr[dqMin[tMin - 1]] >= arr[i]) tMin--;
            dqMin[tMin++] = i;

            while (hMax < tMax && dqMax[hMax] <= i - k) hMax++;
            while (hMax < tMax && arr[dqMax[tMax - 1]] <= arr[i]) tMax--;
            dqMax[tMax++] = i;

            if (i + 1 >= k) {
                int w = i - k + 1;
                mins[w] = arr[dqMin[hMin]];
                maxs[w] = arr[dqMax[hMax]];
            }
        }
        return new Types.WindowExtrema(mins, maxs);
    }
}
