/**
 * BukuDinamis
 *
 * Created on Fri Mar 23 2018
 *
 * Copyright (c) 2018 Jeremy
 */
import java.util.Scanner;
import java.util.ArrayList;

public class BukuDinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> judulBuku = new ArrayList<String>();
        ArrayList<String> pengarangBuku = new ArrayList<String>();
        ArrayList<String> jenisBuku = new ArrayList<String>();
        
        judulBuku.add("Judul1");
        pengarangBuku.add("Pengarang 1");
        jenisBuku.add("Jenis 1");

        judulBuku.add("Judul 2");
        pengarangBuku.add("Pengarang 2");
        jenisBuku.add("Jenis 2");

        judulBuku.add("Judul 3");
        pengarangBuku.add("Pengarang 3");
        jenisBuku.add("Jenis 3");
        
        // fungsi hapus buku
        System.out.print("Masukan Buku yang mau di hapus: ");
        int hapusBuku = input.nextInt();
        judulBuku.remove(hapusBuku);
        pengarangBuku.remove(hapusBuku);
        jenisBuku.remove(hapusBuku);

        System.out.println();
        System.out.println("Daftar buku saya");

        for (int i = 0; i < judulBuku.size(); i++) {
            System.out.println(judulBuku.get(i));
            System.out.println(pengarangBuku.get(i));
            System.out.println(jenisBuku.get(i));
        }
        
        System.out.println("Jumlah buku akhir" + judulBuku.size());

    }   
}