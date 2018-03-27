/**
 * FileProcess
 */
import java.io.File;

public class FileProcess {
    public static void main(String[] args) {
        File file = new File ("java.txt");
        
        try {
            file.createNewFile();
        } catch(Exception e) {
            System.out.println("Gagal membuat file" + file.getPath());
        }
        
    }
}