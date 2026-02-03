package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class LsCommand implements Command {

    private DirectoryManager dm;

    public LsCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) {
        File[] files = dm.getCurrentDir().listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
