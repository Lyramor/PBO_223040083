package Pertemuan12.Tugas;

public abstract class AbstractKelasOtentikasi implements Otentikasi {
    protected String pin;
    protected String nomorKartu;

    public AbstractKelasOtentikasi(String pin, String nomorKartu) {
            this.pin = pin;
            this.nomorKartu = nomorKartu;
    }

    public boolean verifikasiPin(String pinInput) {
        return pin.equals(pinInput);
    }

    public boolean verifikasiKartu(String nomorKartuInput) {
        return nomorKartu.equals(nomorKartuInput);
    }
}
