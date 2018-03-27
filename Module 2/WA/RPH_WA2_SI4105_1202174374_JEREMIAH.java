/**
 * BankDaspro
 * Jeremiah Ferdinand L
 * 1202174374
 */
import java.util.Scanner;
public class RPH_WA2_SI4105_1202174374_JEREMIAH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, input_username, input_password;
        int choose;
        long saldo, saldoIn, saldoOut;

        System.out.println("BANK DASPRO");

        // username & password yang benar
        username = "jeremy";
        password = "1202174374";

        System.out.print("Username: ");
        input_username = input.nextLine();

        System.out.print("Password: ");
        input_password = input.nextLine();

        // authentikasi login
        if (input_username.equals(username) && input_password.equals(password)) {
            // authentikasi berhasil, pilih menu
            for (int i = 0; i < 50; i++) {
                System.out.print("=");
            }
            System.out.println("");
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Isi Saldo");
            System.out.println("2. Check Informasi Saldo");
            System.out.println("3. Tarik Uang");
            System.out.println("0. Batal");

            // reset saldo
            saldo = 0;

            // perulangan agar terus di menu kecuali tekan angka 0
            do {
                // pemilihan menu user
                System.out.print("Silahkan memilih menu : ");
                choose = input.nextInt();

                switch (choose) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.print("Masukan Jumlah Penambahan Saldo: ");
                    saldoIn = input.nextLong();

                    // mencegah user bodoh mengisi 0 rupiah
                    if (saldoIn == 0) {
                        System.out.println("Masukan jumlah saldo yang mau ditarik dengan benar");
                    }
                    else {
                        saldo = saldo + saldoIn;
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.println("Saldo anda adalah " + saldo);
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.print("Masukan Jumlah Penarikan Saldo: ");
                    saldoOut = input.nextLong();

                    // mencegah user melakukan penarikan lebih dari saldo awal atau minus saldo
                    if (saldoOut > saldo) {
                        System.out.println("Saldo anda saat ini " + saldo + ", tidak cukup untuk ditarik!");
                    } 
                    // mencegah user bodoh menarik 0 rupiah
                    else if (saldoOut == 0) {
                        System.out.println("Masukan jumlah saldo yang mau ditarik dengan benar");
                    }
                    else {
                        saldo = saldo - saldoOut;
                    }
                    break;
                case 0:
                    for (int i = 0; i < 50; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.println("Terimakasih telah menggunakan bank daspro");
                    break;
                default:
                    System.out.println("Anda tidak memilih menu");
                    break;
                }
            } while (choose != 0);

            System.out.println();

        }
        // jika username dan password salah
        else {
            System.out.println("Username dan Password salah");
        }
    }
}
