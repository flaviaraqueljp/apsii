interface Massa {
    String tipo();
}

interface Molho {
    String tipo();
}


class MassaFina implements Massa {
    public String tipo() {
        return "Massa Fina";
    }
}

class MolhoMarinara implements Molho {
    public String tipo() {
        return "Molho Marinara";
    }
}


class MassaGrossa implements Massa {
    public String tipo() {
        return "Massa Grossa";
    }
}

class MolhoTomate implements Molho {
    public String tipo() {
        return "Molho de Tomate";
    }
}


interface PizzaIngredientFactory {
    Massa criarMassa();
    Molho criarMolho();
}


class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Massa criarMassa() {
        return new MassaFina();
    }

    public Molho criarMolho() {
        return new MolhoMarinara();
    }
}


class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Massa criarMassa() {
        return new MassaGrossa();
    }

    public Molho criarMolho() {
        return new MolhoTomate();
    }
}


class Pizza {
    private Massa massa;
    private Molho molho;

    public Pizza(PizzaIngredientFactory factory) {
        massa = factory.criarMassa();
        molho = factory.criarMolho();
    }

    public void preparar() {
        System.out.println("Preparando pizza com:");
        System.out.println("- " + massa.tipo());
        System.out.println("- " + molho.tipo());
    }
}


public class Main {
    public static void main(String[] args) {

        PizzaIngredientFactory nyFactory =
                new NYPizzaIngredientFactory();

        Pizza pizzaNY = new Pizza(nyFactory);
        System.out.println("Pizza New York:");
        pizzaNY.preparar();

        System.out.println();

        PizzaIngredientFactory chicagoFactory =
                new ChicagoPizzaIngredientFactory();

        Pizza pizzaChicago = new Pizza(chicagoFactory);
        System.out.println("Pizza Chicago:");
        pizzaChicago.preparar();
    }
}