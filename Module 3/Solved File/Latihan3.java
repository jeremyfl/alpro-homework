/**
 * Latihan 3 (Membuat bintang)
 */

public class Latihan3 {
	public static void main(String args[]) {
		// baris ke bawah
        for (int i = 1; i <= 7; i++) {
			// spasi samping kiri
			for (int b = 0; b <= i ; b++) {
				System.out.print(" ");
			}
			// bintang
			for (int j = i; j <= 7; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			// spasi samping kanan
			for (int b = 0; b <= i; b++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
