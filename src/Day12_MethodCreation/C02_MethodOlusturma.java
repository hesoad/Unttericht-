package Day12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun
        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir
        // method call icerisinde yazilan variable veya degerlere argument denir

        carpYazdir(5,9);

        carpYazdir(6.7,10);

        carpYazdir(98,98);

       // carpYazdir("ali","veli"); argument ve parametreler uyumlu degilse CTE olur
    }

    public static void carpYazdir(double sayi1, double sayi2){

        System.out.println(sayi1 * sayi2);

    }
}
