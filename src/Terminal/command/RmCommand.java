package Terminal.command;

import Terminal.manager.DirectoryManager;
import java.io.File;

public class RmCommand extends AbstractCommand {

    public RmCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) {

        try {
            // validação de argumentos
            if (args.length < 2) {
                throw new IllegalArgumentException("Uso: rm <arquivo|diretório>");
            }

            File file = new File(dm.getCurrentDir(), args[1]);

            // verifica existência
            if (!file.exists()) {
                throw new IllegalArgumentException("Arquivo ou diretório não existe");
            }

            // diretório não vazio
            if (file.isDirectory() && file.list().length > 0) {
                throw new IllegalStateException("Diretório não está vazio");
            }

            // remove
            if (!file.delete()) {
                throw new RuntimeException("Falha ao remover");
            }

            System.out.println("Removido com sucesso");

        } catch (Exception e) {
            //tratamento centralizado
            System.out.println(e.getMessage());
        }
    }
}