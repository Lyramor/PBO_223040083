package Pertemuan12.Tugas;

public class SistemOtentikasi extends AbstractKelasOtentikasi {

  public SistemOtentikasi(String pin, String nomorKartu) {
      super(pin, nomorKartu);
  }

  @Override
  public boolean verifikasi() {
      // Metode ini bisa dikustomisasi untuk melakukan verifikasi PIN dan nomor kartu
      return verifikasiPin(this.pin) && verifikasiKartu(this.nomorKartu);
  }
}
