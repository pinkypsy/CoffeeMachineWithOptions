package machine;

public class Espresso extends Drink {

    final int WATER = 250;
    final int CBEANS = 16;
    final int CUPS = 1;
    final int PRICE = 4;

    Espresso() {
        Machine.waterA -= WATER;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA -= CUPS;

    }



}
