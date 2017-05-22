
package cifravigenere;

import java.io.*;
import java.util.*;

/**
 *
 * @author Édlon Marcus Maia de Sá Curso: Engenharia de Computação Matrícula:
 * 16.2.8258
 */
public class Teste {
    public static void main(String args[]) {
        Mensagem.escreve("mensagem.txt");
        Vigenere.cifrar("mensagem.txt", "cifrada.txt", "ovo");
        Vigenere.decifrar("cifrada.txt", "decifrada.txt", "ovo");
    }
}
