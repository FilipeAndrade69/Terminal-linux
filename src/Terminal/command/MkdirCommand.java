package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class MkdirCommand implements Command {

    private DirectoryManager dm;

    public MkdirCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) {
        new File(dm.getCurrentDir(), args[1]).mkdir();
    }
}
