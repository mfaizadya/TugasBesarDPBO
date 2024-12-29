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
public class Documentary extends Film {
    private String subject;
    private String narrator;

    public Documentary(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, String subject, String narrator) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.subject = subject;
        this.narrator = narrator;
    }

    // Overridden method
    @Override
    public void watch() {
        try {
            if (getTitle() == null || getTitle().isEmpty()) {
                throw new IllegalArgumentException("Film tidak ditemukan!");
            }
            System.out.println("Menonton Documentary: " + getTitle());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Selesai mencoba untuk menonton documentary.");
        }
    }

    
    public void watchingDocumentary(String title, String subject) {
        try {
            if (title == null || title.isEmpty() || subject == null || subject.isEmpty()) {
                throw new IllegalArgumentException("Film atau subjek tidak valid!");
            }
            System.out.println("Menonton Documentary " + title + " tentang " + subject + " dengan narator " + narrator);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Selesai mencoba untuk menonton documentary.");
        }
    }
}
