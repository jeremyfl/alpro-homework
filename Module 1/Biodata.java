import java.util.Scanner;

public class Biodata {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  String nama = "";
  int huruf = 5;
  float 

  System.out.print("NAMA: ");
  String Nama = input.nextLine();

  System.out.print("NIM: ");
  long Nim = input.nextLong();

  System.out.print("KELAS: ");
  String Kelas = input.nextLine();

  input.nextLine(); // tambah line setelah number

  System.out.print("NILAI KALKULUS: ");
  int NilaiKalkulus = input.nextInt();

  System.out.print("NILAI LITIK: ");
  int NilaiLitik = input.nextInt();

  System.out.print("NILAI MATDIS: ");
  int NilaiMatdis = input.nextInt();

  System.out.print("RATA-RATA NILAI: ");
  int RataRata = input.nextInt();

  }
}
