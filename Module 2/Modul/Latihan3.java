import java.util.Scanner;

/**
 *
 * @author jeremylombogia
 */
public class Latihan3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String nama, nilai, status;
        int nim, inputNilai;
        
        System.out.printf("Masukan Nama: ");
        nama = input.nextLine();
        
        System.out.printf("Masukan NIM: ");
        nim = input.nextInt();
        
        // input nilai angka
        System.out.printf("Masukan Nilai: ");
        inputNilai = input.nextInt();
        
        // reset nilai && reset lulus
        nilai = null;
        
        // perhitungan nilai  
        if (inputNilai >= 80) {
            nilai = "A";
        }
        else if (inputNilai > 70) {
            nilai = "AB";
        }
        else if (inputNilai > 65 && inputNilai <= 70) {
            nilai = "B";
        }
        else if (inputNilai > 60 && inputNilai <= 65) {
            nilai = "BC";
        }
        else if (inputNilai > 50 && inputNilai <= 60) {
            nilai = "C";
        }
        else if (inputNilai > 40 && inputNilai <= 50) {
            nilai = "D";
        }
        else if (inputNilai <= 40) { // atau bisa juga dengan else
            nilai = "E";
        }
        
        // indikator kelulusan
        if (nilai.equals("E")) {status = "TIDAK LULUS";}
        else {status = "LULUS";}
 
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        
        System.out.println("Nilai Angka: " + inputNilai);
        System.out.println("Nilai Huruf: " + nilai);
        
        // ternary operator sucks
        System.out.println("Status: " + status);
    }
}
