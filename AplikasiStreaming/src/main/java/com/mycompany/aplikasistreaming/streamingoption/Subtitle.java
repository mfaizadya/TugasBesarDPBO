/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.streamingoption;

/**
 *
 * @author fathi
 */
import com.mycompany.aplikasistreaming.streamingoption.StreamingOption;
import java.util.*;

class Subtitle extends StreamingOption {
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

    public static String applySubtitle(int pilih) {
        if (pilih >= 1 && pilih <= subtitleLanguage.size()) {
            return subtitleLanguage.get(pilih - 1);
        } else {
            return "Invalid";
        }
    }
}
