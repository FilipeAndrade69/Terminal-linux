package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class RmCommand implements Command {

    private DirectoryManager dm;

    public RmCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) throws Exception {
        File file = new File(dm.getCurrentDir(), args[1]);
        if (!file.exists()) {
            throw new Exception("Arquivo ou diretório não existe");
        }
        file.delete();
    }
}
