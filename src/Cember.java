import java.util.Scanner;

public class Cember {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

   /*
     - Kullanıcıdan alınan tam sayı (int) tipinde bir çap değerini argüman olarak alarak bir
     çemberin çevresini ve alanını hesaplayan iki fonksiyon yazınız.
     - Çevre hesaplayan fonksiyonun geri dönüş tipi void, alan hesaplayan fonksiyonun geri dönüş tipi double olacaktır.

    */
    System.out.print("Çemberin Çapını Giriniz: ");
    int cap = scan.nextInt();
    if (cap>0) {

        cevreHesapla((double) cap);

        double alan=alanHesap((double) cap);
        System.out.print("Çemberin Alanı : " + String.format("%.2f", alan) );

    }
    else {
        System.out.println("1’den küçük bir tam sayı girilmeyecek");
    }

}

    public static void cevreHesapla(Double cap){
        double yaricap = cap/2;
        double PI = 3.14;//sabit istendiği için bu şekilde yapıldı aslında Math.PI 'den çekile bilir.
        System.out.println("Çemberin Çevresi : " +String.format("%.2f", PI*cap));
        //aslında formul 2*yarıcap*pi ama bizden cap girilmesi istendiği için formul pi*cap oluyor
    }

    public static double alanHesap(Double cap) {
        double yaricap = cap/2;
        double PI = 3.14;//sabit istendiği için bu şekilde tanımlandı, aslında Math.PI 'den çekile bilir.
        return PI*yaricap*yaricap;
        //aslında formul yaricap*yaricap*pi ama bizden cap girilmesi istendiği için formul PI*(cap/2)*(cap/2)oluyor
    }
}
