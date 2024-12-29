/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.streamingoption;

/**
 *
 * @author fathi
 */
import java.util.*;

class Audio {
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

    public static String applyAudioFormat(int pilih) {
        if (pilih >= 1 && pilih <= audioFormat.size()) {
            return audioFormat.get(pilih - 1);
        } else {
            return "Invalid";
        }
    }
}
