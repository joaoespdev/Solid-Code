package com.equipeacademia.project.D.DIinconrret;

// classe Robot que depende diretamente de uma implementação específica
class Robot{
    public String cutPizza(){
        return "Cutting pizza with my PizzaCutter arm.";
    }
}
public class WrongDiRobot {
    public static void main(String[] args) {
       Robot robot = new Robot();
        System.out.println(robot.cutPizza());
    }
}
