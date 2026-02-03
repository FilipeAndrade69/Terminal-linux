package Terminal.command;

import Terminal.manager.DirectoryManager;

public class PwdCommand implements Command {

    private DirectoryManager dm;

    public PwdCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) {
        System.out.println(dm.getCurrentDir().getAbsolutePath());
    }
}
