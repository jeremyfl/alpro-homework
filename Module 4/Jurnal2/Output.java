/**
 * Output
 *
 * Created on Fri Mar 23 2018
 *
 * Copyright (c) 2018 Jeremy
 */

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           
        // input user
        System.out.print("Masukan Total Buku: ");
        int totalBuku = input.nextInt();

        Buku[] dataBuku = new Buku[totalBuku];

        for (int i = 0; i < totalBuku; i++) {            
            dataBuku[i] = new Buku();

            System.out.print("Judul Buku: ");
            dataBuku[i].judul = input.next();

            System.out.print("Pengarang Buku: ");
            dataBuku[i].pengarang = input.next();

            System.out.print("Jenis Buku: ");
            dataBuku[i].jenis = input.next();

            System.out.println("======");
        }

        System.out.println();

        for (int b = 0; b < totalBuku; b++) {
            System.out.println("Judul Buku: " + dataBuku[b].judul);
            System.out.println("Pengarang Buku: " + dataBuku[b].pengarang);
            System.out.println("Jenis Buku: " + dataBuku[b].jenis);
            System.out.println("===");
        }
    }
}