package machine;

public class Latte extends Drink {

    final int WATER = 350;
    final int MILK = 75;
    final int CBEANS = 20;
    final int CUPS = 1;
    final int PRICE = 7;

    Latte() {
        Machine.waterA -= WATER;
        Machine.milkA -= MILK;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA -= CUPS;

    }

    }

