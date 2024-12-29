/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.cast;

import java.util.*;

public class CastToDevice {
    private String deviceName;
    private boolean isCasting;

    // Constructor
    public CastToDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isCasting = false; // Default: tidak sedang casting
    }

    // Method untuk memulai casting
    public void startCasting() {
        if (!isCasting) {
            isCasting = true;
            System.out.println("Casting dimulai ke perangkat: " + deviceName);
        } else {
            System.out.println("Sudah sedang casting ke perangkat: " + deviceName);
        }
    }

    // Method untuk menghentikan casting
    public void stopCasting() {
        if (isCasting) {
            isCasting = false;
            System.out.println("Casting dihentikan dari perangkat: " + deviceName);
        } else {
            System.out.println("Tidak ada proses casting yang berjalan.");
        }
    }

    // Method untuk memeriksa status casting
    public void checkCastingStatus() {
        if (isCasting) {
            System.out.println("Saat ini sedang casting ke perangkat: " + deviceName);
        } else {
            System.out.println("Tidak ada proses casting yang berjalan.");
        }
    }
    
    
}
