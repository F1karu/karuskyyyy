import java.util.Scanner;

public class Pemilu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int umur;

        System.out.println("Masukkan Umur: ");
        umur = input.nextInt();

        if (umur >= 17) {
            System.out.println("Boleh Mengikuti");
        } else {
            System.out.println("Tidak boleh mengikuti");
        }

    }
}
