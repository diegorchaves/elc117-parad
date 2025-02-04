import java.sql.SQLException;
import java.util.Scanner;

public class Plano {
    private Integer codigo;
    private String nome;
    private double valorMensal;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValorMensal() {
        return valorMensal;
    }
    public String toString() {
        return("Codigo: "+codigo+"\tNome: "+nome+"\tValor mensal: R$ "+valorMensal);
    }

    public void getDadosPlano(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do plano: ");
        this.setNome(entrada.nextLine());

        System.out.println("Informe o valor mensal do plano: ");
        var str = entrada.nextLine();
        try {
            this.setValorMensal(Double.parseDouble(str));
        } catch (NumberFormatException e) {
            System.out.println(str + " nao é um numero valido.");
        }


    }
}