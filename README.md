# 🚀 Sistema de Gestão de Funcionários - Java

Este projeto é um **exercício de programação orientada a objetos (POO)** em **Java**, onde criamos um sistema para gerenciar uma **empresa**, **departamentos** e **funcionários**, aplicando os conceitos de herança, polimorfismo, encapsulamento e abstração. 🧑‍💻

## Funcionalidades

- **Cadastro de funcionários**: A classe `Funcionario` armazena informações sobre os funcionários, como nome, idade, cargo e salário. Além disso, é possível calcular o **salário anual** de um funcionário. 🔢
- **Organização por departamentos**: A classe `Departamento` organiza os funcionários em diferentes áreas dentro da empresa. 📊
- **Gestão da empresa**: A classe `Empresa` gerencia os departamentos e exibe todos os funcionários cadastrados, utilizando um método para mostrar as informações de todos os departamentos. 🏢
- **Herança e Polimorfismo**: A classe `Funcionario` herda da classe `Pessoa`, que armazena os dados pessoais de cada funcionário. 🚀

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para a implementação da lógica. ☕️

## Como Rodar o Projeto

1. Clone o repositório para a sua máquina:
    ```bash
    git clone https://github.com/michellmfp/sistema-gestao-funcionarios-java.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd sistema-gestao-funcionarios-java
    ```
3. Compile e execute o código:
    - Se você estiver usando **IDE como IntelliJ ou VS Code**, basta abrir o projeto e executar.
    - Se estiver utilizando o terminal, compile o código com:
    ```bash
    javac Main.java
    ```
    E então, execute o programa com:
    ```bash
    java Main
    ```

## Como Funciona

- O código permite cadastrar funcionários e organizá-los em departamentos dentro de uma empresa.
- Ao final, ele exibe a lista completa de funcionários de todos os departamentos cadastrados.
- A classe `Funcionario` tem métodos que permitem calcular o **salário anual** e exibir as informações dos funcionários.

## Exemplo de Execução

### Entrada:

O código cria dois departamentos e adiciona três funcionários com os seguintes dados:

- **Alice**: Desenvolvedora, salário de R$5000,00.
- **Bob**: Analista de Sistemas, salário de R$6000,00.
- **Victor**: Recursos Humanos, salário de R$4000,00.

### Saída:


## Contribuições

Sinta-se à vontade para contribuir com melhorias, correções ou novas funcionalidades. Para isso, siga o fluxo de **Pull Request**:

1. Faça um fork do repositório. 🍴
2. Crie uma branch para sua modificação. 🌱
3. Faça o commit com uma mensagem clara sobre o que foi alterado. 📝
4. Abra um pull request. 🔁


