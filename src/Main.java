import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Gender: ");
        bill.setGender(sc.nextLine().charAt(0));

        System.out.print("Amount of beers: ");
        bill.setBeer(sc.nextInt());

        System.out.print("Amount of soft drinks: ");
        bill.setSoftDrink(sc.nextInt());

        System.out.print("Amount of barbecue: ");
        bill.setBarbecue(sc.nextInt());

        System.out.println();

        System.out.println("Report: ");
        System.out.printf("Consumption = $ %.2f%n", bill.feeding());

        if (bill.cover() == 0) {
            System.out.println("Cover charge exemption");
        } else {
            System.out.printf("Cover = $ %.2f%n", bill.cover());
        }

        System.out.printf("Ticket = $ %.2f%n", bill.ticket());

        System.out.println();

        System.out.printf("Amount payable = $ %.2f", bill.total());

        sc.close();
    }
}