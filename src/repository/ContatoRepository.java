package repository;

import domain.Contato;
import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

    // Lista que simula um banco de dados
    private final List<Contato> contatos;

    // Construtor
    public ContatoRepository() {
        this.contatos = new ArrayList<>();
    }

    // Método que adiciona um novo elemento na agenda
    public void salvar(Contato contato) {
        contatos.add(contato);
    }

    // Método que lista todos os contatos da agenda
    public List<Contato> listarTodos() {
        return new ArrayList<>(contatos);
    }

    // Método que busca um item na lista através de um id
    public Contato buscarPorId(int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) return contato;
        }
        return null;
    }

    // Método que busca um item na lista através de um nome
    public Contato buscarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) return contato;
        }
        return null;
    }

    // Método que atualiza um contato já existente da agenda
    public boolean atualizar(Contato contatoAtualizado) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getId() == contatoAtualizado.getId()) {
                contatos.set(i, contatoAtualizado);
                return true;
            }
        }
        return false;
    }

    // Método que remove um contato da agenda
    public boolean remover(int id) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getId() == id) {
                contatos.remove(i);
                return true;
            }
        }
        return false;
    }
}