package com.equipeacademia.project.S;

//S- Single Responsibility Principle
// A classe deve ter apenas uma responsabilidade!
public class WrongSrpRobot {
    public boolean turnon = true;


    public void andar() {
        System.out.println("==========================\nO robo está andando.");
    }

    WrongSrpRobot () {
        this.turnon = turnon;
    }

    public static class CheffRobot extends WrongSrpRobot {
        public void cozinhar() {
            System.out.println("O robo está cozinhando. 🔥🔥");
        }

        public CheffRobot() {

        }
    }

    public static class GardenerRobot extends SrpRobot.CheffRobot {
        public void plantar() {
            System.out.println("O robo está plantando. 🌱");
        }

        public void colher() {
            System.out.println("O robo está colhendo. 👩‍🌾");
        }

        public void vender() {
            System.out.println("O robo está vendendo sua colheita. 🎩");
        }

        public void divulgar() {
            System.out.println("O robo está divulgando sua mercadoria. 📢");
        }

        public GardenerRobot() {

        }
    }

    public static class PainterRobot extends SrpRobot.GardenerRobot {
        public void pintar() {
            System.out.println("O robo está pintando um quadro. ⛺");
        }

        public PainterRobot() {

        }
    }



    public static void main(String[] args) {

        CheffRobot cheffRobot1 = new CheffRobot();
        cheffRobot1.andar();
        cheffRobot1.cozinhar();

        GardenerRobot gardenerRobot1 = new GardenerRobot();
        gardenerRobot1.andar();
        gardenerRobot1.cozinhar();
        gardenerRobot1.plantar();
        gardenerRobot1.colher();
        gardenerRobot1.divulgar();
        gardenerRobot1.vender();

        PainterRobot painterRobot1 = new PainterRobot();
        painterRobot1.andar();
        painterRobot1.pintar();
        painterRobot1.plantar();

    }

}
