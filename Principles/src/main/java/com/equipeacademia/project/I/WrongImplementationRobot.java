package com.equipeacademia.project.I;

// Interface única e genérica (sem SOLID) - PROBLEMA: Inclui métodos que nem todos os robôs precisam
interface AcoesRobo {
    void girar();
    void moverBracos();
    void mexerAntenas(); // Problema: Nem todo robô tem antenas
}

// Robô que tem braços e antenas - FUNCIONA BEM porque implementa todos os métodos corretamente
class roboCompleto implements AcoesRobo {
    public void girar() {
        System.out.println("RoboCompleto está girando!");
    }

    public void moverBracos() {
        System.out.println("RoboCompleto está movendo os braços!");
    }

    public void mexerAntenas() {
        System.out.println("RoboCompleto está mexendo as antenas!");
    }
}

// Robô sem antenas - PROBLEMA: Precisa implementar um método que não faz sentido para ele
class RoboSomenteComBracos implements AcoesRobo {
    public void girar() {
        System.out.println("RoboSomenteComBracos está girando!");
    }

    public void moverBracos() {
        System.out.println("RoboSomenteComBracos está movendo os braços!");
    }

    public void mexerAntenas() {
        throw new UnsupportedOperationException("Eu não tenho antenas!"); // Erro em tempo de execução
    }
}

// Teste demonstrando o problema na implementação
public class WrongImplementationRobot {
    public static void main(String[] args) {
        AcoesRobo robo = new RoboSomenteComBracos();
        robo.girar();
        robo.moverBracos();
        // robo.mexerAntenas(); // ERRO: O método existe na interface, mas este robô não pode usá-lo
    }
}
