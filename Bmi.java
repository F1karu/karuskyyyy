import java.util.Scanner;

public class Bmi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Tinggi: ");
        Double tinggi = input.nextDouble();
        System.out.println("Masukkan Berat: ");
        Double berat = input.nextDouble();

        String kategori = null;
        Double BMI = berat/(tinggi*tinggi);

        if (BMI <17){
            kategori="Alien";
        }else if (BMI >=17 && BMI <=18.4){
            kategori="Ringan";
        }else if (BMI >=18.5 && BMI <=25.0){
            kategori="Normal";
        }else if (BMI >=25.1 && BMI <=27.0){
            kategori="Gemuk Ringan";
        }else if (BMI >=27.1){
            kategori="Keberatan";
        }
        
        System.out.println("Menghitung BMI= ");
        System.out.println(nama);
        System.out.println(BMI);
        System.out.println(kategori);
        }


}
