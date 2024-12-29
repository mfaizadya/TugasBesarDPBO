/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasistreaming.cast;

import com.mycompany.aplikasistreaming.streamingoption.StreamingOptionTest;
import java.util.*;

public class CastToDeviceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama perangkat untuk casting: ");
        String deviceName = scanner.nextLine();
        CastToDevice castToDevice = new CastToDevice(deviceName);
        
        //gambaran menu CastToDevice
        while (true) {
            System.out.println("\n--Cast to Device menu--");
            System.out.println("1. Mulai Casting");
            System.out.println("2. Hentikan Casting");
            System.out.println("3. Cek Status Casting");
            System.out.println("4. Lanjut");
            System.out.print("Pilih opsi: ");
            String choiceCTD = scanner.nextLine();
            switch (choiceCTD) {
                case "1":
                    castToDevice.startCasting();
                    break;
                case "2":
                    castToDevice.stopCasting();
                    break;
                case "3":
                    castToDevice.checkCastingStatus();
                    break;
                case "4":
                    StreamingOptionTest.main(args);
                    break;
                default:
                    System.out.println("[Error] Pilihan tidak valid. Silakan input kembali lagi.");
                    break;
            }
        }
    }
}
