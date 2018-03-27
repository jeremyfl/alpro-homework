/**
 * Matriks
 *
 * Created on Fri Mar 23 2018
 *
 * Copyright (c) 2018 Jeremy
 */

public class Matriks {
    public static void main(String[] args) {
        int matriks[][] = {
            {0, 0, 0},
            {4, 0, 0},
            {0, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(matriks[i][b]);
            }
            System.out.println();
        }
    }
}