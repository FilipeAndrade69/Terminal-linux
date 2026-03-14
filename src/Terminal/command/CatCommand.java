package Terminal.command;

import Terminal.manager.DirectoryManager;
import Terminal.manager.FileManager;

import java.io.File;


public class CatCommand extends AbstractCommand {

    public CatCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Uso: cat <arquivo>");
            return;
        }

        File file = new File(dm.getCurrentDir(), args[1]);

        for (String line : FileManager.readFile(file.getPath())) {
            System.out.println(line);
        }
    }
}
