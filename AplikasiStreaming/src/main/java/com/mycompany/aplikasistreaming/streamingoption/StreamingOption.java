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

public class StreamingOption {
    private String streamOptID;
    private String quality = "480p";
    private String audio = "Stereo";
    private String subtitle = "Indonesia";

    public void chooseQuality(String quality) {
        this.quality = quality;
        System.out.println("Mengubah resolusi ke " + quality);
    }

    public void chooseAudio(String audio) {
        this.audio = audio;
        System.out.println("Mengubah format audio ke " + audio);
    }

    public void chooseSubtitle(String subtitle) {
        this.subtitle = subtitle;
        System.out.println("Mengubah subtitle ke bahasa " + subtitle);
    }

    public String getQuality() {
        return quality;
    }

    public String getAudio() {
        return audio;
    }

    public String getSubtitle() {
        return subtitle;
    }
    
}
