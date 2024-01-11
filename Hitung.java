import java.util.Scanner;

public class Hitung {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang, volume, luas, tinggi, lebar;

        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextDouble();
        

        volume = panjang * lebar * tinggi;
        luas = panjang * lebar;

        System.out.println("Volume = " + volume + "cm3");
        System.out.println("Luas = " + luas + "cm2");
    }
}
