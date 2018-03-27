/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author jeremylombogia
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Digit angka terakhir nim: ");
        int nim = input.nextInt();
        
        if (nim % 2 == 0) {
            System.out.println("NIM kamu genap, maka kamu mendapat tipe soal A");
        }
        else {
            System.out.println("NIM kamu ganjil, maka kamu mendapat tipe soal B");
        }
    }
    
}
