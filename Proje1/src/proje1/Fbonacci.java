package proje1;

/**
 *
 * @author HUSAM
 */
/*
 Fibonacci
    Basla
        kullanıcıdan sınır değerini al ve üstsinir değişkeninde tut
        Eğer üstsinir değeri negatif veya 0 ise 
            YAZ"Girdiğiniz değer negatif veya 0 olamaz" ve durumu üstsınırKontrol değikenine ata
        değilse
            üstınırı değikenine ata ve durumu değiştir
        bir sayının asal olup olmadığını bulan asal sınıfı tanımla ve asalbul değikeninde tut
        fiboenbuyuk()
            eğer üst sınır dogruysa 
                ilk,birsonrakideger,sınır,asalsayı,önceki asaldeğişkenlere 0 ata
                iki 1 atae
                DON sınır<=üstsınır olduğu sürrece
                    birsonrakideger=ilk+iki               
                    EGER birsonrakideger < üstsinir ise
                        ilk=iki;
                        iki=birsonrakideger;
                        a=asalbul.asalmı(birsonrakideger);
                        EGER a doğruysa
                            öncekiasal=birsonrakideger
                            Eger öncekasal>asalsayı ise
                                asalsayı = öncekiasal;
                            Degilse
                                döngüye git
                        Değilse 
                            döngüye git
                    Degilse
                        sınır = birsonrakideger;
                YAZ 'üstsinir'  den küçük en büyük asal sayı: 'asalsayı'
                return 'asalsayı'
            değilse 
                Kullanıcıya hata bildir 
                return-1;
         fiboenkucuk()
            eğer üst sınır dogruysa 
                ilk=0,iki=1,birsonrakideger=0,asalsayı = -1,int öncekiasal = 2 ata
                deger=true
                DON deger dogruysa
                    birsonrakideger = ilk + iki;
                    ilk = iki;
                    iki = birsonrakideger;
                    a=asalbul(birsonrakideger)
                    EGER a dogruysa
                        öncekiasal=birsonrakideger
                        EGER öncekiasal > asalsayı ise
                            asalsayı = öncekiasal;
                            EGER asalsayı>üstsınır ise
                                YAZ 'üstsinir'den büyük en küçük asal sayı:'asalsayı'
                                deger = false;
                            degilse 
                                DÖN güye devam et
                        değilse
                            döngüye devam et
                    degilse
                        döngüye devam et
                return 'asalsayı'
            değilse
                Kullanıcıya hata bildir 
                return-1;
    BİTİR




*/
public class Fbonacci {

    int üstsinir = 0;
    boolean üstSinirKontrol = false;
    asalbul asalbul = new asalbul();

    public Fbonacci(int üstsinir) {
        if (üstsinir > 0) {
            this.üstsinir = üstsinir;
            üstSinirKontrol = true;
        } else {
            System.out.println("Girdiğiniz değer negatif veya 0 olamaz");
        }

    }

    public int fiboenbuyuk() {
        if (üstSinirKontrol) {
            int ilk = 0;//fibonacci teriminin 1.si
            int iki = 1;//fibonacci teriminin 2.si
            int birsonrakideger = 0;
            int sınır = 0;
            int asalsayı = 0;
            int öncekiasal = 2;
            while (sınır <= üstsinir) {
                birsonrakideger = ilk + iki;
                if (birsonrakideger < üstsinir) {
                    ilk = iki;
                    iki = birsonrakideger;
                    //System.out.println(birsonrakideger);
                    boolean a = asalbul.asalmı(birsonrakideger);//fibo sayıların asalığını kontrol etme
                    if (a == true) {
                        öncekiasal = birsonrakideger;
                        if (öncekiasal > asalsayı) {//en büyük asal sayıyı bulan if
                            asalsayı = öncekiasal;
                        }
                    }
                } else {
                    sınır = birsonrakideger;
                }
            }

            System.out.println(üstsinir + " den küçük en büyük asal sayı:" + asalsayı);
            return asalsayı;
        } else {
            System.out.println("Üst sınırı kontrol edin Lütfen!!");
            return -1;
        }
    }

    public int fiboEnkucuk() {
        if (üstSinirKontrol) {
            int ilk = 0;
            int iki = 1;
            int birsonrakideger = 0;
            int asalsayı = -1;
            int öncekiasal = 2;
            boolean deger = true;
            while (deger) {
                birsonrakideger = ilk + iki;
                ilk = iki;
                iki = birsonrakideger;
                boolean a = asalbul.asalmı(birsonrakideger);//fibo sayıların asalığını kontrol etme
                if (a == true) {
                    öncekiasal = birsonrakideger;
                    if (öncekiasal > asalsayı) {//en büyük asal sayıyı bulan if
                        asalsayı = öncekiasal;
                        if (asalsayı >= üstsinir) {
                            System.out.println(üstsinir + " den büyük en küçük asal sayı:" + asalsayı);

                            deger = false;
                            
                        }
                    }
                }
            }
           return asalsayı;
        } else {
            System.out.println("Üst sınırı kontrol edin Lütfen!!");
            return -1;
        }

    }

}
