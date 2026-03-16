package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.PwdCommand;
import Terminal.manager.DirectoryManager;

public class VerbosePwdCommand implements Command {

    private final Command delegate;
    private final DirectoryManager dm;

    public VerbosePwdCommand(DirectoryManager dm) {
        this.dm = dm;
        this.delegate = new PwdCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("[pwd] Diretório atual: " + dm.getCurrentDir().getAbsolutePath());
        delegate.execute(args);
        System.out.println("[pwd] Concluído.");
    }
}
