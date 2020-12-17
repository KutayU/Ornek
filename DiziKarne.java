import java.util.Scanner;
class DiziKarne {
    public static void main(String args[]){
        Scanner tarayici = new Scanner(System.in);

        String dersler [] = new String[3];
        int notlar [] = new int [3];

        for(int i=0; i<dersler.length; i++){
            System.out.println((i+1)+". dersi girin");
            String ders = tarayici.next();
            dersler[i] = ders ;

            System.out.println((i+1)+". dersin notunu girin");
            int not = tarayici.nextInt();
            notlar[i] = not;
        }

        int toplam = 0;

        for ( int k=0; k<notlar.length;k++ ){
            System.out.println(dersler[k]+" : "+notlar[k]);
            toplam = toplam+notlar[k];
        }

        int ortalama = toplam/dersler.length;
        System.out.println("Ortalama: "+ortalama);

        if (ortalama<=50){
            System.out.println("Sınıfta kaldınız");
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz");
        }

    }
}
