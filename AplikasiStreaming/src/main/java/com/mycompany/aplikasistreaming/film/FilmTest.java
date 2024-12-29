/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.film;
import com.mycompany.aplikasistreaming.AplikasiStreaming;
import com.mycompany.aplikasistreaming.cast.CastToDeviceTest;
import com.mycompany.aplikasistreaming.streamingoption.StreamingOptionTest;
import com.mycompany.aplikasistreaming.watchparty.WatchPartyTest;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Faiz
 */
public class FilmTest {

    private static String[] args;
    public static void Movie() {
        ArrayList<Film>movieList = new ArrayList<>();
        movieList.add(new Movie("M002", "Bullet Train", "Action", 2022, 127, 7.3, "url_here", true));
        movieList.add(new Movie("M003", "Rush Hour", "Action", 1998, 98, 7.0, "url_here", true));
        movieList.add(new Movie("M004", "Scream", "Horror", 1996, 111, 7.4, "url_here", true));
        movieList.add(new Movie("M005", "Friday The 13th", "Horror", 1980, 95, 6.4, "url_here", true));
        movieList.add(new Movie("M001", "Avengers: Endgame", "Action", 2019, 181, 8.4, "url_here", true));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU FILM ===");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Cari Film Berdasarkan Kata Kunci");
            System.out.println("3. Tonton Film");
            System.out.println("9. Kembali");
            System.out.println("0. Logout");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Lihat daftar film
                    System.out.println("\nDaftar Film:");
                    for (Film film : movieList) {
                        System.out.println(film.getTitle() + " (" + film.getClass().getSimpleName() + ")");
                    }
                    break;

