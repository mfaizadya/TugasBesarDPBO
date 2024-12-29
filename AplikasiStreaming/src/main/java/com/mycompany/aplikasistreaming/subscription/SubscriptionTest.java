/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.subscription;

//MAIN SUBSCRIPTION

import com.mycompany.aplikasistreaming.subscription.PremiumSub;
import com.mycompany.aplikasistreaming.subscription.StandardSub;
import com.mycompany.aplikasistreaming.subscription.Subscription;
import java.util.*;


public class SubscriptionTest {
  public static void showMenuSubscription() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU SUBSCRIPTION =====");
            System.out.println("1. Pilih subscription");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showSubscriptionOptions();
                    return;

                case "0":
                    System.out.println("@ Logout berhasil. Terima kasih telah menggunakan aplikasi!");
                    System.exit(0);
                    return;

                default:
                    System.out.println("[Error]: Pilih nomor yang valid!");
            }
        }
    }

    public static void showSubscriptionOptions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== PILIHAN PAKET SUBSCRIPTION =====");
        System.out.println("1. Standard (1080p, 2 device) - Rp. 50.000");
        System.out.println("2. Premium (4K, 5 device) - Rp. 100.000");
        System.out.print("Pilih paket: ");
        String paket = scanner.nextLine();

        Subscription subscription = null;

        switch (paket) {
            case "1":
                subscription = new StandardSub("S001", "Standard", "01-01-2024", "01-02-2024", 50000, "1080p", 2);
                break;

            case "2":
                subscription = new PremiumSub("P002", "Premium", "01-01-2024", "01-02-2024", 100000, "4K", 5);
                break;

            default:
                System.out.println("[Error]: Paket tidak tersedia!");
                return;
        }

        confirmSubscription(scanner, subscription);
    }

    private static void confirmSubscription(Scanner scanner, Subscription subscription) {
        while (true) {
            System.out.println("\n===== APLIKASI STREAMING FILM =====");
            System.out.println("Apakah anda yakin memilih paket " + subscription.planType + "?");
            System.out.println("1. Ya");
            System.out.println("2. Kembali");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    finalizeSubscription(subscription);
                    return;

                case "2":
                    showSubscriptionOptions();
                    return;

                case "0":
                    System.out.println("@ Logout berhasil. Terima kasih telah menggunakan aplikasi!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("[Error]: Pilih nomor yang valid!");
            }
        }
    }

    private static void finalizeSubscription(Subscription subscription) {
        System.out.println("\n===== APLIKASI STREAMING FILM =====");
        System.out.println("Selamat! Anda berhasil berlangganan paket " + subscription.planType + "!");
        subscription.choosePlan();
        if (subscription instanceof StandardSub) {
            ((StandardSub) subscription).applyStandardFeatures();
        } else if (subscription instanceof PremiumSub) {
            ((PremiumSub) subscription).applyPremiumFeatures();
        }
    }

    
}
