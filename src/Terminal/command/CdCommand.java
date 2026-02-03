package Terminal.command;


import Terminal.manager.DirectoryManager;

public class CdCommand implements Terminal.command.Command {

    private DirectoryManager dm;

    public CdCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) throws Exception {
        if (args.length < 2) {
            throw new Exception("Informe o diretório");
        }
        dm.changeDirectory(args[1]);
    }
}
