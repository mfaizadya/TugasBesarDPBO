/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.film;

import com.mycompany.aplikasistreaming.film.Film;

/**
 *
 * @author fikri
 */
public class Series extends Film {
    private int numOfSeason;
    private int episodes;

    public Series(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, int numOfSeason, int episodes) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.numOfSeason = numOfSeason;
        this.episodes = episodes;
    }

    // Overridden method
    @Override
    public void watch() {
         try {
            if (getTitle() == null || getTitle().isEmpty()) {
                throw new IllegalArgumentException("Film tidak ditemukan!");
            }
            System.out.println("Menonton Series: " + getTitle());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Selesai mencoba untuk menonton series.");
        }
    }

    
    public void watchingSeries(String title, int season, int episode) {
         try {
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Series tidak ditemukan!");
            }
            System.out.println("Menonton Series " + title + " Season " + season + ", Episode " + episode);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Selesai mencoba untuk menonton series.");
        }
    }
}
