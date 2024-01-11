import java.util.Scanner;

public class Predikat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai: ");
        Double nilai = input.nextDouble();

        String predikat = null;
        String kategori = null;

        if (nilai >=96 && nilai <=100){
            kategori ="A";
            predikat ="Sangat Baik";
        } else if (nilai >=91 && nilai <=95){
            kategori ="A-";
            predikat ="Sangat Baik";
        } else if (nilai >=86 && nilai <=90){
            kategori ="B+";
            predikat ="Baik";
        } else if (nilai >=81 && nilai <=85){
            kategori ="B";
            predikat ="Baik";
        } else if (nilai >=75 && nilai <=80){
            kategori ="B-";
            predikat ="Baik";
        } else if (nilai >=70 && nilai <=74){
            kategori ="C+";
            predikat ="Cukup";
        } else if (nilai >=65 && nilai <=69){
            kategori ="C";
            predikat ="Cukup";
        } else if (nilai >=60 && nilai <=64){
            kategori ="C-";
            predikat ="Cukup";
        } else if (nilai >=55 && nilai <=59){
            kategori ="D+";
            predikat ="Kurang";
        } else if (nilai >=0 && nilai <=54){
            kategori ="D";
            predikat ="Kurang";
        }

        System.out.println(nama);
        System.out.println(nilai);
        System.out.println(kategori);
        System.out.println(predikat);
    
    
    
    }
}
