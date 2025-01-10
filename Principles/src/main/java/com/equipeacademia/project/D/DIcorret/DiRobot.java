package com.equipeacademia.project.D.DIcorret;

//Interface para uma ferramenta de corte
interface Cutter{
    String cut();
}

//Implementação de um cortador de pizza
class PizzaCutter implements Cutter{
    public String cut(){
        return "Cutting pizza with PizzaCutter.";
    }
}

//Implementação de uma tesoura
class Scissors implements Cutter{
    public String cut(){
        return "Cutting pizza with Scissors.";
    }
}

class Robot{
    private Cutter cutter;

    public Robot(Cutter cutter){
        this.cutter = cutter;
    }

    public String cutPizza(){
        return cutter.cut();
    }
}

public class DiRobot {
    public static void main(String[] args) {
        Cutter pizzaCutter = new PizzaCutter();
        Cutter scissors = new Scissors();

        Robot robotWithPizzaCutter = new Robot(pizzaCutter);
        Robot robotWithScissors = new Robot(scissors);

        System.out.println(robotWithPizzaCutter.cutPizza());
        System.out.println(robotWithScissors.cutPizza());
    }
}
