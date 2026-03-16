package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.LsCommand;
import Terminal.manager.DirectoryManager;

public class VerboseLsCommand implements Command {

    private final Command delegate;
    private final DirectoryManager dm;

    public VerboseLsCommand(DirectoryManager dm) {
        this.dm = dm;
        this.delegate = new LsCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("[ls] Listando conteúdo de: " + dm.getCurrentDir().getAbsolutePath());
        delegate.execute(args);
        System.out.println("[ls] Concluído.");
    }
}
