/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.film;

import com.mycompany.aplikasistreaming.film.Film;
import com.mycompany.aplikasistreaming.streamingoption.StreamingOptionTest;
import com.mycompany.aplikasistreaming.watchparty.WatchPartyTest;

/**
 *
 * @author fikri
 */
public class Movie extends Film {
    private boolean isBoxOffice;
    private String[] args;

    public Movie(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, boolean isBoxOffice) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.isBoxOffice = isBoxOffice;
    }

    // Overridden method
    @Override
    public void watch() {
        try {
            if (getTitle() == null || getTitle().isEmpty()) {
                throw new IllegalArgumentException("Film tidak ditemukan!");
            }
            System.out.println("Menonton Film: " + getTitle());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Sedang menonton film: " + getTitle());
            
            //WatchPartyTest.main(args);
        }
    }

   
    public void watchingMovie(String title, boolean isHD, String language) {
        try {
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Film tidak ditemukan!");
            }
            String quality = isHD ? "in HD" : "in SD";
            System.out.println("Menonton Film " + title + " " + quality + " dengan audio dalam bahasa " + language);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Selesai mencoba untuk menonton film.");
        }
    }
}
