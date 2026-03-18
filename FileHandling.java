package com.file;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Write to file
            FileWriter fw = new FileWriter("data.txt");
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            fw.write(text);
            fw.close();
            System.out.println("Data written successfully!");

            // Read from file
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}