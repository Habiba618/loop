import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /** // Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        a=sc.nextInt();
        for (int i=0; i<=a;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }*/

       /*// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        int a, sum=0;
        System.out.println("Eded daxil edin: ");
        do {
                       Scanner sc = new Scanner(System.in);
                       a=sc.nextInt();
            System.out.println(a);
            if(a%4==0){
                sum+=a;
            }
        }while (a%2==0);
        System.out.println("sum: "+ sum); */

        /**Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
        int a;
              System.out.println("Eded daxil edin: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for (int i = 1; i<=a; i++){
            System.out.println("dordun quvvetleri: " +Math.pow(4,i));
            System.out.println("besin quvvetleri: " +Math.pow(5,i));
        }


    }
}
