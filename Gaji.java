import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double masaKerja, bonus, total;
        //prompt
        System.out.println("Masa kerja: ");
        masaKerja = input.nextDouble();

        if (masaKerja >= 3){
            bonus = 30000;
        } else {
            bonus = 15000;
        }

        System.out.println("Bonus: " + bonus);

        total = 3000000 + bonus;
        
        System.out.println("Total gaji :" + total);
    }
}
