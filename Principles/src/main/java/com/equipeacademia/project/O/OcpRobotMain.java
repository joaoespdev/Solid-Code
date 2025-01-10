package com.equipeacademia.project.O;

import java.util.ArrayList;
import java.util.List;

// Interface que define o comportamento para tarefas
interface Tarefa {
    String executar();
}

// Implementação da tarefa de corte
class TarefaDeCorte implements Tarefa {
    public String executar() {
        return "Executando tarefa de corte.";
    }
}

// Implementação da tarefa de pintura
class TarefaDePintura implements Tarefa {
    public String executar() {
        return "Executando tarefa de pintura.";
    }
}

// Implementação da tarefa de limpeza
class TarefaDeLimpeza implements Tarefa {
    public String executar() {
        return "Executando tarefa de limpeza.";
    }
}

// Classe do robô que pode executar diferentes tarefas
class OcpRobotBom {
    private final List<Tarefa> tarefas = new ArrayList<>();

    // Método para adicionar uma nova tarefa ao robô
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Método para executar todas as tarefas atribuídas
    public void executarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.executar());
        }
    }
}

// Classe principal para demonstrar o conceito
public class OcpRobotMain {
    public static void main(String[] args) {
        System.out.println("Demonstração do Princípio Aberto-Fechado (OCP):");

        // Criando um robô
        OcpRobotBom robo = new OcpRobotBom();  // Corrigido para OcpRobotBom

        // Adicionando tarefas ao robô com as classes apropriadas
        robo.adicionarTarefa(new TarefaDeCorte());    // Adicionando tarefa de corte
        robo.adicionarTarefa(new TarefaDePintura());  // Adicionando tarefa de pintura
        robo.adicionarTarefa(new TarefaDeLimpeza());  // Adicionando tarefa de limpeza

        // Executando as tarefas
        robo.executarTarefas();
    }
}
