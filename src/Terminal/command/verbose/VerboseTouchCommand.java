package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.TouchCommand;
import Terminal.manager.DirectoryManager;

public class VerboseTouchCommand implements Command {

    private final Command delegate;
    private final DirectoryManager dm;

    public VerboseTouchCommand(DirectoryManager dm) {
        this.dm = dm;
        this.delegate = new TouchCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        String nome = args.length > 1 ? args[1] : "(nenhum argumento)";
        System.out.println("[touch] Criando arquivo: " + nome + " em " + dm.getCurrentDir().getAbsolutePath());
        delegate.execute(args);
        System.out.println("[touch] Concluído.");
    }
}
