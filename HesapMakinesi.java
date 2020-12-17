import java.util.Scanner;
class HesapMakinesi {
  public static void main(String args[]){
    Scanner tarayici = new Scanner(System.in);
    System.out.println("\n4 işlemli 2 haneli hesap makinesi. Kutay Uluçay tarafından tasarlandı. (Sadece integer(Sayısal değer) kullanmanız gerekmektedir)");
    while(true){
    System.out.println("\n\nİşlem seçiniz;\n(1) Toplama\n(2) Çıkarma\n(3) Çarpma\n(4) Bölme");
    int tercih = tarayici.nextInt();
    if ( tercih >= 5 ){
      System.out.println("Lütfen geçerli bir işlem giriniz.");
      continue;
    }
    System.out.println("\n1. sayıyı giriniz");
    int sayi1 = tarayici.nextInt();
    System.out.println("\n2. sayıyı giriniz");
    int sayi2 = tarayici.nextInt();
    if (tercih == 1){
      System.out.println("\nSonuç: "+(sayi1+sayi2));
    }
    if (tercih == 2){
      System.out.println("\nSonuç: "+(sayi1-sayi2));
    }
    if (tercih == 3){
      System.out.println("\nSonuç: "+(sayi1*sayi2));
    }
    if (tercih == 4){
      System.out.println("\nSonuç: "+(sayi1/sayi2));
    }
    System.out.println("\n(0) Çıkış yap\n(1) Başka işlem yap");
    int tercih2 = tarayici.nextInt();
    if( tercih2 == 0 ){
      System.out.println("\nÇıkış yapıldı");
      break;
    }else if ( tercih2 == 1 ){
      continue;
    }else{
      System.out.println("\nGeçerli bir değer girmediniz.\nÇıkış yapılıyor.");
      break;
    }
    }
  }
}