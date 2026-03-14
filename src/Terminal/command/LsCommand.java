package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class LsCommand extends AbstractCommand {

    public LsCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) {
        File[] files = dm.getCurrentDir().listFiles(); //Pega o diretório atual e Lista arquivos e pastas.
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName()); //Imprime nome por nome
            }
        }
    }
}
