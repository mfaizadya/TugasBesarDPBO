/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming.watchparty;

/**
 *
 * @author asus
 */
public class WatchParty {
    private String partyID;
    private String hostUser;
    private int participants;
    private String startTime;
    
    public WatchParty(String partyID, String hostUser, int participants, String startTime) {
        this.partyID = partyID;
        this.hostUser = hostUser;
        this.participants = participants;
        this.startTime = startTime;
    }
    
    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public String getHostUser() {
        return hostUser;
    }

    public void setHostUser(String hostUser) {
        this.hostUser = hostUser;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public void createWatchParty() {
        System.out.println("watch party dibuat dengan ID: " + partyID);
    }

    public void joinParty(String user) throws Exception {
        if (participants >= 50) {
            throw new Exception("Party sudah penuh. Tidak dapat menambah lebih dari 50 peserta.");
        }
        participants++;
        System.out.println(user + " mengikuti party, total peserta: " + participants);
    }

    public void endParty() {
        System.out.println("Watch party dengan ID: " + partyID + " berakhir.");
    }

}
