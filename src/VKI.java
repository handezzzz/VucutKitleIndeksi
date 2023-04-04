import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {

        double kilo, boy;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();

        result = (kilo) / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + result);
    }
}
