package service;

import domain.Contato;
import repository.ContatoRepository;
import java.util.List;

public class ContatoService {

    // Instância do repositório
    private final ContatoRepository repository;

    // Injeção do repositório pelo construtor. Desacopla e facilita a manutenção do código
    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    // Método que realiza as validações para o cadastro do novo contato na agenda
    public boolean cadastrar(Contato contato) {
        if (contato == null) {
            System.out.println("Não foi possível cadastrar o contato. Tente novamente.");
            return false;
        }
        else if (repository.buscarPorId(contato.getId()) != null) {
            System.out.println("Não foi possível cadastrar o contato. Tente novamente.");
            return false;
        } else {
            System.out.println("Contato cadastrado com sucesso.");
            repository.salvar(contato);
            return true;
        }
    }

    // Chama o método que lista todos os contatos da agenda
    public List<Contato> listarTodos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado. Tente novamente.");
            return null;
        } else {
            return repository.listarTodos();
        }
    }

    // Chama o método que busca o contato pelo id
    public Contato buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    // Chama o método que busca o contato pelo nome
    public Contato buscarPorNome(String nome) {
        return repository.buscarPorNome(nome);
    }

    // Método que realiza as validações para poder atualizar um contato já existente na agenda
    public boolean atualizar(Contato contato) {
        if (repository.buscarPorId(contato.getId()) == null) {
            System.out.println("Contato não encontrado. Tente novamente.");
            return false;
        } else {
            System.out.println("Contato atualizado com sucesso.");
            return repository.atualizar(contato);
        }
    }

    // Método que realiza as validações para poder remover um contato da agenda
    public boolean remover(int id) {
        if (repository.buscarPorId(id) == null) {
            System.out.printl("Contato não encontrado.")
            return false;
        } else {
            System.out.println("Contato não encontrado.")
            return repository.remover(id);
        }
    }
}