package Exercicios;

public class CalculadoraExercicio1 {
    private double a;
    private double b;
    private double c;

    public CalculadoraExercicio1(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) {
            System.out.println("Aviso: A não pode ser negativo. Definido como 0.");
            this.a = 0;
        } else {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0) {
            System.out.println("Aviso: B não pode ser negativo. Definido como 0.");
            this.b = 0;
        } else {
            this.b = b;
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c < 0) {
            System.out.println("Aviso: C não pode ser negativo. Definido como 0");
            this.c = 0;
        } else {
            this.c = c;
        }
    }

    public double somaCalc() {
        return a + b;
    }

    public void verificaSomaC() {
        double soma = somaCalc();
        System.out.println("A soma de A + B é: " + soma);
        if (soma < c) {
            System.out.println("A soma é menor que C.");
        } else if (soma > c) {
            System.out.println("A soma é maior que C.");
        } else {
            System.out.println("A soma é igual a C.");
        }
    }
}
