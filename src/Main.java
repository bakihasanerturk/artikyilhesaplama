import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil>0){
            if((yil%4 == 0 && yil%100 != 0) || yil%400 == 0){
                System.out.print(yil + " artık yıl.");
            }else{
                System.out.println(yil + " artık yıl değil.");
            }
        }else{
            System.out.println("Geçerli yıl giriniz.");
        }


    }
}
