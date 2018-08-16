package lt.baltictalents.pizzeria;

class PizzeriaMain {
    public PizzeriaMain(String s) {

    }

    public static void main(String[] args) {
        PizzeriaMain pizza = new PizzeriaMain("");
        Box<PizzeriaMain, Sauce> box = new Box<>(pizza, Sauce.MIX);
        box.showContents();

    }
}
