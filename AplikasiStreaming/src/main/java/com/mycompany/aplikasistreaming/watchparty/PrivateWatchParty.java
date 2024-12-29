/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.watchparty;

import com.mycompany.aplikasistreaming.watchparty.WatchParty;

/**
 *
 * @author asus
 */
public class PrivateWatchParty extends WatchParty {
    
    private int invitedUsers;
    
    public PrivateWatchParty(String partyID, String hostUser, int participants, String startTime, int invitedUsers) {
        super(partyID, hostUser, participants, startTime);
        this.invitedUsers = invitedUsers;
    }
    
    public int getInvitedUsers() {
        return invitedUsers;
    }

    public void setInvitedUsers(int invitedUsers) {
        this.invitedUsers = invitedUsers;
    }
    
    public void inviteUsers(int users) throws Exception {
        if (users < 0) {
            throw new Exception("jumlah pengguna yang diundang tidak valid.");
        }
        invitedUsers += users;
        System.out.println(users + " pengguna sudah diundang, total pengguna: " + invitedUsers);
    }

    public void lockParty() {
        System.out.println("party ini terkunci, tidak ada pengguna yang dapat masuk lagi");
    }
}
