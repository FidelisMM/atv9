
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    protected double descIRPF;
    protected double descINSS;

    // Construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularIRPF() {
        if (salario <= 1903.98) {
            descIRPF = 0;
        } else if (salario > 1903.98 && salario <= 2826.65) {
            descIRPF = salario * 0.075;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            descIRPF = salario * 0.15;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            descIRPF = salario * 0.225;
        } else if (salario > 4664.68) {
            descIRPF = salario * 0.275;
        }
    }

    public void calcularINSS() {
        if (salario <= 1212) {
            descINSS = salario * 0.075;
        } else if (salario > 1212 && salario <= 2427.35) {
            descINSS = salario * 0.09;
        } else if (salario > 2427.35 && salario <= 3641.03) {
            descINSS = salario * 0.12;
        } else if (salario > 3641.03 && salario <= 7087.22) {
            descINSS = salario * 0.14;
        } else {
            descINSS = salario * 0.14;
        }
    }

    public void imprimir() {
        System.out.printf("\n" + "Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" + "Salário: " + salario + "\n\n" + "Desconto IRPF: " + descIRPF + "\n" + "Desconto INSS: " + descINSS + "\n");

        if (salario == 0) {
            System.out.println("Cargo Inválido!");
        }
    }
}
