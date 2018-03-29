package taspraktek2;

public class tasAksi {
    public static void main(String[] args) {
        Tas2 w1 = new Tas2();
       w1.hargatas = 600000;
       w1.jumlahtas = 5;
      
       w1.cetakinfo();
      System.out.println("Hasil keuntungan ="+w1.hitungkeuntungan());
      w1.cetakkeuntungan();
    }
    
}
