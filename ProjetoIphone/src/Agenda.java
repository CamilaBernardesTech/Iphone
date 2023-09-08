public class Agenda {
    @Override
    public String toString() {
        return "Agenda [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }

    private String nome;
    private int telefone;
    private String email;
    
    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public Agenda(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

}
