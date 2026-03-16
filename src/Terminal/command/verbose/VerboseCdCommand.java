package Terminal.command.verbose;

import Terminal.command.CdCommand;
import Terminal.command.Command;
import Terminal.manager.DirectoryManager;

public class VerboseCdCommand implements Command {

    private final Command delegate;

    public VerboseCdCommand(DirectoryManager dm) {
        this.delegate = new CdCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        String destino = args.length > 1 ? args[1] : "(nenhum argumento)";
        System.out.println("[cd] Mudando para: " + destino);
        delegate.execute(args);
        System.out.println("[cd] Concluído.");
    }
}
