/**
/*
 * Created on Sun Mar 25 2018
 *
 * Copyright (c) 2018 Jeremy
 */

import java.util.Scanner;
import java.util.ArrayList;

public class RPH_WA4_SI4105_1202174374_JEREMIAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define kota and kandidat as arraylist
        ArrayList<String> kandidat = new ArrayList<String>();
        ArrayList<String> voteJakarta = new ArrayList<String>();
        ArrayList<String> voteMeikarta = new ArrayList<String>();
        
        int pilihanKota, pilihanMenu;
        String namaKandidat;
        
        do {
            System.out.println("=======================================================");
            System.out.println("Anda memiliki dua pilihan menu \n 1. Laporan (Sebagai Atasan) \n 2. Voting (Sebagai Kandidat) \n 0. Exit");
            System.out.print("Pilih Menu: ");
            pilihanMenu = input.nextInt();
            System.out.println("=======================================================");

            switch (pilihanMenu) {
                case 1:

                    System.out.println("Total pemilih Jakarta: " + voteJakarta.size());
                    System.out.println("Total pemilih Meikarta: " + voteMeikarta.size());
                    System.out.println("Total kandidat: " + (voteJakarta.size() + voteMeikarta.size()));
                    System.out.println();
                    
                    System.out.println("| Kandidat Pemilih Jakarta |");
                    // jika kandidat kososong tidak di tampilkan
                    if (voteJakarta.isEmpty()) {
                        System.out.println("| Belum ada kandidat pemilih Jakarta |");
                    }
                    else {
                        for (int i = 0; i < voteJakarta.size(); i++) {
                            System.out.printf("%d. %s", (i+1), voteJakarta.get(i));
                            System.out.println();
                        }
                    }

                    System.out.println();

                    System.out.println("| Kandidat Pemilih Meikarta |");
                    // jika kandidat kososong tidak di tampilkan
                    if (voteMeikarta.isEmpty()) {
                        System.out.println("| Belum ada kandidat pemilih Meikarta |");
                    } 
                    else {
                        for (int m = 0; m < voteMeikarta.size(); m++) {
                        System.out.printf("%d. %s", (m+1), voteMeikarta.get(m));
                        System.out.println();
                        }
                    }

                    System.out.println();
                    break;
                case 2:
                    // VOTE KOTA
                    // input nama kandidat
                    System.out.print("Nama Kandidat: ");
                    namaKandidat = input.next();

                    kandidat.add(namaKandidat);
                    do {           
                        // input pilihan kota dari kandidat 
                        System.out.println("Anda memiliki dua pilihan kota \n 1. Jakarta \n 2. Meikarta");
                        System.out.print("Pilihan Kota:");
            
                        pilihanKota = input.nextInt();
            
                    } while (pilihanKota != 1 && pilihanKota != 2);
            
                    switch (pilihanKota) {
                        case 1:
                            System.out.println("Anda memilih untuk vote Jakarta!");  
                            voteJakarta.add("namaKandidat");
                            
                            break;
                        case 2:
                            System.out.println("Anda memilih untuk vote Meikarta!");
                            voteMeikarta.add("namaKandidat");

                            break;
                    }
                    // END VOTE KOTA
                    break;
                default:
                    break;
            }

        } while (pilihanMenu != 0);

        System.out.println("Thanks for using this simple application");

    }
}