/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.recommendation;

import java.util.*;

public class GenreRecommendation extends Recommendation {

    private HashMap<String, ArrayList<String>> genreToFilms; // Pemetaan genre ke daftar film

    public GenreRecommendation(ArrayList<String> films, HashMap<String, ArrayList<String>> genreToFilms) {
        super(films);
        this.genreToFilms = genreToFilms;
    }

    public HashMap<String, ArrayList<String>> getGenreToFilms() {
        return genreToFilms;
    }

    public void setGenreToFilms(HashMap<String, ArrayList<String>> genreToFilms) {
        this.genreToFilms = genreToFilms;
    }

    @Override
    public void showRecommendations(String genre) {
        System.out.println("Rekomendasi Film untuk Genre " + genre + ":");
        if (genreToFilms.containsKey(genre)) {
            for (String film : genreToFilms.get(genre)) {
                System.out.println("- " + film);
            }
        } else {
            System.out.println("Tidak ada rekomendasi untuk genre ini.");
        }
    }
}
