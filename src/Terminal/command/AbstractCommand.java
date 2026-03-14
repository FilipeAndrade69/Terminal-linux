package Terminal.command;

import Terminal.manager.DirectoryManager;

public abstract class AbstractCommand implements Command {

    protected DirectoryManager dm;

    public AbstractCommand(DirectoryManager dm) {
        this.dm = dm;
    }
}
