import java.util.Scanner;

public class Pengulang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lipat;
        
        System.out.println("Masukkan Bilangan: ");
        int lipat = input.nextInt();
        System.out.println("batas");
        lipat x = input.nextInt();
        for (x = 1; x <=10; x++);
        {
            System.out.println(lipat + "x" + " = " + (lipat * x));
        }
    }
}
