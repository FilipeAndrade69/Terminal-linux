package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.RmCommand;
import Terminal.manager.DirectoryManager;

public class VerboseRmCommand implements Command {

    private final Command delegate;
    private final DirectoryManager dm;

    public VerboseRmCommand(DirectoryManager dm) {
        this.dm = dm;
        this.delegate = new RmCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        String nome = args.length > 1 ? args[1] : "(nenhum argumento)";
        System.out.println("[rm] Removendo: " + nome + " de " + dm.getCurrentDir().getAbsolutePath());
        delegate.execute(args);
        System.out.println("[rm] Concluído.");
    }
}
