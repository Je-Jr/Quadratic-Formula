public class EquacaoSegundoGrau {
    public static double calcularDelta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }
    public static String calcularResolutiva(double a, double b, double c) {
        double raiz_1 = (-b + Math.sqrt(calcularDelta(a, b, c)))/(2*a);
        double raiz_2 = (-b - Math.sqrt(calcularDelta(a, b, c)))/(2*a);
    
        String res = String.format("Raiz 1 = %.2f raiz 2 = %.2f", raiz_1, raiz_2);
        return res;
    }
}