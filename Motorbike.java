public class Motorbike {
    public static void main(String[] args) {
        
        System.out.println("Data Motor Racing");
        Motorbike s = new Motorbike();
        s.sebutMerk();
        System.out.println("Usia Motor = " + s.umurmotor(2018));
        s.pembuatan();
}

    public void sebutMerk(){
        String Merk = "Kawasaki";
        System.out.println("Merk Motor: "+ Merk);
    }

    public int umurmotor(int tahunRilis){
        int umurmotor=2024-tahunRilis;
        return umurmotor;
    }

    public void pembuatan(){
        String asal = "Kanada";
        System.out.println("Made in "+ asal);
    }
}
