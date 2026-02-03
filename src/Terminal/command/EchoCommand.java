package Terminal.command;

import Terminal.manager.DirectoryManager;
import Terminal.manager.FileManager;
import java.io.File;

public class EchoCommand implements Command {

    private DirectoryManager dm;

    public EchoCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) throws Exception {
        String text = args[1];
        File file = new File(dm.getCurrentDir(), args[3]);
        FileManager.write(file.getPath(), text);
    }
}
