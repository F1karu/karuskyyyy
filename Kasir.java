import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double bukuTulis, pensil, penghapus, penggaris;
        bukuTulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;
        
        System.out.println( "Masukkan Jumlah beli Buku Tulis: ");
        double jumlahBuku= input.nextDouble();
        double total=jumlahBuku*bukuTulis;
        
        System.out.println( "Masukkan Jumlah Pensil: ");
        double jumlahPensil= input.nextDouble();
        total +=jumlahPensil*pensil;
        
        System.out.println( "Masukkan Jumlah Penggaris: ");
        double jumlahPenggaris= input.nextDouble();
        total += jumlahPenggaris*penggaris;
        
        System.out.println( "Masukkan Jumlah Penggaris: ");
        double jumlahPenghapus= input.nextDouble();
        total += jumlahPenghapus*penghapus;
        
        System.out.println( "Masukkan Pembayaran: ");
        
        double bayar=input.nextDouble();
        double diskon=0.05*total;
        double kembali=bayar-(total-diskon);
        
        System.out.println( "Total diskon: "+diskon);
        System.out.println( "Total Kembalian: "+kembali);
    }
}
