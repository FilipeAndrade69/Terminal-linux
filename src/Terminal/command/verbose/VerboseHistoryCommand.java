package Terminal.command.verbose;

import Terminal.command.Command;
import Terminal.command.HistoryCommand;

public class VerboseHistoryCommand implements Command {

    private final Command delegate;

    public VerboseHistoryCommand() {
        this.delegate = new HistoryCommand();
    }

    @Override
    public void execute(String[] args) throws Exception {
        System.out.println("[history] Histórico de comandos:");
        delegate.execute(args);
        System.out.println("[history] Concluído.");
    }
}
