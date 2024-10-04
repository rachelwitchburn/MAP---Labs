package fachada.financeiro;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {
    private List<String> funcionarios;

    public Financeiro() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(String funcionario) {
        funcionarios.add(funcionario);
    }

    public List<String> getFuncionarios() {
        return funcionarios;
    }

    public String getFolhaPagamento() {
        return "Folha de pagamento";
    }

    public String getDespesas() {
        return "Despesas";
    }

    public String getReceitas() {
        return "Receitas";
    }

    public void adicionarFolhaPagamento(String funcionario, double salario, String dataPagamento) {
        System.out.println("Folha de pagamento adicionada: " + funcionario + " - " + salario + " - " + dataPagamento);
    }

    public void gerarBalancoContas(double receita, double despesa) {
        System.out.println("Balanco de contas gerado: Receita: " + receita + " - Despesa: " + despesa);
    }
}
