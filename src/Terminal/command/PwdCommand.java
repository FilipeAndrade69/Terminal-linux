package Terminal.command;

import Terminal.manager.DirectoryManager;

public class PwdCommand extends AbstractCommand {

    public PwdCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) {
        System.out.println(dm.getCurrentDir().getAbsolutePath()); // imprime o caminho atual
    }
}
