package Terminal.command;

import Terminal.manager.FileManager;

public class HistoryCommand implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        for (String line : FileManager.read("history.txt")) {
            System.out.println(line);
        }
    }
}
