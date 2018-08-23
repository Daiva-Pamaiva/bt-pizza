package lt.baltictalents.pizzeria;

class PizzeriaMain {
    public PizzeriaMain(String s) {

    }

    public static void main(String[] args) {
        PizzeriaMain pizza = new PizzeriaMain("");
        Box<PizzeriaMain, Sauce> box = new Box<>(pizza, Sauce.MIX);
        box.showContents();

        String[] menuItemNames = new String[16];
        double[] menuItemPrices = new double[16];

        menuItemNames[0] = "Beer";
        menuItemPrices[0] = 2.50;

        menuItemNames[1] = "Water still";
        menuItemPrices[1] = 0.75;

        menuItemNames[2] = "Water sparkling";
        menuItemPrices[2] = 1.00;

        menuItemNames[3] = "Soft drink";
        menuItemPrices[3] = 1.50;

        menuItemNames[4] = "Tea with sugar";
        menuItemPrices[4] = 1.50;

        menuItemNames[5] = "Tea with honey";
        menuItemPrices[5] = 1.75;

        menuItemNames[6] = "Coffee with sugar";
        menuItemPrices[6] = 1.50;

        menuItemNames[7] = "Coffee with milk";
        menuItemPrices[7] = 1.75;

        menuItemNames[8] = "Pizza Vegetariano";
        menuItemPrices[8] = 6.50;

        menuItemNames[9] = "Pizza Summer";
        menuItemPrices[9] = 6.50;

        menuItemNames[10] = "Pizza Evening";
        menuItemPrices[10] = 6.70;

        menuItemNames[11] = "Pizza EveningStar";
        menuItemPrices[11] = 6.90;

        menuItemNames[12] = "Pizza Starter";
        menuItemPrices[12] = 6.50;

        menuItemNames[13] = "Pizza Sunrise";
        menuItemPrices[13] = 6.95;

        menuItemNames[14] = "Pizza Later";
        menuItemPrices[14] = 6.95;

        menuItemNames[15] = "Pizza EarlyMoarning";
        menuItemPrices[15] = 6.95;

        for (int i = 0; i < menuItemNames.length; i++) {
            System.out.println(menuItemNames[i] + " - " + menuItemPrices[i]);
        }

    }
}
