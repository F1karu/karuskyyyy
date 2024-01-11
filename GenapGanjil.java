import java.util.Scanner;

public class GenapGanjil {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.println("Masukkan Bilangan: ");
        bilangan = input.nextInt();

        if (bilangan % 2 == 1) {
            System.out.println(bilangan + " Adalah genap");
        } else {
            System.out.println(bilangan + " Adalah ganjil");
        }
    }
}
