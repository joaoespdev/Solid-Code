package com.equipeacademia.project.D.DIinconrret;

// Classe de baixo nível (detalhe específico)
class PizzaCutter{
    public String cutPizza(){
        return "🍕 I cut pizza with my pizza cutter arm!";
    }
}

// Classe de alto nível (depende diretamente do baixo nível)
class Robot{
    private PizzaCutter pizzaCutter = new PizzaCutter(); // Dependência direta de uma ferramenta específica
    public void serverPizza(){
        System.out.println(pizzaCutter.cutPizza());
    }
}
public class WrongDiRobot {
    public static void main(String[] args) {
       Robot pizzaBot = new Robot();
        pizzaBot.serverPizza(); // Resultado: "🍕 I cut pizza with my pizza cutter arm!
    }
}
