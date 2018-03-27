/**
 * Hotel
 */

public class Hotel {
    public static void main(String[] args) {
        String[][] hotelAsep = {
            {"Regular", "250000"},
            {"VIP", "40000"},
            {"VVIP", "70000"},
            {"Executive", "99999"},
            {"Luxury", "2500000"}
        };

        for (int g = 0; g < 50; g++) {System.out.print("=");}
        System.out.println();
        System.out.println("Daftar Harga Kamar Hotel Alexis");

        for (int i = 0; i < hotelAsep.length; i++) {
            System.out.printf("%d. %s  \t: Rp.%5s \n", (i+1), hotelAsep[i][0], hotelAsep[i][1]);
        }
    }
}