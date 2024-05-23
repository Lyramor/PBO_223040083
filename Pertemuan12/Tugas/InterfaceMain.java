package Pertemuan12.Tugas;

public class InterfaceMain {
  public static void main(String[] args)  {
      SistemOtentikasi sistemOtentikasi = new SistemOtentikasi("1234", "987654321");

      // Contoh penggunaan otentikasi PIN
      System.out.println("Verifikasi PIN: " + sistemOtentikasi.verifikasiPin("1234")); // Output: true
      System.out.println("Verifikasi PIN: " + sistemOtentikasi.verifikasiPin("4321")); // Output: false

      // Contoh penggunaan otentikasi nomor kartu
      System.out.println("Verifikasi Kartu: " + sistemOtentikasi.verifikasiKartu("987654321")); // Output: true
      System.out.println("Verifikasi Kartu: " + sistemOtentikasi.verifikasiKartu("123456789")); // Output: false

      // Contoh penggunaan otentikasi kombinasi
      System.out.println("Verifikasi Kombinasi: " + sistemOtentikasi.verifikasi()); // Output: true
  }
}
