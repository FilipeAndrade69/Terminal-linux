package Terminal.manager;

import java.io.*;
import java.util.ArrayList; //armazenar as linhas lidas dos arquivos
import java.util.List; //retornar uma lista de Strings

public class FileManager { //estático 100% não há necessidade de armazenar dados entre chamadas

    private static final String HISTORY_FILE = "history.txt"; //Nome fixo do arquivo de histórico
    //STATIC pertence a classe, nao a objetos
    //FINAL nao pode ser alterado

    // ========= HISTORY =========

    private static File getHistoryFile() throws IOException { //Ele só existe para garantir que o history.txt exista.
        File file = new File(HISTORY_FILE);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    // escreve APENAS no history
    public static void write(String text) throws IOException {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(getHistoryFile(), true))) { //getHistoryFile garante que o arquivo exista
            bw.write(text);                                                               //new FileWriter no modo append = true, faz escrever no final do arquivo
            bw.newLine();                                                                 //bufferedWritter melhora eficiencia reduzindo numero de IOs
        }
    }

    // lê APENAS o history
    public static List<String> read() throws IOException { //Retorna uma lista de Strings
        return readFile(getHistoryFile().getPath());
    }

    // ========= GENERIC FILE =========

    // lê qualquer arquivo
    public static List<String> readFile(String path) throws IOException { //le qualquer arquivo e retorna uma lista com cada linha
        List<String> lines = new ArrayList<>(); //lista que vai armazenar as linhas do arquivo
        File file = new File(path); //cria um objeto file com o caminho infomrado

        if (!file.exists()) {           // validação, se arquivo nao existir lança exceção
            throw new FileNotFoundException("Arquivo não encontrado");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) { //melhora de desempenho e try fecha automatico
            String line; //Variável temporária para cada linha
            while ((line = br.readLine()) != null) { //le uma linha por vez e para quando chegar no final do arquivo
                lines.add(line);
            }
        }

        return lines;
    }

    // escreve em qualquer arquivo (echo, touch, etc)
    public static void writeFile(String path, String text) throws IOException {
        File file = new File(path); // cria a referência do arquivo

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(file, true))) { //modo append, cria se nao existir e fecha automatico
            bw.write(text); //escreve o texto
            bw.newLine(); //quebra de linha
        }
    }
}
