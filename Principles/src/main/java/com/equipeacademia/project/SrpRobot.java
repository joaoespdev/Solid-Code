package com.equipeacademia.project;

//S- Single Responsibility Principle
// A classe deve ter apenas uma responsabilidade!
public class SrpRobot {
    public boolean turnon = true;


    public void andar() {
        System.out.println("==========================\nO robo está andando.");
    }

    SrpRobot () {
        this.turnon = turnon;
    }
    // I - Interface Segregation Principle (Princípio da Segregação de Interface)
    // Interfaces para ações específicas de cada robô

    interface Cozinhar {
        void cozinhar();
    }

    interface Plantar {
        void plantar();
    }

    interface Programar {
        void programar();
    }

    interface Limpar {
        void limpar();
    }


    // O - Open/Closed Principle (Princípio Aberto/Fechado)
    public static class CheffRobot extends SrpRobot implements Cozinhar {
        public void cozinhar() {
            System.out.println("O robo está cozinhando. 🔥🔥");
        }

        public CheffRobot() {

        }
    }

    public static class GardenerRobot extends SrpRobot implements Plantar {
        public void plantar() {
            System.out.println("O robo está plantando. 🌱");
        }

        public GardenerRobot() {

        }
    }

    public static class DevRobot extends SrpRobot implements Programar {
        public void programar() {
            System.out.println("O robo está programando. ☕🚀");
        }

        public DevRobot() {

        }
    }

    public static class CleaningRobot extends SrpRobot implements Limpar {
        public void limpar() {
            System.out.println("O robô está limpando. 🧹");
        }
    }


// D - Dependency Inversion Principle (Princípio da Inversão de Dependência)
    public static void main(String[] args) {

        // L - Liskov Substitution Principle (Princípio da Substituição de Liskov)
        // Usando o polimorfismo, podemos substituir uma instância de SrpRobot por qualquer uma de suas subclasses sem alterar o comportamento esperado.

        CheffRobot cheffRobot1 = new CheffRobot();
        cheffRobot1.andar();
        cheffRobot1.cozinhar();

        GardenerRobot gardenerRobot1 = new GardenerRobot();
        gardenerRobot1.andar();
        gardenerRobot1.plantar();

        DevRobot devRobot1 = new DevRobot();
        devRobot1.andar();
        devRobot1.programar();

        CleaningRobot cleaningRobot1 = new CleaningRobot();
        cleaningRobot1.andar();
        cleaningRobot1.limpar();

    }

}
