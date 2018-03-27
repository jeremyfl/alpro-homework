/**
 * LaguAsep
 */

import java.util.ArrayList;

public class LaguAsep {
    public static void main(String[] args) {
        ArrayList<String> laguJudul = new ArrayList<String>();
        ArrayList<String> laguRilis = new ArrayList<String>();
        ArrayList<String> lagiPenyanyi = new ArrayList<String>();

        // fungsi untuk menambahkan lagu
        laguJudul.add("Lost Star");
        laguRilis.add("2015");
        lagiPenyanyi.add("Adam Levine");

        laguJudul.add("All I Want");
        laguRilis.add("2015");
        lagiPenyanyi.add("Kodaline");

        laguJudul.add("Unknown Song");
        laguRilis.add("2015");
        lagiPenyanyi.add("Unknown");

        // fungsi untuk menghapus lagu
        laguJudul.remove("Unknown Song");
        laguRilis.remove("2015");
        lagiPenyanyi.remove("Unknown");

        System.out.println("Daftar Lagu Favorit Asep");
        System.out.println("==================================================");

        for (int i = 0; i < laguJudul.size(); i++) {
            System.out.println("Judul: " + laguJudul.get(i));
            System.out.println("Rilis: " + laguRilis.get(i));
            System.out.println("Penyanyi: " + lagiPenyanyi.get(i));
            System.out.println();
        }

    }
}