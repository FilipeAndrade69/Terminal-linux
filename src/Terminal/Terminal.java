package Terminal;

import Terminal.command.*;
import Terminal.manager.*;


import java.util.Scanner;

public class Terminal {

    private static void showWelcome() {
        System.out.println("=================================");
        System.out.println("  TERMINAL - POO I versão.final ");
        System.out.println("=================================");
        System.out.println(" Digite: pwd, ls, cd, mkdir");
        System.out.println(" touch, rm, cat, echo, history");
        System.out.println(" Digite exit para sair");
        System.out.println("=================================");
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); //criançao do scanner
        DirectoryManager dm = new DirectoryManager(); //cria o objeto que controla o diretŕoio atual do sistema
        CommandHandler handler = new CommandHandler(); //cria o objeto responsável por registrar e recuperar comandos


        showWelcome();


        handler.register("pwd", new PwdCommand(dm));
        handler.register("ls", new LsCommand(dm));
        handler.register("cd", new CdCommand(dm));
        handler.register("mkdir", new MkdirCommand(dm));
        handler.register("touch", new TouchCommand(dm));
        handler.register("rm", new RmCommand(dm));
        handler.register("cat", new CatCommand(dm));
        handler.register("echo", new EchoCommand(dm));
        handler.register("history", new HistoryCommand());
        handler.register("exit", new ExitCommand());

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine();

            FileManager.write(input);

            String[] parts = input.split(" ");
            Command cmd = handler.get(parts[0]);

            if (cmd == null) {
                System.out.println("Comando não encontrado!!!");
            } else {
                cmd.execute(parts);
            }
        }
    }
}
