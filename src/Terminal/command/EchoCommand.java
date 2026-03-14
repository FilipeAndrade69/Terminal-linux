package Terminal.command;

import Terminal.manager.DirectoryManager;
import Terminal.manager.FileManager;
import java.io.File;

public class EchoCommand extends AbstractCommand {

    public EchoCommand(DirectoryManager dm) {
        super(dm);
    }

    @Override
    public void execute(String[] args) throws Exception {

        int redirectIndex = -1; // Variável que vai guardar a posição do >

        for (int i = 0; i < args.length; i++) { //loop que percorre todos os argumentos , começando do indice 0
            if (args[i].equals(">")) { //Verifica se o argumento atual é exatamente o símbolo >
                redirectIndex = i; //Quando encontra >, guarda a posição dele
                break;
            }
        }

        if (redirectIndex == -1 || redirectIndex == args.length - 1) { // 2 validaçoes, se for "echo ola teste" ou "echo >  " os 2 sao incorretos
            System.out.println("Uso: echo <texto> > <arquivo>");
            return;
        }

        StringBuilder text = new StringBuilder(); //cria um objeto para montar o texto final, mas facil para concatenar string
        for (int i = 1; i < redirectIndex; i++) { //Começa em 1 para pular o "echo" [0], Vai até antes do >, tudo aqui é texto
            text.append(args[i]).append(" "); //Adiciona cada palavra ao texto e acrescenta um espaço entre elas
        }

        File file = new File(dm.getCurrentDir(), args[redirectIndex + 1]); //cria um objeto file apontando pro diretorio atual + o nome do arquivo logo apos >
        FileManager.writeFile(file.getPath(), text.toString().trim()); //metodo estático de FM
        //file.getPath retorna o caminho completo do arquivo
        // texto.toString converte stringbuilder para string
        //.trim remove o espaço extra no final
        //FilaManager.writeFile metodo estático, escreve o texto dentro do arquivo
    }

}
