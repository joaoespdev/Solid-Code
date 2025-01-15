package com.equipeacademia.project.L.lspcorret;

// Classe base
class CoffeeMaker{
    public String makeCoffee(){
        return "☕ Here's your coffee!";
    }
}

// Subclasse que mantém o LSP
class CappuccinoMachine extends CoffeeMaker{
    @Override
    public String makeCoffee() {
       return "☕ Here's your cappuccino!";
    }
}

// Uso no código
public class LspRobot {
    public static void serveDrink(CoffeeMaker machine){
        System.out.println(machine.makeCoffee());
    }
    public static void main(String[] args) {
        CoffeeMaker sam = new CoffeeMaker(); // ☕ Sam: "I make coffee!"
        CoffeeMaker eden = new CappuccinoMachine(); // ☕ Eden: "I make cappuccino!"

        System.out.println("🧑‍💼 Customer: Can I have coffee?");
        serveDrink(sam);  // ☕ Sam: "Here's your coffee!"
        serveDrink(eden); // ☕ Eden: "Here's your cappuccino!"
    }
}
