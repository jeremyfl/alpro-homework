/**
 * Latihan 2 (Tebak Tebakan)
 */
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilanganPertama, bilanganKedua, tebakan, jawaban;

        System.out.print("Masukan Bilangan Pertama: ");
        bilanganPertama = input.nextInt();

        System.out.print("Masukan Bilangan Kedua: ");
        bilanganKedua = input.nextInt();

        // melakukan perintah dibawah selama kondisi jawaban belum terpenuhi
        do {
            System.out.print("Masukan Tebakan anda: ");
            tebakan = input.nextInt();

            // jawaban adalah bilangan pertama di kali bilangan kedua
            jawaban = bilanganPertama * bilanganKedua;

            // jika tebakan salah maka keluar seperti berikut
            if (tebakan != jawaban) {
                System.out.println("jawaban anda salah!");
            }

        } while (tebakan != jawaban);

        System.out.println("Jabawan anda benar!");
    }
}