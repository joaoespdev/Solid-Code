package com.equipeacademia.project.L.lspcorret;

//Interface para CoffeeMaker
interface CoffeeMaker{
    String makeCoffee();
}

//Implementação da classe Sam
class Sam implements CoffeeMaker{
    public String makeCoffee() {
        return "Here's your coffe!";
    }
}

// Implementação da classe Eden, que herda corretamente e oferece café
class Eden extends Sam {
    @Override
    public String makeCoffee(){
        return "Sure! Here's a cappuccino!";
    }
}
public class LspRobot {
    public static void main(String[] args) {
        CoffeeMaker sam = new Sam();
        CoffeeMaker eden = new Eden();

        System.out.println("Sam: " + sam.makeCoffee());
        System.out.println("Eden: " + eden.makeCoffee());
    }
}
