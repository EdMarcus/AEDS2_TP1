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
            BufferedWriter cifrada = new BufferedWriter(new FileWriter(caminhoMensagem));
            BufferedWriter mensagem = new BufferedWriter(new FileWriter(caminhoCifrada));
            String teste;
            
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
