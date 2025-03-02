package com.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;

    public Empresa( String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void exibirFuncionarios() {
        System.out.println("Empresa: " + nome);
        for (Departamento d: departamentos) {
            d.exibirFuncionarios();
        }
    }

}
