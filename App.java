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

    }
}

class Mobil{
    String merk;
    int jumlahRoda;
    String warna;

    public void maju(){
        System.out.println("ini Adalah Mobil " + this.merk + ", Mobil ini mau Maju nih");
    }

    public void nyalainMesin() {
        System.out.println("Mesin Nyala, Mbreemmmmmm ");
    }
}