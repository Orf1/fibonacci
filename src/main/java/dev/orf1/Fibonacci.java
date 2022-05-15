package dev.orf1;

public class Fibonacci {
    private long[] cache;

    public long get(int n) {
        if (cache == null || cache.length < n + 1) {
            cache = new long[n+1];
        }

        if (n <= 1) {
            return n;
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        long fib = (get(n - 1) + get(n - 2));
        cache[n] = fib;

        return fib;
    }
}