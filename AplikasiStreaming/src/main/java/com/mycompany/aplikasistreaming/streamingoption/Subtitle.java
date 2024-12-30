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

public class Subtitle extends StreamingOption {
    private static List<String> subtitleLanguage = new ArrayList<>();

    static {
        subtitleLanguage.add("Indonesia");
        subtitleLanguage.add("Inggris");
        subtitleLanguage.add("Spanyol");
        subtitleLanguage.add("Jepang");
        
    }

    
    public static List<String> getSubtitleLanguage(){
        return subtitleLanguage;
    }

    public static String applySubtitle() {
        Scanner scanner = new Scanner(System.in); 
        boolean running = true;
        int pilih = -1;

        while (running) {
            try {
                System.out.print("Pilih bahasa: ");
                pilih = scanner.nextInt();
                if (pilih < 1 || pilih > subtitleLanguage.size()) {
                    throw new IllegalArgumentException("[Error] Pilih angka 1 sampai " + subtitleLanguage.size() + "!");
                }
                running = false;
            } catch (InputMismatchException e) {
                System.out.println("[Error] Masukkan angka!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return subtitleLanguage.get(pilih - 1);
    }
}
