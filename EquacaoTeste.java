import java.util.Scanner;

class EquacaoTeste {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os coeficientes da equacao%n");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
        double resultado = EquacaoSegundoGrau.calcularDelta(a, b, c);
        System.out.println(resultado);
    }
}