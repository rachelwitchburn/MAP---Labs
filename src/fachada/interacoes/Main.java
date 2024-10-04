package fachada.interacoes;

public class Main {
    public static void main(String[] args) {
        SigFachada sig = new SigFachada();

        // Administração
        sig.agendarReuniao("2024-10-10", "10:00", "Sala 101", "Planejamento Semestral");
        sig.agendarReuniao("2024-10-04", "13:00", "Sala 201", "Planejamento Semestral - Continuidade");
        sig.agendarReuniao("2024-10-10", "15:00", "Sala 400-A", "Planejamento Anual");
        sig.agendarReuniao("2024-10-10", "09:00", "Sala 50-B", "Reunião sobre almoxarifado");

        sig.marcarEntrevista("Prof. João", "2024-10-11", "15:00");

        // Financeiro
        sig.gerarBalancoContas(50000, 30000);
        sig.adicionarFolhaPagamento("Maria", 4000, "2024-10-05");

        // Professor
        sig.registrarProfessor("Prof. João");
        // Aluno
        sig.adicionarDisciplinaAluno("Pedro", "Matemática", 8.5);
        sig.gerarHistoricoAluno("Pedro");

        // Almoxarifado
        sig.adicionarProdutoEstoque("Caderno", 200);
        sig.criarPedidoCompra("Caneta", 500, 100);

        // Infraestrutura
        sig.alocarSala("Sala 202", "08:00 - 10:00", "Aula de Física");
    }
}