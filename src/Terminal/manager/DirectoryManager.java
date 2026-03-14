package Terminal.manager;

import java.io.File;

public class DirectoryManager {

    private File currentDir = new File(System.getProperty("user.dir")); //guarda o diretório atual, o getProperty retorna o diretório onde o programa Java foi executado.

    public File getCurrentDir() { //metodo getter, referencia para os commandos pwd ls touch cat e etc acessarem o diretorio atual
        return currentDir;
    }

    public void changeDirectory(String path) throws Exception { //responsavel para implementar CD
        File newDir = new File(currentDir, path);  //cria um novo caminho de acordo diretorio atual e +argumento passado
        if (!newDir.exists() || !newDir.isDirectory()) { //se existe ou não, e se existe se é pasta ou arquivo
            throw new Exception("Diretório inválido");
        }
        currentDir = newDir.getCanonicalFile();
    }
}
