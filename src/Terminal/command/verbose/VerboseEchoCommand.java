package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.EchoCommand;
import Terminal.manager.DirectoryManager;

public class VerboseEchoCommand implements Command {

    private final Command delegate;

    public VerboseEchoCommand(DirectoryManager dm) {
        this.delegate = new EchoCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("[echo] Escrevendo em arquivo...");
        delegate.execute(args);
        System.out.println("[echo] Concluído.");
    }
}
