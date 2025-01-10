package com.equipeacademia.project.O;

import java.util.ArrayList;
import java.util.List;

// Classe OcpRobot que não segue o OCP corretamente
class OcpRobot {

    // Lista de tarefas, mas armazenando apenas strings para representar tarefas
    private List<String> tarefas = new ArrayList<>();

    // Método para adicionar uma tarefa usando String (violando OCP)
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);  // Armazenando tarefas como Strings
    }

    // Método para executar as tarefas
    public void executarTarefas() {
        // Verificando as strings diretamente para executar tarefas
        for (String tarefa : tarefas) {
            if (tarefa.equals("corte")) {
                System.out.println("Executando tarefa de corte.");
            } else if (tarefa.equals("pintura")) {
                System.out.println("Executando tarefa de pintura.");
            } else if (tarefa.equals("limpeza")) {
                System.out.println("Executando tarefa de limpeza.");
            } else {
                System.out.println("Tarefa desconhecida.");
            }
        }
    }
}

// Classe principal para demonstrar o código ruim (violando OCP)
public class OcpWrongRobotMain {
    public static void main(String[] args) {
        System.out.println("Demonstração de um código ruim (violando OCP):");

        // Criando robô
        OcpRobot robo = new OcpRobot();

        // Adicionando tarefas diretamente como strings (não usa a interface Tarefa)
        robo.adicionarTarefa("corte");  // Usando Strings diretamente para representar tarefas
        robo.adicionarTarefa("pintura"); // Usando Strings diretamente

        // Caso haja uma nova tarefa, como "limpeza", precisamos alterar o código abaixo
        // robo.adicionarTarefa("limpeza");  // Precisamos alterar a lógica se novas tarefas forem adicionadas

        // Executando as tarefas
        robo.executarTarefas();
    }
}
