public class App{
    public static void main(String[] args) {
        System.out.println("Welcome to Mobile Legend");

        Mobil japero = new Mobil();
              japero.merk = "Japero";
              japero.nyalainMesin();
              japero.maju();

        Mobil alprad = new Mobil();
              alprad.merk = "Alprad";
              alprad.nyalainMesin();
              alprad.maju();

        Segitiga segitigaSikuSiku = new Segitiga();
              segitigaSikuSiku.jenis = "Siku Siku ";
              segitigaSikuSiku.alas = 10;
              segitigaSikuSiku.tinggi = 15;
              segitigaSikuSiku.hitungLuas();

        Segitiga segitigaSamaKaki = new Segitiga();
            segitigaSamaKaki.jenis = "Sama Kaki ";
            segitigaSamaKaki.alas = 2;
            segitigaSamaKaki.tinggi = 10;
            segitigaSamaKaki.hitungLuas();
    }
}

class Mobil{

    // atribut / property
    String merk;
    int jumlahRoda;
    String warna;

    // method

    public void maju(){
        System.out.println("ini Adalah Mobil " + this.merk + ", Mobil ini mau Maju nih");
    }

    // method / perilaku

    public void nyalainMesin() {
        System.out.println("Mesin Nyala, Mbreemmmmmm ");
    }

}

class Segitiga{

    // atribut / property
    String jenis;
    int alas;
    int tinggi;


    // method / perilaku
    public void hitungLuas(){
        double luas = this.alas * this.tinggi / 2;

        System.out.println("Luas " + this.jenis + luas);
    }
}