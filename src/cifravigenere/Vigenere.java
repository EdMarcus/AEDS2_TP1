package cifravigenere;

import java.util.*;
import java.io.*;

/**
 *
 * @author Édlon Marcus Maia de Sá Curso: Engenharia de Computação Matrícula:
 * 16.2.8258
 */

public class Vigenere {
    public static void cifrar(String caminhoMensagem, String caminhoCifrada, String chave) {
        try{
            BufferedWriter cifrada = new BufferedWriter(new FileWriter(caminhoCifrada));
            BufferedReader mensagem = new BufferedReader(new FileReader(caminhoMensagem));
            String linha;
            char aux = ' ';
            int aux2 = 0;
            do{
                linha = mensagem.readLine();
                if(linha == null) break;
                for(int i = 0, j = 0; i <= linha.length()-1; i++, j++){
                    aux = linha.charAt(i);
                    if((int)aux < 97 || (int)aux > (97 + 25)){
                        cifrada.write(aux);
                    }else{
                        if(j>=chave.length()) j=0;
                        aux2 = ((int)chave.charAt(j)-97 + (int)aux );
                        if(aux2>122) aux2 = aux2 - 26;
                        cifrada.write((char)aux2);
                        cifrada.flush();
                    }
                }
                cifrada.newLine();
                cifrada.flush();
            }while(linha != null);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void decifrar(String caminhoCifrada, String caminhoDecifrada, String chave) {
        try{
            BufferedWriter decifrada = new BufferedWriter(new FileWriter(caminhoDecifrada));
            BufferedReader cifrada = new BufferedReader(new FileReader(caminhoCifrada));
            String linha;
            char aux = ' ';
            int aux2 = 0;
            do{
                linha = cifrada.readLine();
                if(linha == null) break;
                for(int i = 0, j = 0; i <= linha.length()-1; i++, j++){
                    aux = linha.charAt(i);
                    if((int)aux < 97 || (int)aux > (97 + 25)){
                        decifrada.write(aux);
                    }else{
                        if(j>=chave.length()) j=0;
                        aux2 = ((int)aux + 97 - (int)chave.charAt(j));
                        if(aux2<97) aux2 = aux2 + 26;
                        decifrada.write((char)aux2);
                        decifrada.flush();
                    }
                }
                decifrada.newLine();
                decifrada.flush();
            }while(linha != null);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
