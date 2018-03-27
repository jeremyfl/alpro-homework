/*
 * Created on Sat Feb 17 2018
 *
 * Copyright (c) 2018 JEREMIAH FERDINAND L (1202174374)
 */

import java.util.Scanner;
import java.util.Random;

public class RIN_WA3_SI4105_1202174374_JEREMIAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber, minNumber, maxNumber, tebakan;

        //  mengatur nilai min dan max random number
        minNumber = 1;
        maxNumber = 50;
        // random number dari nilai min and max di atas
        secretNumber = minNumber + random.nextInt(maxNumber);
        
        for (int garis = 0; garis <= 30; garis++) {
            System.out.print("=");
        }
        System.out.print("\n" + "Program Tebak Angka" + "\n");
        for (int garis = 0; garis <= 30; garis++) {
            System.out.print("=");
        }

        // giving some space
        System.out.println();
        
        do {
            System.out.print("Tebakan anda: ");
            tebakan = input.nextInt();
            
            // indikator untuk hint apakah tebakan terlalu besar atau kecil
            if (tebakan > secretNumber) {
                System.out.println("Tebakan anda terlalu besar.");
            } else if (tebakan < secretNumber) {
                System.out.println("Tebakan anda terlalu kecil.");
            }
            
            // jika tebakan benar
            if (tebakan == secretNumber) {
                System.out.println();
                System.out.println("Selamat, anda berhasil menyelesaikan permainan");
            }
        } while (tebakan != secretNumber);

    }
}