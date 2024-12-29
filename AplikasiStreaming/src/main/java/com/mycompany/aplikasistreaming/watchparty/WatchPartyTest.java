/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aplikasistreaming.watchparty;

import com.mycompany.aplikasistreaming.watchparty.PrivateWatchParty;
import com.mycompany.aplikasistreaming.watchparty.WatchParty;

/**
 *
 * @author asus
 */
public class WatchPartyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            WatchParty watchParty = new WatchParty("WP001", "Alice", 49, "2024-12-12 18:00");
            watchParty.createWatchParty();
            watchParty.joinParty("Bob");
            watchParty.joinParty("John");
            watchParty.endParty();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            
            PrivateWatchParty privateParty = new PrivateWatchParty("PWP001", "Charlie", 5, "2024-12-12 20:00", 3);
            privateParty.createWatchParty();
            privateParty.inviteUsers(2);
            privateParty.inviteUsers(-1);
            privateParty.lockParty();
            privateParty.endParty();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
