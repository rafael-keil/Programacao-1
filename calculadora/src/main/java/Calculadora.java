public class Calculadora {
    double a;
    double b;
    double c;

    public double subtracao(){
        return a - b;
    }

    public double soma(){
        return a + b;
    }

    public double divisao(){
        return a / b;
    }

    public double multiplicacao(){
        return a * b;
    }

    public double raizQuadrada(){
        return Math.sqrt(a);
    }

    public double exponenciacao(){
        return Math.pow(a, b);
    }

    public double delta(){
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public double bhaskaraX1(){
        return (-b + Math.sqrt(delta())) / (2 * a);
    }

    public double bhaskaraX2(){
        return (-b - Math.sqrt(delta())) / (2 * a);
    }
}
