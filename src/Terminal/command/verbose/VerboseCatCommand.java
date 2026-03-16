package Terminal.command.verbose;
 
import Terminal.command.CatCommand;
import Terminal.command.Command;
import Terminal.manager.DirectoryManager;
 
public class VerboseCatCommand implements Command {
 
    private final Command delegate;
 
    public VerboseCatCommand(DirectoryManager dm) {
         this.delegate = new CatCommand(dm);
    }
 
    @Override
    public void execute(String[] args) throws Exception {
         String nome = args.length > 1 ? args[1] : "(nenhum argumento)";
         System.out.println("[cat] Lendo arquivo: " + nome);
         delegate.execute(args);
         System.out.println("[cat] Concluído.");
    }
}
 