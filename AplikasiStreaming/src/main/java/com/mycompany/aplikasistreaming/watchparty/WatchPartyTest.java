/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aplikasistreaming.watchparty;

import com.mycompany.aplikasistreaming.streamingoption.InvalidOption;
import com.mycompany.aplikasistreaming.watchparty.PrivateWatchParty;
import com.mycompany.aplikasistreaming.watchparty.WatchParty;
import com.mycompany.aplikasistreaming.streamingoption.StreamingOptionTest;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class WatchPartyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidOption {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);

        try {
            // Input data for WatchParty
            System.out.println("Enter Watch Party details:");
            System.out.print("Party ID: ");
            String partyID = scanner.nextLine();
            System.out.print("Host User: ");
            String hostUser = scanner.nextLine();
            System.out.print("Number of Participants: ");
            int participants = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Start Time: ");
            String startTime = scanner.nextLine();

            WatchParty watchParty = new WatchParty(partyID, hostUser, participants, startTime);
            watchParty.createWatchParty();

            System.out.print("Enter user to join the party: ");
            String userJoining = scanner.nextLine();
            watchParty.joinParty(userJoining);
            watchParty.endParty();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Input data for PrivateWatchParty
            System.out.println("\nEnter Private Watch Party details:");
            System.out.print("Party ID: ");
            String privatePartyID = scanner.nextLine();
            System.out.print("Host User: ");
            String privateHostUser = scanner.nextLine();
            System.out.print("Number of Participants: ");
            int privateParticipants = scanner.nextInt();
            System.out.print("Number of Invited Users: ");
            int invitedUsers = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Start Time: ");
            String privateStartTime = scanner.nextLine();

            PrivateWatchParty privateParty = new PrivateWatchParty(privatePartyID, privateHostUser, privateParticipants, privateStartTime, invitedUsers);
            privateParty.createWatchParty();

            System.out.print("masukkan jumlah pengguna yang ingin di invite: ");
            int usersToInvite = scanner.nextInt();
            privateParty.inviteUsers(usersToInvite);
            privateParty.lockParty();
            privateParty.endParty();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            StreamingOptionTest.main(args);
        }

        
    }
    
}
