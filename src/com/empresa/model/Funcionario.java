package com.empresa.model;

public class Funcionario extends Pessoa{
    String cargo;
    double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Cargo: " + cargo + ", Salário: " + salario);
    }
}
