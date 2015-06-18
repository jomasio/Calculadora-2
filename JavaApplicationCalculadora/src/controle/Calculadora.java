/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class Calculadora {

    public float resultado; // variável "resultado" receberá o resultado da operação

    public float somar(float a, float b) { // somará os números "a" e "b" passados como parâmetros
        return this.resultado = a + b; // a propriedade resultado recebe a soma dos parâmetros "a" e "b"
    }

    public float multiplicar(float a, float b) { // multiplicará os números "a" e "b" passados como parâmetros
        return this.resultado = a * b; // a propriedade resultado recebe a multiplicação dos parâmetros "a" e "b"
    }

    public float dividir(float a, float b) {  // dividirá o número "a" por "b" passados como parâmetros
        return this.resultado = a / b; // a propriedade resultado recebe a divisão do parâmetro "a" por "b"
    }

    public float subtrair(float a, float b) { // subtrairá o número "b" de "a" passados como parâmetros
        return this.resultado = a - b; // a propriedade resultado recebe a diferença do parâmetro "a" por "b"
    }

    public float potencia(double base, double expoente) { // Calculará a ponteciação de base elevada a expoente
        return this.resultado = (float) Math.pow(base, expoente); // a propriedade resultado recebe potênciação calculada pela Math.pow()
        // (float) "cast" converte o resultado double retornado pela Math.pow para float
    }

    public float raizQuadrada(double numero) { // Calculará a raiz quadrada de numero
        return this.resultado = (float) Math.sqrt(numero); // a propriedade resultado recebe raiz quadrada de numero retornada por Math.sqrt()
        // (float) "cast" converte o resultado double retornado pela Math.pow para float
    }

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "O resultado da Operação é " + this.resultado);
    }
}
