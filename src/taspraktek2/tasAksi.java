package taspraktek2;

public class tasAksi {
    public static void main(String[] args) {
        Tas2 w1 = new Tas2();
       w1.hargatas = 600000;
       w1.jumlahtas = 5;
      
       w1.cetakinfo();
      System.out.println("Hasil keuntungan ="+w1.hitungkeuntungan());
      w1.cetakkeuntungan();
      
     Tas2 w2 = new Tas2();
        w2.cetakinfo();
    
        Tas2 w3 = new Tas2(600000,5);
        w3.cetakinfo();
    }
    
}
