package lt.baltictalents.pizzeria;

enum Sauce {
    MILD("Mild sauce is a delicate flavor and not a spicy."), SPICY("Spicy sauce is VERY HOT."), MIX("Mix sauce is delicate.");

    Sauce(String description) {
        this.description = description;
    }

    private final String description;

    String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}

/*
public enum Sauce {
    MILD,
    SPICY,
    MIX
}

    public void whatSauceIs() {
        switch (sauce) {
            case MIX:
                System.out.println("Mix sauce is delicate.");
                break;

            case MILD:
                System.out.println("Mild sauce is a delicate flavor and not a spicy.");
                break;

            case SPICY:
                System.out.println("Spicy sauce is VERY HOT.");
                break;
        }
    }

    public static void main(String[] args) {
        SauceTest firstSauce = new SauceTest(Sauce.MIX);
        firstSauce.whatSauceIs();
        SauceTest firstSauce = new SauceTest(Sauce.MILD);
        firstSauce.whatSauceIs();
        SauceTest firstSauce = new SauceTest(Sauce.SPICY);
        firstSauce.whatSauceIs();

    }
*/