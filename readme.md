# 🖥️ Terminal em Java – POO I

**Aluno:** Filipe Andrade e Lucas Jesus
**Disciplina:** Programação Orientada a Objetos I

---

## 📌 Descrição do Projeto

Este projeto consiste na implementação de um **terminal interativo em Java**, que simula comandos básicos de um terminal Linux, como criação de arquivos, navegação entre diretórios, leitura e escrita de arquivos.

O objetivo principal é aplicar conceitos fundamentais de **Programação Orientada a Objetos**, utilizando:
- Encapsulamento
- Separação de responsabilidades
- Padrão de Projeto **Command**
- Manipulação de arquivos e diretórios com `java.io`

---

## 🧠 Funcionamento Geral do Sistema

- O programa inicia exibindo uma mensagem de boas-vindas
- O usuário digita comandos no prompt (`>`)
- Cada comando digitado:
    1. É salvo no histórico
    2. É interpretado pelo sistema
    3. É executado pela classe correspondente
- O terminal permanece em execução até que o comando `exit` seja executado

---

---

## 📂 Estrutura do Projeto

```text
Terminal/
│
├── Terminal.java
│
├── command/
│   ├── Command.java
│   ├── CommandHandler.java
│   ├── PwdCommand.java
│   ├── LsCommand.java
│   ├── CdCommand.java
│   ├── MkdirCommand.java
│   ├── TouchCommand.java
│   ├── RmCommand.java
│   ├── CatCommand.java
│   ├── EchoCommand.java
│   ├── HistoryCommand.java
│   └── ExitCommand.java
│
└── manager/
    ├── DirectoryManager.java
    └── FileManager.java
    
=====================================================================    

COMANDOS DISPONÍVEIS

| Comando | Descrição |
|-------|----------|
| `pwd` | Mostra o diretório atual |
| `ls` | Lista arquivos e diretórios |
| `cd <diretório>` | Altera o diretório atual |
| `mkdir <diretório>` | Cria um diretório |
| `touch <arquivo>` | Cria um arquivo |
| `rm <arquivo>` | Remove um arquivo |
| `cat <arquivo>` | Exibe o conteúdo de um arquivo |
| `echo <texto> > <arquivo>` | Escreve texto em um arquivo |
| `history` | Exibe o histórico de comandos |
| `exit` | Encerra o terminal |



