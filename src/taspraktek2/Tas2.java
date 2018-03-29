package taspraktek2;
public class Tas2 {
    double hargatas;
    double jumlahtas;

    public Tas2() {
    hargatas = 600000;
    jumlahtas = 5;
    }
    
    
    void cetakinfo(){
        System.out.println("*************************");
        System.out.println("hargatas : "+hargatas);
        System.out.println("jumlahtas : "+jumlahtas);
        System.out.println("**************************");
    }
       double hitungkeuntungan(){
         double keuntungan;
         keuntungan=hargatas*jumlahtas;
         return keuntungan;
         
        }
        void cetakkeuntungan(){
         System.out.println("keuntungan adalah :"+hitungkeuntungan());
     }
        
}
