package Pertemuan10.Tugas;

public class Motor extends Kendaraan {
  private int cc;

  public Motor(String merek, String warna, int cc) {
      super(merek, warna);
      this.cc = cc;
  }

  public int getCc() {
      return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

}
