import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, perKm = 0.10, price;
        int age, flightType;

        Scanner input = new Scanner(System.in);

        System.out.print("Km giriniz :");
        km = input.nextDouble();
        price = km * perKm;

        System.out.print("Yaş giriniz :");
        age = input.nextInt();

        if(age < 12){
            price = price / 2.0;
        }else if(age >= 12 && age <= 24){
            price = (price * 90.0) / 100.0;
        } else if(age > 65){
            price  = (price * 70.0) / 100.0;
        }

        System.out.print("Uçuş Tipini Seçiniz: \n1-Tek Yön\n2-Gidiş-Dönüş");
        flightType = input.nextInt();

        switch (flightType){
            case 1:
                System.out.print(price);
                break;
            case 2:
                price = (price * 80.0) / 100.0;
                System.out.print(price);
                break;
            default:
                System.out.print("Hatali Seçim yaptınız.");
                break;
        }
    }
}