package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;


public class TouchCommand extends AbstractCommand {

    public TouchCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: touch <arquivo>");
            return;
        }

        try {
            File file = new File(dm.getCurrentDir(), args[1]);

            if (file.exists()) {
                System.out.println("Arquivo já existe");
                return;
            }

            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo");
        }
    }
}