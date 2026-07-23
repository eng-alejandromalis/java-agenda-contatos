package controller;

import domain.Contato;
import service.ContatoService;
import java.util.List;

public class ContatoController {

    // Instância do service
    private final ContatoService service;

    // Construtor
    public ContatoController(ContatoService service) {
        this.service = service;
    }

    // Chama o método que cadastra o contato
    public boolean cadastrar(Contato contato) {
        return service.cadastrar(contato);
    }

    // Chama o método que lista os contatos da agenda
    public List<Contato> listarTodos() {
        return service.listarTodos();
    }

    // Chama o método que busca o contato pelo id
    public Contato buscarPorId(int id) {
        return service.buscarPorId(id);
    }

    // Chama o método que busca o contato pelo nome
    public Contato buscarPorNome(String nome) {
        return service.buscarPorNome(nome);
    }

    // Chama o método que atualiza o contato da agenda
    public boolean atualizar(Contato contato) {
        return service.atualizar(contato);
    }

    // Chama o método que remove o contato da agenda
    public boolean remover(int id) {
        return service.remover(id);
    }
}