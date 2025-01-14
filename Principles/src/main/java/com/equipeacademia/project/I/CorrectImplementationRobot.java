package com.equipeacademia.project.I;

// Interfaces separadas para funcionalidades específicas
interface RoboGiratorio {
    void girar();
}

interface RoboComBracos {
    void moverBracos();
}

interface RoboComAntenas {
    void mexerAntenas();
}

// Robô que apenas gira
class RoboSomenteGiratorio implements RoboGiratorio {
    @Override
    public void girar() {
        System.out.println("RoboSomenteGiratorio está girando!");
    }
}

// Robô que gira e move os braços
class RoboModular implements RoboGiratorio, RoboComBracos {
    @Override
    public void girar() {
        System.out.println("RoboModular está girando!");
    }

    @Override
    public void moverBracos() {
        System.out.println("RoboModular está movendo os braços!");
    }
}

// Robô completo com antenas
class RoboCompleto implements RoboGiratorio, RoboComBracos, RoboComAntenas {
    @Override
    public void girar() {
        System.out.println("RoboCompleto está girando!");
    }

    @Override
    public void moverBracos() {
        System.out.println("RoboCompleto está movendo os braços!");
    }

    @Override
    public void mexerAntenas() {
        System.out.println("RoboCompleto está mexendo as antenas!");
    }
}

// Testando a implementação correta
public class CorrectImplementationRobot {
    public static void main(String[] args) {
        RoboGiratorio roboGiratorio = new RoboSomenteGiratorio();
        roboGiratorio.girar();

        RoboModular roboModular = new RoboModular();
        roboModular.girar();
        roboModular.moverBracos();

        roboCompleto roboCompleto = new roboCompleto();
        roboCompleto.girar();
        roboCompleto.moverBracos();
        roboCompleto.mexerAntenas();
    }
}
