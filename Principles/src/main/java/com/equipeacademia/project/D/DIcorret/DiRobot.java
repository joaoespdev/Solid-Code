package com.equipeacademia.project.D.DIcorret;

//Interface para uma ferramenta de corte
interface CuttingTool{
    String cutPizza();
}

//Implementação de um cortador de pizza
class PizzaCutter implements CuttingTool{
    @Override
    public String cutPizza(){
        return "🍕 I cut pizza with my pizza cutter arm!";
    }
}

//Implementação de uma faca
class Knife implements CuttingTool{
    @Override
    public String cutPizza(){
        return "🍕 Know, I cut pizza with a sharp knife!";
    }
}

class Robot{
    private CuttingTool cuttingTool;

    public Robot(CuttingTool cuttingTool){
        this.cuttingTool = cuttingTool;
    }

    public void serverPizza(){
        System.out.println(cuttingTool.cutPizza());
    }
}

public class DiRobot {
    public static void main(String[] args) {
        CuttingTool pizzaCutter = new PizzaCutter(); // Faca de pizza
        CuttingTool knife = new Knife(); // Faca comum

        Robot pizzaBotWithCutter = new Robot(pizzaCutter);
        pizzaBotWithCutter.serverPizza(); // Resultado: "🍕 I cut pizza with my pizza cutter arm!"

        Robot pizzaBotWithKnife = new Robot(knife);
        pizzaBotWithKnife.serverPizza(); // Resultado: "🍕 Know, I cut pizza with a sharp knife!"
    }
}
