package com.example.jastipin;

public class Notifications {

    private String nama;
    private String aktivitas;

    public Notifications(String nama, String aktivitas) {
        this.nama = nama;
        this.aktivitas = aktivitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }
}
