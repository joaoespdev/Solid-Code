package com.equipeacademia.project.S;

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

    public static class CheffRobot extends SrpRobot {
        public void cozinhar() {
            System.out.println("O robo está cozinhando. 🔥🔥");
        }

        public CheffRobot() {

        }
    }

    public static class GardenerRobot extends SrpRobot {
        public void plantar() {
            System.out.println("O robo está plantando. 🌱");
        }

        public GardenerRobot() {

        }
    }

    public static class DevRobot extends SrpRobot {
        public void programar() {
            System.out.println("O robo está programando. ☕🚀");
        }

        public DevRobot() {

        }
    }



    public static void main(String[] args) {

        CheffRobot cheffRobot1 = new CheffRobot();
        cheffRobot1.andar();
        cheffRobot1.cozinhar();

        GardenerRobot gardenerRobot1 = new GardenerRobot();
        gardenerRobot1.andar();
        gardenerRobot1.plantar();

        DevRobot devRobot1 = new DevRobot();
        devRobot1.andar();
        devRobot1.programar();

    }

}
