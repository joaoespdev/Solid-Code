package com.equipeacademia.project.L.lspIncorret;

// Interface para CoffeeMaker
interface CoffeeMaker{
    String makeCoffee();
}

// Implementação da classe Sam
class Sam implements CoffeeMaker {
    public String makeCoffee(){
        return "Here's your coffee!";
    }
}

// Implementação da classe Eden, que viola o princípio ao retornar algo inesperado
class Eden extends Sam {
    @Override
    public String makeCoffee(){
        return "I can't make coffee but here's water.";
    }
}

public class LspWrongRobot {
    public static void main(String[] args) {
        CoffeeMaker sam = new Sam();
        CoffeeMaker eden = new Eden();

        System.out.println("Sam: " + sam.makeCoffee());
        System.out.println("Eden: " + eden.makeCoffee());
    }
}
