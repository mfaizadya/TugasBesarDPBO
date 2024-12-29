/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.user;
import com.mycompany.aplikasistreaming.user.User;
import java.util.HashMap;
/**
 *
 * @author Faiz
 */
public class UserManager {
    private HashMap<String, User> usersByEmail = new HashMap<>(); 
    private HashMap<String, User> usersByUsername = new HashMap<>();
    
    public void registerUser(String email, String username, String password) {
        if (email == null || email.isEmpty() || username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("[Error]: Inputan tidak boleh kosong!");
        }

        if (usersByEmail.containsKey(email) || usersByUsername.containsKey(username)) {
            throw new IllegalArgumentException("[Error]: Email atau Username sudah terdaftar!");
        }

        User newUser = new User(email, username, password);
        usersByEmail.put(email, newUser);
        usersByUsername.put(username, newUser);

        System.out.println("Berhasil mendaftarkan akun!");
    }

    public boolean loginUser(String identifier, String password) {
        User user = usersByEmail.getOrDefault(identifier, usersByUsername.get(identifier));

        if (user == null || !user.login(identifier, password)) {
            System.out.println("[Error]: Akun belum terdaftar atau password salah!");
            return false;
        }

        System.out.println("Berhasil login akun!");
        return true;
    }
}

