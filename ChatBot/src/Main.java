import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.println("Kads tagad ir: 1. gads? 2. gadalaiks? 3. menesis? 4. iziet (Izvelies attiecigo jautajumu)");
        int jautajums = scan.nextInt();
            if (jautajums == 1) {
                System.out.println("Tagad ir 2022. gads");
            } else if (jautajums == 2) {
                System.out.println("Tagad ir pavasaris");
            } else if (jautajums == 3) {
                System.out.println("Tagad ir maijs");
            } else if (jautajums == 4) {
                System.out.println("Pietiek!");
                break;
            } else {
                System.out.println("Tads jautajums nav!");
                break;
            }
        }
        System.out.println("Beidzam!");
    }
}