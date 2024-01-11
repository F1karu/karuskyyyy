public class CarClass {
    public static void main(String[] args) {
        
        System.out.println("Data Mobil");
        CarClass s = new CarClass();
        s.tampilMerk();
        System.out.println("Tua Mobil = " + s.umurmobil(2005));
}

    public void tampilMerk(){
        String Merk = "Supra";
        System.out.println("Nama Mobil: "+ Merk);
    }

    public int umurmobil(int tahunRilis){
        int umurmobil=2024-tahunRilis;
        return umurmobil;
    }
}
