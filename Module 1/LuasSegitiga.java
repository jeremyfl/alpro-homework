import java.util.Scanner;

public class LuasSegitiga {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Alas: ");
    int alas = input.nextInt();

    System.out.print("Masukan Tinggi: ");
    int tinggi = input.nextInt();

    // alas di bagi 2 dan dikali dengan tinggi
    int luas = (alas/2) * tinggi;

    System.out.println("Maka Luas nya adalah " + luas + "cm2");
  }
}