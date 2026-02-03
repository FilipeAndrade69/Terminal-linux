package Terminal.manager;

import java.io.File;

public class DirectoryManager {

    private File currentDir = new File(System.getProperty("user.dir"));

    public File getCurrentDir() {
        return currentDir;
    }

    public void changeDirectory(String path) throws Exception {
        File newDir = new File(currentDir, path);
        if (!newDir.exists() || !newDir.isDirectory()) {
            throw new Exception("Diretório inválido");
        }
        currentDir = newDir.getCanonicalFile();
    }
}
