package com.prolab.knapsack;

public class KnapSack {

    public void mainApplication() {
        int n = 3;
        if (n % 2 == 0) throw new RuntimeException("n must be odd");

        int[][] magic = new int[n][n];

        int row = n - 1;
        int col = n / 2;
        magic[row][col] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                row = (row - 1 + n) % n;
                // don't change col
            }
            magic[row][col] = i;
        }

        // print results
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magic[i][j] < 10) System.out.print(" ");  // for alignment
                if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }
    }
}
