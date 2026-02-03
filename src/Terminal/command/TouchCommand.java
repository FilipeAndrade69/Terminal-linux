package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class TouchCommand implements Command {

    private DirectoryManager dm;

    public TouchCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) throws Exception {
        new File(dm.getCurrentDir(), args[1]).createNewFile();
    }
}
