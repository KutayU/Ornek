import java.util.Scanner;
public class Proje{
  public static void main(String args[]){
    Scanner tarayici = new Scanner(System.in);
    while(true){
    System.out.println("(0)Giriş yapın\n(1)Kayıt olun");
    int tercih1 = tarayici.nextInt();
if ( tercih1 == 0 ){
  System.out.println("\nKullanıcı adınız");
  String user1 = tarayici.next();
  System.out.println("\nŞifrenizi giriniz");
  String pass1 = tarayici.next();
  System.out.println("\nBöyle bir kullanıcı yok");
  System.out.println("\n(0)Çıkış\n(1)Anasayfa");
  int tercih2 = tarayici.nextInt();
if ( tercih2 == 0 ){
  System.out.println("Çıkış yapıldı");
  System.exit(0);
}else if ( tercih2 == 1 ){
}
}
if ( tercih1 == 1 ){
    System.out.println("\nKullanıcı adı belirleyiniz:");
    String kAdi = tarayici.next();
    System.out.println("\nŞifre belirleyiniz:");
    String pass = tarayici.next();
    System.out.println("\nKullanıcı şartlarımızı kabul ediyormusunuz ?");
    String onay = tarayici.next();
    if ( onay.equals( "evet") || onay.equals( "Evet") ){
    }else if ( onay.equals( "hayır" ) || onay.equals( "Hayır") ){
      System.out.println("\nKaynıdını tamamlamak için sözleşmeyi kabul etmeniz gerekmektedir.");
      System.exit(0);
    }else{
      System.out.println("Lütfen \"Evet - Hayır\" şeklinde cevap veriniz");
      System.exit(0);
    }
    System.out.println("\nKullanıcı bilgileriniz ile oturum açınız.");
    while(true){
    System.out.println("\nKullanıcı adınız:");
    String kadi = tarayici.next();
    System.out.println("\nŞifreniz:");
    String sifre = tarayici.next();
    if( kadi.equals(kAdi) && sifre.equals(pass) ){
      System.out.println("Hoşgeldin "+kAdi);
      System.exit(0);
    }else{
      System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");
    }
    }
  }
  }
}
}