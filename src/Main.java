import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);// Rastegele Sayı üretir.
        Scanner imp = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWin=false;
        int [] wrog = new int [5];
        boolean isWrong =false;
        while (right < 5){
            System.out.println("-----------------------------");
            System.out.println("Lütfen Tahmininizi Giriniz: ");
            selected=imp.nextInt();
            if (selected<0 || selected > 99){
                System.out.println("Lütfen 0-100 Arasında değer giriniz ! ");
                if (!isWrong){
                isWrong=true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan -1 düşecektir.  ");
                }else {
                    //riht++;
                    System.out.println("Çk fazla hatalı giriş yapınız. Kalan hak: "+(5-(++right)));
                }

                continue;
            }
            if (selected==number){
                System.out.println("Tebrikler Doğru tahmin !  \t Tahmin ettiğin sayı: " + number);
                isWin=true;
                break;
            }
            else {
                System.out.println("Hatalı Sayı giriniz !");
                if (selected> number){
                    System.out.println(selected+" sayısı, gizli sayıdan büyüktür !");
                }
                else {
                    System.out.println(selected+" sayısı, gizli sayıdan küçüktür !");
                }
                wrog[right]= selected;
                right++;
                System.out.println("Kalan hakkınız: "+(5-right));
            }

        }
        if (!isWin){
            System.out.println("----------------");
            System.out.println("Kaybettiniz ");
            System.out.println("Tahminleriniz : "+ Arrays.toString(wrog));
            System.out.println("Tahmin etmeniz gerekn sayı:  "+number);
        }

    }
}