package com.equipeacademia.project.L.lspIncorret;

// Classe base
class CoffeeMachine {
    public String makeCoffee() {
        return "☕ Here's your coffee!";
    }
}

// Subclasse que quebra o LSP
class WaterMachine extends CoffeeMachine {
    @Override
    public String makeCoffee() {
        return "🚰 I can't make coffee, but here's water!";
    }
}

// Uso no código
public class LspWrongRobot {
    public static void serveDrink(CoffeeMachine machine) {
        System.out.println(machine.makeCoffee());
    }

    public static void main(String[] args) {
        CoffeeMachine sam = new CoffeeMachine(); // ☕ Sam: "I make coffee!"
        CoffeeMachine eden = new WaterMachine(); // 🚰 Eden: "I make water!"

        System.out.println("🧑‍💼 Customer: Can I have coffee?");
        serveDrink(sam);  // ☕ Sam: "Here's your coffee!"
        serveDrink(eden); // 🚰 Eden: "I can't make coffee, but here's water!"
    }
}
