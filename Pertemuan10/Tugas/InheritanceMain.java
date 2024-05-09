package Pertemuan10.Tugas;

public class InheritanceMain {
  public static void main(String[] args) {
    Motor motor = new Motor("Honda", "Merah", 150);
    
    System.out.println("Merek Motor: " + motor.getMerek());
    System.out.println("Warna Motor: " + motor.getWarna());
    System.out.println("CC Motor: " + motor.getCc());
}
}
