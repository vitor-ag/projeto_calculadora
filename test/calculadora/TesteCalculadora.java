package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Each test prints the input and the expected result;
        // the obtained result is printed by the Calculadora itself
        System.out.println("Entrada: 2 + 3 | Esperado: 5");
        calc.calc(2, 3, "+");

        System.out.println("Entrada: 10 - 4 | Esperado: 6");
        calc.calc(10, 4, "-");

        System.out.println("Entrada: 3 * 5 | Esperado: 15");
        calc.calc(3, 5, "*");

        System.out.println("Entrada: 8 / 2 | Esperado: 4");
        calc.calc(8, 2, "/");

        System.out.println("Entrada: 8 / 0 | Esperado: erro de divisao por zero e resultado 0");
        calc.calc(8, 0, "/");

        System.out.println("Entrada: 5 x 5 | Esperado: operacao invalida e resultado 0");
        calc.calc(5, 5, "x");
    }
}