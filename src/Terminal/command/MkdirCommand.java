package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class MkdirCommand extends AbstractCommand {

    public MkdirCommand(DirectoryManager dm) { //herança de classe
        super(dm);
    }

    @Override
    public void execute(String[] args) {

        if (args.length < 2) {
            System.out.println("Informe o nome da pasta");
            return;
        }

        File dir = new File(dm.getCurrentDir(), args[1]);

        if (dir.mkdir()) {
            System.out.println("Diretório criado");
        } else {
            System.out.println("Erro ao criar diretório");
        }
    }
}
