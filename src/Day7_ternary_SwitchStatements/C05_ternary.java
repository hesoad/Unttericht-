package Day7_ternary_SwitchStatements;

public class C05_ternary {
    public static void main(String[] args) {
        /*
           Ternary isleminin sonucunu yazdiracaksak
            boolean sartin true veya false olmasi durumunda yazdiracagimiz datalar farkli data turunde olabilir
           Ancak atama yapacaksak
           true veya false olmasi durumunda alacagi degerler
           atayacagim variable'in data turune uygun olmalidir
         */
        int sayi= 12;
        System.out.println(sayi>10 ? "buyuk sayi" : sayi+2);
        // int b = sayi>10 ? "buyuk sayi" : sayi+2;
        // String c= sayi>10 ? "buyuk sayi" : sayi+2;

    }
}
