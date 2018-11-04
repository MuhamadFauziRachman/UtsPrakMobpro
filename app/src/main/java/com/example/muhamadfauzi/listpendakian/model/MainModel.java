package com.example.muhamadfauzi.listpendakian.model;

public class MainModel {
    private String nama,  deskTim;
    private int gambarTim;

    public MainModel(String nama, String deskTim, int gambarTim) {
        this.nama = nama;
        this.deskTim = deskTim;
        this.gambarTim = gambarTim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskTim() {
        return deskTim;
    }

    public void setDeskTim(String deskTim) {
        this.deskTim = deskTim;
    }

    public int getGambarTim() {
        return gambarTim;
    }

    public void setGambarTim(int gambarTim) {
        this.gambarTim = gambarTim;
    }
}
