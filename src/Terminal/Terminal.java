package Terminal;

import Terminal.command.Command;
import Terminal.command.CommandHandler;
import Terminal.factory.CommandFactory;
import Terminal.factory.StandardCommandFactory;
import Terminal.manager.DirectoryManager;
import Terminal.manager.FileManager;
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

        try (Scanner sc = new Scanner(System.in)) { //criação do scanner
            DirectoryManager dm = new DirectoryManager(); //cria o objeto que controla o diretório atual do sistema
            CommandHandler handler = new CommandHandler(); //cria o objeto responsável por registrar e recuperar comandos

            // Abstract Factory: trocar por VerboseCommandFactory para modo verboso
            CommandFactory factory = new StandardCommandFactory();

            showWelcome();

            handler.register("pwd",     factory.createPwd(dm));
            handler.register("ls",      factory.createLs(dm));
            handler.register("cd",      factory.createCd(dm));
            handler.register("mkdir",   factory.createMkdir(dm));
            handler.register("touch",   factory.createTouch(dm));
            handler.register("rm",      factory.createRm(dm));
            handler.register("cat",     factory.createCat(dm));
            handler.register("echo",    factory.createEcho(dm));
            handler.register("history", factory.createHistory());
            handler.register("exit",    factory.createExit());

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
}
