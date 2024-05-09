package Pertemuan10.Tugas;

public class Kendaraan {
    protected String merek;
    protected String warna;

    public Kendaraan(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
