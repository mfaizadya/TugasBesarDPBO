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

class Quality {
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

    public static String applyResolution(int pilih) {
        if (pilih >= 1 && pilih <= resolution.size()) {
            return resolution.get(pilih - 1);
        } else {
            return "Invalid";
        }
    }
}
