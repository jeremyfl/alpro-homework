/**
 * SOLVED_MODUL5_JEREMIAHFERDINANDL_1202174374_SI4105.java
 *
 * Created on Tue Mar 27 2018
 *
 * Copyright (c) 2018 Jeremy
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class SOLVED_MODUL5_JEREMIAHFERDINANDL_1202174374_SI4105 {
    public static void main(String[] args) {
			
			// declare filename and make dirs
			String fileName = "database/pesanan.bat";
			File database = new File(fileName);
			database.getParentFile().mkdirs();

			Scanner input = new Scanner(System.in);
			FileReader fileShow = null;

			// jika file tidak tersedia maka membuat database baru
			if (!database.exists()) {
				try {
					database.createNewFile();
				} catch (Exception e) {
					System.err.println("Failed to create the file");
				}
			}

			// read data
			try {
				fileShow = new FileReader(database);
				BufferedReader bufferRead = new BufferedReader(fileShow);

				System.out.println("Pesanan hari ini: ");
				String text;
				while ((text = bufferRead.readLine()) != null) {
					System.out.println(text);
				}

			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println();

			// write data
			try {
				String command = "";
				PrintWriter fileStore = new PrintWriter(new FileWriter(database, true));
				
				do {
					System.out.print("Tambah Menu Makanan: ");
					command = input.nextLine();

					// jika tidak pesan maka disimpan, sebaliknya.
					if (!command.equals("pesan")) {
						fileStore.write(command);
						fileStore.println();
					}
				} while (!command.equals("pesan"));
				
				fileStore.close();
				System.out.println("Pesanan sudah dibuat!");
			} catch (Exception evt) {
				System.out.println(evt);
			}	

    }
}