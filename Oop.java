public class Oop {
    public static void main(String[] args) {
    
        System.out.println("Ayo Gas ");
        Oop s = new Oop();
        s.tampilNama();
        System.out.println(s.usia(2007));
    }

    public void tampilNama(){
        String nama= "Ucup";
        System.out.println("Nama Siswa= "+ nama);
    }

    public int usia(int tahunLahir){
        int usia=2023-tahunLahir;
        return usia;
    }
}