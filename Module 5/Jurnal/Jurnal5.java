/**
 * Jurnal5
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Jurnal5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String asepInput, asepInputData;

        // membuat file
        File file = new File("database/catatan.bat");
        file.getParentFile().mkdirs();   
        
        try {
            // in case file wans't exit
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("Tugas Asep: ");
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(br.readLine());
            }

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Tidak ada file");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        
        try {
            PrintWriter cetak = new PrintWriter(new FileWriter(file, true));
            
            System.out.print("Tulis apa saja:");
            do {
                asepInputData = input.next();
                cetak.write(asepInputData);

            } while (!asepInputData.equals("save"));

            cetak.close();
            
        } catch (IOException e) {
            System.out.println("Error : " + e);
        } 

    }
}
