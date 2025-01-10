package com.equipeacademia.project.I;

// Interface única e genérica (ERRADO)
interface RobotActions {
    void spinAround();
    void rotateArms();
    void wiggleAntennas();
}

// Robô que tem braços e antenas (funciona bem)
class FullRobot implements RobotActions {
    public void spinAround() {
        System.out.println("FullRobot is spinning around!");
    }

    public void rotateArms() {
        System.out.println("FullRobot is rotating arms!");
    }

    public void wiggleAntennas() {
        System.out.println("FullRobot is wiggling antennas!");
    }
}

// Robô sem antenas (problema aqui!)
class ArmOnlyRobot implements RobotActions {
    public void spinAround() {
        System.out.println("ArmOnlyRobot is spinning around!");
    }

    public void rotateArms() {
        System.out.println("ArmOnlyRobot is rotating arms!");
    }

    public void wiggleAntennas() {
        throw new UnsupportedOperationException("I don't have antennas!");
    }
}

// Teste mostrando o erro
public class WrongImplementationTest {
    public static void main(String[] args) {
        RobotActions robot = new ArmOnlyRobot();
        robot.spinAround();
        robot.rotateArms();
        //robot.wiggleAntennas(); // ERRO: este robô não tem antenas!
    }
}
