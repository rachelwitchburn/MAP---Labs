package fachada.interacoes;

import fachada.alunos.AlunoController;
import fachada.financeiro.Financeiro;
import fachada.administrativo.*;
import fachada.professores.ProfessorController;
import fachada.infraestrutura.Infraestrutura;
import fachada.almoxarifado.Almoxarifado;

public class SigFachada {
    private Administrativo administrativo;
    private Financeiro financeiro;
    private ProfessorController professorController;
    private AlunoController  alunoController;
    private Almoxarifado almoxarifado;
    private Infraestrutura infraestrutura;

    public SigFachada() {
        this.administrativo = new Administrativo();
        this.financeiro = new Financeiro();
        this.professorController = new ProfessorController();
        this.alunoController = new AlunoController();
        this.almoxarifado = new Almoxarifado();
        this.infraestrutura = new Infraestrutura();
    }

    // Métodos simplificados para os subsistemas

    // Administração
    public void agendarReuniao(String data, String horario, String local, String pauta) {
        Reuniao reuniao = new Reuniao(data, horario, local, pauta);
        administrativo.agendarReuniao(reuniao);
    }

    public void marcarEntrevista(String entrevistado, String data, String horario) {
        Entrevista entrevista = new Entrevista(entrevistado, data, horario);
        administrativo.marcarEntrevista(entrevista);
    }

    // Financeiro
    public void gerarBalancoContas(double receita, double despesa) {
        financeiro.gerarBalancoContas(receita, despesa);
    }

    public void adicionarFolhaPagamento(String funcionario, double salario, String dataPagamento) {
        financeiro.adicionarFolhaPagamento(funcionario, salario, dataPagamento);
    }

    // Professores
    public void registrarProfessor(String nome) {
        professorController.registrarProfessor(nome);
    }

    // Alunos
    public void adicionarDisciplinaAluno(String nomeAluno, String nomeDisciplina, double nota) {
        alunoController.adicionarDisciplina(nomeAluno, nomeDisciplina, nota);
    }

    public void gerarHistoricoAluno(String nomeAluno) {
        alunoController.gerarHistorico(nomeAluno);
    }

    // Almoxarifado
    public void adicionarProdutoEstoque(String produto, int quantidade) {
        almoxarifado.adicionarProdutoEstoque(produto, quantidade);
    }

    public void criarPedidoCompra(String produto, double valor, int quantidade) {
        almoxarifado.criarPedidoCompra(produto, valor, quantidade);
    }

    // Infraestrutura
    public void alocarSala(String sala, String horario, String atividade) {
        infraestrutura.alocarSala(sala, horario, atividade);
    }
}