                case 2: // Cari film berdasarkan kata kunci
                    System.out.print("\nMasukkan kata kunci: ");
                    String keyword = scanner.nextLine();
                    boolean found = false;
                    for (Film film : movieList) {
                        String result = film.search(keyword);
                        if (!result.equals("Film tidak ditemukan")) {
                            System.out.println(result);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada film yang cocok dengan kata kunci.");
                    }
                    break;

                case 3: // Tonton film
                    System.out.print("\nMasukkan judul film yang ingin ditonton: ");
                    String title = scanner.nextLine();
                    boolean watched = false;
                    for (Film film : movieList) {
                        if (film.getTitle().equalsIgnoreCase(title)) {
                            film.watch();
                            StreamingOptionTest.main(args); 
                            watched = true;
                            break;
                        }
                        
                    }
                    if (!watched) {
                        System.out.println("Film tidak ditemukan dalam daftar.");
                    }
                    break;
                
                case 9: 
                    AplikasiStreaming.menuUtama();
                    return;

                case 0: 
                    System.out.println("\n@ Logout berhasil. Terima kasih telah menggunakan aplikasi ini!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
    
    public static void Documentary() {
         ArrayList<Film>documentaryList = new ArrayList<>();
        documentaryList.add(new Documentary("D001", "Planet Earth", "Nature", 2006, 90, 9.4, "url_here", "Wildlife", "David Attenborough"));
        documentaryList.add(new Documentary("D002", "The Elephant Queen", "Nature", 2018, 96, 7.8, "url_here", "Wildlife", "Chiwetel Ejiofor"));
        documentaryList.add(new Documentary("D003", "13th", "Politics", 2016, 100, 8.2, "url_here", "Racism", " -"));
        documentaryList.add(new Documentary("D004", "Anthropocene: The Human Epoch", "Nature", 2018, 87, 7.2, "url_here", "Humanity", "Alicia Vikander"));
        documentaryList.add(new Documentary("D005", "The Social Dilemma", "Social", 2020, 94, 7.6, "url_here", "Humanity", " -"));
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU FILM ===");
            System.out.println("1. Lihat Daftar Documentary");
            System.out.println("2. Cari Documentary Berdasarkan Kata Kunci");
            System.out.println("3. Tonton Documentary");
            System.out.println("9. Kembali");
            System.out.println("0. Logout");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Lihat daftar film
                    System.out.println("\nDaftar Documentary:");
                    for (Film film : documentaryList) {
                        System.out.println(film.getTitle() + " (" + film.getClass().getSimpleName() + ")");
                    }
                    break;

                case 2: // Cari film berdasarkan kata kunci
                    System.out.print("\nMasukkan kata kunci: ");
                    String keyword = scanner.nextLine();
                    boolean found = false;
                    for (Film film : documentaryList) {
                        String result = film.search(keyword);
                        if (!result.equals("Documentary tidak ditemukan")) {
                            System.out.println(result);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada documentary yang cocok dengan kata kunci.");
                    }
                    break;

                case 3: // Tonton film
                    System.out.print("\nMasukkan judul documentary yang ingin ditonton: ");
                    String title = scanner.nextLine();
                    boolean watched = false;
                    for (Film film : documentaryList) {
                        if (film.getTitle().equalsIgnoreCase(title)) {
                            film.watch();
                            StreamingOptionTest.main(args);
                            watched = true;
                            break;
                        }
                    }
                    if (!watched) {
                        System.out.println("Documentary tidak ditemukan dalam daftar.");
                    }
                    break;
                    
                case 9: 
                    AplikasiStreaming.menuUtama();
                    return;

                case 0: // Keluar
                    System.out.println("\n@ Logout berhasil. Terima kasih telah menggunakan aplikasi ini!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
        
    }
    
    public static void Series() {
        ArrayList<Film>seriesList = new ArrayList<>();
        seriesList.add(new Series("S001", "The Mandalorian", "Sci-Fi", 2019, 50, 8.5, "url_here", 3, 24));
        seriesList.add(new Series("S002", "Breaking Bad", "Crime, Drama, Thriller", 2008, 47, 9.5, "url_here", 5, 62));
        seriesList.add(new Series("S003", "Game of Thrones", "Action, Adventure, Drama, Fantasy", 2011, 66, 9.2, "url_here", 8, 73));
        seriesList.add(new Series("S004", "Stranger Things", "Drama, Sci-Fi, Fantasy, Horror, Thriller", 2016, 60, 8.7, "url_here", 4, 34));
        seriesList.add(new Series("S005", "Friends", "Comedy, Romance", 1994, 22, 8.9, "url_here", 10, 236));
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU FILM ===");
            System.out.println("1. Lihat Daftar Series");
            System.out.println("2. Cari Series Berdasarkan Kata Kunci");
            System.out.println("3. Tonton Series");
            System.out.println("9. Kembali");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Lihat daftar film
                    System.out.println("\nDaftar Series:");
                    for (Film film : seriesList) {
                        System.out.println(film.getTitle() + " (" + film.getClass().getSimpleName() + ")");
                    }
                    break;

                case 2: // Cari film berdasarkan kata kunci
                    System.out.print("\nMasukkan kata kunci: ");
                    String keyword = scanner.nextLine();
                    boolean found = false;
                    for (Film film : seriesList) {
                        String result = film.search(keyword);
                        if (!result.equals("Series tidak ditemukan")) {
                            System.out.println(result);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada series yang cocok dengan kata kunci.");
                    }
                    break;

                case 3: // Tonton film
                    System.out.print("\nMasukkan judul series yang ingin ditonton: ");
                    String title = scanner.nextLine();
                    boolean watched = false;
                    for (Film film : seriesList) {
                        if (film.getTitle().equalsIgnoreCase(title)) {
                            film.watch();
                            StreamingOptionTest.main(args);
                            watched = true;
                            break;
                        }
                    }
                    if (!watched) {
                        System.out.println("Series tidak ditemukan dalam daftar.");
                    }
                    break;
                    
                case 9:
                    AplikasiStreaming.menuUtama();
                    return;

                case 0: // Keluar
                    System.out.println("\n@ Logout berhasil. Terima kasih telah menggunakan aplikasi ini!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
    