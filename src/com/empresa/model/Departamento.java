package com.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        System.out.println("Departamento: " + nome);
        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
        }
    }
}
