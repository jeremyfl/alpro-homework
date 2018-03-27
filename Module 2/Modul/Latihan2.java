import java.util.Scanner;

/**
 *
 * @author jeremylombogia
 */
public class Latihan2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Silahkan Pilih Menu :");
        System.out.println("> S1 Sistem Informasi (kata kunci = SI)");
        System.out.println("> S1 Teknik Telekomunikasi (kata kunci = TT)");
        System.out.println("> S1 Sistem Komputer (kata kunci = SK)");
        
        System.out.println();
        System.out.print("Pilih Menu: ");
        String pilihanJunet = input.nextLine();
        
        for (int i = 0; i < 50; i++) {System.out.print("=");}
        System.out.println();
        
        
        // switch case masing-masing jurusan
        switch(pilihanJunet) {
            case "SI":
                char akreditasiSI = 'B';
                System.out.println("S1 Sistem Informasi");
                System.out.println("Satu Hati Selalu Di Depan");
                System.out.println("Akreditasi : Always " + akreditasiSI);
            break;
            case "TT":
                System.out.println("S1 Teknik Telekomunikasi");
                System.out.println("Pertama, Terbaik, Salam Teknik Telekomunikasi");
            break;
            case "SK":
                System.out.println("S1 Sistem Komputer");
                System.out.println("Turn on the future");
            break;
            default:
                System.out.println("Junet tidak memilih jurusan, mulung saja gan");
        }
    }
}
