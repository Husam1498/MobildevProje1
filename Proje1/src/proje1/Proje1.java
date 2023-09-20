package proje1;
/*
TEMEL UGULAMA ÇALIŞMA PRENSİBİ
    MAİN:
           Basla
           Fibonacci sınıfından bir nesne üretme
           sonuç değişeknine fibonaci sınıfının fiboEnkucuk-fiboenbuyuk sonucunu ata
           sonuc değişkenini yazdir
           Bitir
*/
public class Proje1 {

    public static void main(String[] args) {
        int sonuc;
        Fbonacci f = new Fbonacci(500000);//üst sınır girildi
        sonuc = f.fiboEnkucuk() - f.fiboenbuyuk();
        System.out.println("Girilen değerden en büyük asal sayı ve girilen değerden büyük en küçük asal sayının farkı:" + sonuc);
  
        
    }
}
