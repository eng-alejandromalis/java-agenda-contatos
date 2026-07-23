package domain;

public class Contato {

    // Atributos da entidade
    private int id;
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    public Contato(
            int id,
            String nome,
            String telefone,
            String email
    ) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters and Setters

    // Atributo id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Atributo nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Atributo telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Atributo email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
