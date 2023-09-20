package proje1;

public class asalbul {

    public asalbul() {
    }

    public boolean asalmı(int sayi) {
        boolean deg = true;
        if (sayi > 0) {//hesaplanacak sayi pozitif olamalı

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    deg = false;
                }
                if (deg == false) {//burdaki if: Bir sayı ikiye yada başka bir böleni varsa hemen for döngüsünden çıkması için
                    break;
               }
            }
            return deg;
        }else{
            System.out.println("Gönderdiğiniz değer negatif, asal sayılar negatif olamaz");
            return false;
        }
        
        
    }
}
