package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.MkdirCommand;
import Terminal.manager.DirectoryManager;

public class VerboseMkdirCommand implements Command {

    private final Command delegate;
    private final DirectoryManager dm;

    public VerboseMkdirCommand(DirectoryManager dm) {
        this.dm = dm;
        this.delegate = new MkdirCommand(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {
        String nome = args.length > 1 ? args[1] : "(nenhum argumento)";
        System.out.println("[mkdir] Criando diretório: " + nome + " em " + dm.getCurrentDir().getAbsolutePath());
        delegate.execute(args);
        System.out.println("[mkdir] Concluído.");
    }
}
