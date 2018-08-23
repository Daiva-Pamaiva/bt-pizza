package lt.baltictalents.pizzeria;

public class PizzeriaMain {


    public static void main(String[] args) {

        MenuItem[] menu = new MenuItem[16];


        menu[0] = new MenuItem();
        menu[0].name = "Beer";
        menu[0].price = 2.50;

        menu[1] = new MenuItem();
        menu[1].name = "Water still";
        menu[1].price = 0.75;

        menu[2] = new MenuItem();
        menu[2].name = "Water sparkling";
        menu[2].price = 1.00;

        menu[3] = new MenuItem();
        menu[3].name = "Soft drink";
        menu[3].price = 1.50;

        menu[4] = new MenuItem();
        menu[4].name = "Tea with sugar";
        menu[4].price = 1.50;

        menu[5] = new MenuItem();
        menu[5].name = "Tea with honey";
        menu[5].price = 1.75;

        menu[6] = new MenuItem();
        menu[6].name = "Coffee with sugar";
        menu[6].price = 1.50;

        menu[7] = new MenuItem();
        menu[7].name = "Coffee with milk";
        menu[7].price = 1.75;

        menu[8] = new MenuItem();
        menu[8].name = "Pizza Vegetarian";
        menu[8].price = 6.50;

        menu[9] = new MenuItem();
        menu[9].name = "Pizza Summer";
        menu[9].price = 6.50;

        menu[10] = new MenuItem();
        menu[10].name = "Pizza Evening";
        menu[10].price = 6.70;

        menu[11] = new MenuItem();
        menu[11].name = "Pizza EveningStar";
        menu[11].price = 6.90;

        menu[12] = new MenuItem();
        menu[12].name = "Pizza Starter";
        menu[12].price = 6.50;

        menu[13] = new MenuItem();
        menu[13].name = "Pizza Sunrise";
        menu[13].price = 6.95;

        menu[14] = new MenuItem();
        menu[14].name = "Pizza Later";
        menu[14].price = 6.95;

        menu[15] = new MenuItem();
        menu[15].name = "Pizza EarlyMorning";
        menu[15].price = 6.95;

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].name + " - " + menu[i].price);
        }

    }
}
