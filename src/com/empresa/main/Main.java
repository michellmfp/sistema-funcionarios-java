package com.empresa.main;

import com.empresa.model.Departamento;
import com.empresa.model.Funcionario;
import com.empresa.model.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");

        Departamento departamentoTI = new Departamento("TI");
        Departamento departamentoRH = new Departamento("Recursos Humanos");

        Funcionario funcionario1 = new Funcionario("Alice", 30, "Desenvolvedora", 5000.00);
        Funcionario funcionario2 = new Funcionario("Bob", 35, "Analista de Sistemas", 6000.00);
        Funcionario funcionario3 = new Funcionario("Victor", 28, "RH", 4000.00);

        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(funcionario2);
        departamentoRH.adicionarFuncionario(funcionario3);

        empresa.adicionarDepartamento(departamentoTI);
        empresa.adicionarDepartamento(departamentoRH);

        empresa.exibirFuncionarios();
    }
}
