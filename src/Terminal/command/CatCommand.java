package Terminal.command;



import Terminal.manager.DirectoryManager;
import Terminal.manager.FileManager;
import java.io.File;

public class CatCommand implements Terminal.command.Command {

    private DirectoryManager dm;

    public CatCommand(DirectoryManager dm) {
        this.dm = dm;
    }

    @Override
    public void execute(String[] args) throws Exception {
        File file = new File(dm.getCurrentDir(), args[1]);
        for (String line : FileManager.read(file.getPath())) {
            System.out.println(line);
        }
    }
}
