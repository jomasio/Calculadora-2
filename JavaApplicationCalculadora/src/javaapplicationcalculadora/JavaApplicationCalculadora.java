/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcalculadora;

import controle.Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class JavaApplicationCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cria um objeto Calculadora e a armazena na variável "calculadora" 
        Calculadora calculadora = new Calculadora();
        
        float resultado; // Declaração da variável resultado
        
        // Solicita ao objeto calculadora somar 3 e 7 e atribuir à variável "resultado" declarada na "main"
        resultado = calculadora.somar(3, 7);
        // Utiliza a Classe "JOptionPane" para mostrar o resultado
        JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado); 
        
        // Solicita ao objeto calculadora calcular 3 elevado a 2 e atribuir à variável "resultado"
        resultado = calculadora.potencia(3, 2);
        // Utiliza a Classe "JOptionPane" para mostrar o resultado
        JOptionPane.showMessageDialog(null, "O resultado da operação de potência é " + resultado); 
        
    }
}
