/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasistreaming;

import com.mycompany.aplikasistreaming.recommendation.GenreRecommendation;
import com.mycompany.aplikasistreaming.cast.CastToDevice;
import com.mycompany.aplikasistreaming.cast.CastToDeviceTest;
import com.mycompany.aplikasistreaming.user.UserManager;
import com.mycompany.aplikasistreaming.subscription.SubscriptionTest;
import com.mycompany.aplikasistreaming.recommendation.GenreRecommendation;
import com.mycompany.aplikasistreaming.recommendation.Recommendation;
import com.mycompany.aplikasistreaming.film.Film;
import com.mycompany.aplikasistreaming.film.Movie;
import com.mycompany.aplikasistreaming.film.Series;
import com.mycompany.aplikasistreaming.film.Documentary;
import com.mycompany.aplikasistreaming.film.FilmTest;

import java.util.*;
/**
 *
 * @author Faiz
 */
public class AplikasiStreaming {

    private static String[] args;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        SubscriptionTest subscriptionTest = new SubscriptionTest();

        //menu login & register
        while (true) {
            System.out.println("===== APLIKASI STREAMING FILM =====");
            System.out.println("Selamat Datang!");
            System.out.println("Pilih menu berikut:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("0. Exit");
            System.out.println("===================================");
            System.out.print("Pilihan: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    try {
                        System.out.print("Masukkan email    : ");
                        String email = scanner.nextLine();
                        System.out.print("Masukkan username : ");
                        String username = scanner.nextLine();
                        System.out.print("Masukkan password : ");
                        String password = scanner.nextLine();

                        userManager.registerUser(email, username, password);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Masukkan email/username : ");
                    String identifier = scanner.nextLine();
                    System.out.print("Masukkan password       : ");
                    String password = scanner.nextLine();

                    if(!userManager.loginUser(identifier, password)) {
                        break;
                    }else {
                        SubscriptionTest.showMenuSubscription();
                        while (true) {
                            System.out.println("\n===== APLIKASI STREAMING FILM =====");
                            System.out.println("Pilih menu berikut:");
                            System.out.println("1. Menuju beranda (Menu utama)");
                            System.out.println("0. Logout");
                            System.out.print("Pilihan: ");
                            String choice2 = scanner.nextLine();

                            switch (choice2) {
                                case "1":
                                    menuUtama();
                                    break;

                                case "0":
                                    System.out.println("@ Logout berhasil. Terima kasih telah menggunakan aplikasi!");
                                    System.exit(0);
                                    break;
                            }
                           break; 
                        } 
                    }
                case "0":

                    System.out.println("@ Terima kasih telah menggunakan aplikasi!");
                    scanner.close();
                    return;

                default:
                    System.out.println("[Error]: Silahkan masukkan nomor menu yang benar!");
                    break;
            }
        }
 
    }
    
    public static void menuUtama() {
      Scanner scanner = new Scanner(System.in);
      while (true) {
            System.out.println("===== APLIKASI STREAMING FILM =====");
            System.out.println("->MENU UTAMA<-");
            ArrayList<String> recFilms = new ArrayList<>();
            recFilms.add("Bullet Train");
            recFilms.add("Rush Hour");
            recFilms.add("Scream");
            recFilms.add("Friday The 13th");

            // Pemetaan genre ke film
            ArrayList<String> actionFilms = new ArrayList<>();
            actionFilms.add("Bullet Train");
            actionFilms.add("Rush Hour");
            ArrayList<String> horrorFilms = new ArrayList<>();
            horrorFilms.add("Scream");
            horrorFilms.add("Friday The 13th");
            ArrayList<String> comedyFilms = new ArrayList<>();
            comedyFilms.add("Bullet Train");
            comedyFilms.add("Rush Hour");
            
            HashMap<String, ArrayList<String>> genreToFilms = new HashMap<>();
            genreToFilms.put("Action", actionFilms);
            genreToFilms.put("Horror", horrorFilms);
            genreToFilms.put("Comedy", comedyFilms);
            
            // Membuat objek GenreRecommendation
            GenreRecommendation recommendation = new GenreRecommendation(recFilms, genreToFilms);

            // Menampilkan semua film
            recommendation.showAllRecommendedFilms();

            // Menampilkan rekomendasi berdasarkan genre
            recommendation.showRecommendations("Action");
            recommendation.showRecommendations("Horror");
            recommendation.showRecommendations("Comedy");
            recommendation.showRecommendations("Drama"); // Contoh untuk test case genre yang tidak ada
            
            System.out.println("Pilih Apa yang ingin ditonton:");
            System.out.println("1. Movie");
            System.out.println("2. Series");
            System.out.println("3. Documentary");
            System.out.println("0. Logout");
            System.out.println("===================================");
            System.out.print("Pilihan : ");

            String choice = scanner.nextLine();
            
            switch (choice) {
                
                case "1":
                    FilmTest.Movie();
                    return;
                case "2":
                    FilmTest.Series();
                    CastToDeviceTest.main(args);
                    return;
                case "3":
                    FilmTest.Documentary();
                    CastToDeviceTest.main(args);
                    return;
                case "0":
                    System.out.println("Logout berhasil. Terima kasih telah menggunakan aplikasi!");
                    System.exit(0);
                    return;
                default:
                    System.out.println("[Error] : Silahkan masukkan nomer menu yang benar");
            }
        }
    }
    
}
    
    
    


