/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.streamingoption;

/**
 *
 * @author fathi
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Quality extends StreamingOption{
    private static List<String> resolution = new ArrayList<>();
    
    static {
        resolution.add("480p");
        resolution.add("720p");
        resolution.add("1080p");
        resolution.add("1440p");
        resolution.add("4K");
    }

    public static List<String> getResolution() {
        return resolution;
    }

    public static String applyResolution(){
        Scanner scanner = new Scanner(System.in); 
        boolean running = true;
        int pilih = -1;

        while (running) {
            try {
                System.out.print("Pilih resolusi: ");
                pilih = scanner.nextInt();
                if (pilih < 1 || pilih > resolution.size()) {
                    throw new IllegalArgumentException("[Error] Pilih angka 1 sampai " + resolution.size() + "!");
                }
                running = false;
            } catch (InputMismatchException e) {
                System.out.println("[Error] Masukkan angka!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return resolution.get(pilih - 1);
    }
}
