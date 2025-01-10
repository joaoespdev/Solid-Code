package com.equipeacademia.project.I;

// Interfaces separadas para funcionalidades específicas
interface SpinningRobot {
    void spinAround();
}

interface ArmRotatingRobot {
    void rotateArms();
}

interface AntennaWigglingRobot {
    void wiggleAntennas();
}

// Robô que apenas gira
class SpinningOnlyRobot implements SpinningRobot {
    @Override
    public void spinAround() {
        System.out.println("SpinningOnlyRobot is spinning around!");
    }
}

// Robô que gira e move os braços
class ModularRobot implements SpinningRobot, ArmRotatingRobot {
    @Override
    public void spinAround() {
        System.out.println("ModularRobot is spinning around!");
    }

    @Override
    public void rotateArms() {
        System.out.println("ModularRobot is rotating arms!");
    }
}

// Robô completo com antenas
class FullFeatureRobot implements SpinningRobot, ArmRotatingRobot, AntennaWigglingRobot {
    @Override
    public void spinAround() {
        System.out.println("FullFeatureRobot is spinning around!");
    }

    @Override
    public void rotateArms() {
        System.out.println("FullFeatureRobot is rotating arms!");
    }

    @Override
    public void wiggleAntennas() {
        System.out.println("FullFeatureRobot is wiggling antennas!");
    }
}

// Testando a implementação correta
public class CorrectImplementationTest {
    public static void main(String[] args) {
        SpinningRobot spinRobot = new SpinningOnlyRobot();
        spinRobot.spinAround();

        ModularRobot modularRobot = new ModularRobot();
        modularRobot.spinAround();
        modularRobot.rotateArms();

        FullFeatureRobot fullRobot = new FullFeatureRobot();
        fullRobot.spinAround();
        fullRobot.rotateArms();
        fullRobot.wiggleAntennas();
    }
}
