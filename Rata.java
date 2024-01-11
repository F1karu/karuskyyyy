import java.util.Scanner;

public class Rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Agama, Pkn, Bahasa, Ingris, Mat, Rata;

        System.out.println("Agama: ");
        Agama = input.nextDouble();
        System.out.println("Pkn: ");
        Pkn = input.nextDouble();
        System.out.println("Bahasa: ");
        Bahasa = input.nextDouble();
        System.out.println("Inggris: ");
        Ingris = input.nextDouble();
        System.out.println("Mat: ");
        Mat = input.nextDouble();

        String Predikat = null;
        Rata = Agama + Pkn + Bahasa + Ingris + Mat / 5;

        if (Rata < 25){
            Predikat ="F";
        } else if (Rata >= 25 && Rata <= 45){
            Predikat ="E";
        } else if (Rata >= 46 && Rata <= 50){
            Predikat ="D";
            } else if (Rata >= 51 && Rata <= 60){
            Predikat ="C";
            } else if (Rata >= 61 && Rata <= 80){
            Predikat ="B";
            } else {
            Predikat ="A";
            }

            System.out.println("Hasil; " + Rata);
            System.out.println(Predikat);
    }
}
