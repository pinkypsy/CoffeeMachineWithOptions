package machine;

import java.util.Scanner;

class Machine {

    static int waterA = 1200;
    static int milkA = 540;
    static int cbeansA = 120;
    static  int cupsA = 9;
    static int money = 550;

    void show(){
        System.out.println("The coffee machine has:");
        System.out.println(waterA + " of water");
        System.out.println(milkA + " of milk");
        System.out.println(cbeansA + " of coffee beans");
        System.out.println(cupsA + " of disposable cups");
        System.out.println(money + " of money");
    }

    private Scanner sc = new Scanner(System.in);

    void buy(){
        System.out.println("What do you want to buy?");
        System.out.println("Type: 1 for espresso, 2 for latte, 3 for cappuccino");
        int drinkType = sc.nextInt();
    if (1 <= drinkType && drinkType <= 3){
       if (drinkType == 1) new Espresso();
       if (drinkType == 2) new Latte();
       if (drinkType == 3) new Cappuccino();
    }
    else System.out.println("Type: 1 for espresso, 2 for latte, 3 for cappuccino");
        show();
    }

    void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        waterA += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkA += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        cbeansA += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cupsA += sc.nextInt();
        show();
    }
    void take(){
        System.out.println("I gave you $" +  money);
   setMoney(0);
        show();
    }


    private void setMoney(int money) {
        Machine.money = money;
    }
}

