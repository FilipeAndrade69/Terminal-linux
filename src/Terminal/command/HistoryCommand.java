package Terminal.command;

import Terminal.manager.FileManager;

public class HistoryCommand implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        for (String line : FileManager.read()) {    //metodo estatico, nao precisa instanciar Fm
            System.out.println(line);
        }
    }
}
