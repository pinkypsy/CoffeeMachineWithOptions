package machine;

public class Cappuccino extends Drink {

    final int WATER = 200;
    final int MILK = 100;
    final int CBEANS = 12;
    final int CUPS = 1;
    final int PRICE = 6;

    Cappuccino() {
        Machine.waterA -= WATER;
        Machine.milkA -= MILK;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA -= CUPS;

    }

    }

