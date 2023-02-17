import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Кофемашина ***");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int moneyAmount = in.nextInt();

        int[] prices = {200, 100, 50, 75};
        String[] names = {"капучино", "эспрессо", "воду", "лате"};
        boolean canByAnything = false;

        int lenght = Math.min(prices.length, names.length);

        for(int i = 0; i < lenght; i++) {
            if (moneyAmount >= prices[i]) {
                System.out.println("Вы можете купить " + names[i]);
                canByAnything = true;
            }
        }

        if (!canByAnything) {
            System.out.println("Недостаточно средств");
        }
    }
}
