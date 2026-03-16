package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.ExitCommand;

public class VerboseExitCommand implements Command {

    private final Command delegate;

    public VerboseExitCommand() {
        this.delegate = new ExitCommand();
    }

    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("[exit] Encerrando terminal...");
        delegate.execute(args);
    }
}
