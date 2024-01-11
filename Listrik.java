import java.util.Scanner;

public class Listrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pemakaian, tarif, Biaya, biayat, total;

        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan pemakaian: ");
        pemakaian = input.nextDouble();
        
        
        if (pemakaian >= 1 && pemakaian <= 50){
            tarif = 100;
        } else if (pemakaian >= 51 && pemakaian <= 150){
            tarif = 150;
        } else if (pemakaian >= 151 && pemakaian <= 250){
            tarif = 250;
        } else {
            tarif = 300;
        }

        Biaya = pemakaian * tarif;
        biayat = Biaya * 20/100;
        total = Biaya + biayat;

        System.out.println("Menghitung biaya: ");
        System.out.println("Jumlah pemakaian: " + pemakaian);
        System.out.println("Biaya: " + Biaya);
        System.out.println("Biaya tambahan: " + biayat);
        System.out.println("Total: Rp. " + total);

    }
}
