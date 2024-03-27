
import java.util.Random;

public class CurrencyExchange {

    public static void main(String[] args) {
        Random random = new Random();
        double dollarRate = random.nextDouble() * (40 - 35) + 35;
        Bank[] banks = new Bank[14];
        for (int i = 0; i < banks.length; i++) {
            String bankName = "Bank" + (i + 1);
            double exchangeRate = random.nextDouble() * (40 - 35) + 35;
            banks[i] = new Bank(bankName, exchangeRate);

        }
        System.out.println("Курс доллара: " + dollarRate);

        System.out.println("Вигідні банки для обміну:");

        for (Bank bank : banks) {
            double exchangedAmount = 100 * bank.exchangeRate / dollarRate;
            if (exchangedAmount > 100) {
                System.out.println(bank.name + ": " + exchangedAmount + " грн за 100 долларів ");

            }

        }


    }
}
