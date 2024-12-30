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

public class Audio extends StreamingOption {
    private static List<String> audioFormat = new ArrayList<>();

    static {
        audioFormat.add("Stereo");
        audioFormat.add("Dolby");
        audioFormat.add("7.1 Surround");
        audioFormat.add("DTS");
    }

    public static List<String> getAudioFormat() {
        return audioFormat;
    }

    public static String applyAudioFormat() {
        Scanner scanner = new Scanner(System.in); 
        boolean running = true;
        int pilih = -1;

        while (running) {
            try {
                System.out.print("Pilih format audio: ");
                pilih = scanner.nextInt();
                if (pilih < 1 || pilih > audioFormat.size()) {
                    throw new IllegalArgumentException("[Error] Pilih angka 1 sampai " + audioFormat.size() + "!");
                }
                running = false;
            } catch (InputMismatchException e) {
                System.out.println("[Error] Masukkan angka!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return audioFormat.get(pilih - 1);
    }
}
