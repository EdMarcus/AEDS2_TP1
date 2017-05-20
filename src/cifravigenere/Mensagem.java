package cifravigenere;

import java.util.*;
import java.io.*;

/**
 *
 * @author Édlon Marcus Maia de Sá Curso: Engenharia de Computação Matrícula:
 * 16.2.8258
 */
public class Mensagem {

    public static void escreve(String caminho) throws IOException {
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));
            String linha = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Escreva sua mensagem e digite fim para terminar: ");
            while (!linha.equals("fim")) {
                linha = in.nextLine();
                if (!linha.equals("fim")) {
                    buffWrite.write(linha, 0, linha.length());
                    buffWrite.flush();
                    buffWrite.newLine();
                }
            }
            buffWrite.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
