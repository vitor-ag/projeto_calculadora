package calculadora;

/**
 * Representa a classe de testes da calculadora.
 * <p>
 * Executa os cenários de soma, subtração, multiplicação, divisão, divisão por zero
 * e operação inválida, exibindo a entrada, o resultado esperado e o resultado obtido.
 *
 * @author Vítor Silva de Aguiar
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa os casos de teste da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: 2 + 3 | Esperado: 5");
        System.out.println("Obtido: " + calc.calcular(2, 3, "+"));

        System.out.println("Subtracao: 10 - 4 | Esperado: 6");
        System.out.println("Obtido: " + calc.calcular(10, 4, "-"));

        System.out.println("Multiplicacao: 3 * 5 | Esperado: 15");
        System.out.println("Obtido: " + calc.calcular(3, 5, "*"));

        System.out.println("Divisao: 8 / 2 | Esperado: 4");
        System.out.println("Obtido: " + calc.calcular(8, 2, "/"));

        // Divisão por zero deve ser reportada como exceção, sem interromper o programa
        System.out.println("Divisao por zero: 8 / 0 | Esperado: IllegalArgumentException");
        try {
            System.out.println("Obtido: " + calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido: excecao -> " + e.getMessage());
        }

        // Operadores não suportados também devem ser reportados como exceção
        System.out.println("Operacao invalida: 5 x 5 | Esperado: IllegalArgumentException");
        try {
            System.out.println("Obtido: " + calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido: excecao -> " + e.getMessage());
        }
    }
}