package Terminal.command;


import Terminal.manager.DirectoryManager;

public class CdCommand extends AbstractCommand {

    public CdCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) { //validação
            System.out.println("Informe o diretório");
            return;
        }

        try {
            dm.changeDirectory(args[1]); //pede para Dm mudar o diretório
        } catch (Exception e) {
            System.out.println("Diretório não existe ou é inválido");
        }
    }
}
