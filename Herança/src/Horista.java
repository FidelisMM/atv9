
public class Horista extends Empregado {

    private double horas;

    // Construtor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    // Métodos de acesso
    public void setHoras(double h) {
        horas = h;
    }

    public double getHoras() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }
}
