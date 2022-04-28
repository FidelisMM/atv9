
/**
 *
 * @author Matheus - 11211100176 / Renato - 11221401522
 */
public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregado mensalista
        men1 = new Mensalista("José", "Rua ABC", "Junior");
        men1.calcularSalario();
        men1.calcularINSS();
        men1.calcularIRPF();

        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua Sem Fim", "Senior");
        men2.calcularSalario();
        men2.calcularINSS();
        men2.calcularIRPF();

        men2.imprimir();

        // Empregado Horista
        hora1 = new Horista("Carlos", "Rua XYZ", 20);
        hora1.calcularSalario();
        hora1.calcularINSS();
        hora1.calcularIRPF();

        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do Centro", 100);
        hora2.calcularSalario();
        hora2.calcularINSS();
        hora2.calcularIRPF();

        hora2.imprimir();
    }
}
