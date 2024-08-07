class Pessoa {
    public String nomePublico;       // Pode ser acessado por qualquer classe
    protected int idadeProtegida;    // Pode ser acessado por classes do mesmo pacote ou subclasses
    private String nomePrivado;      // Só pode ser acessado dentro da própria classe

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nomePublico = nome;
        this.idadeProtegida = idade;
        this.nomePrivado = nome;
    }

    // Método público para acessar o membro protegido
    public int getIdadeProtegida() {
        return idadeProtegida;
    }

    // Métodos públicos para acessar e modificar o membro privado
    public String getNomePrivado() {
        return nomePrivado;
    }

    public void setNomePrivado(String nome) {
        this.nomePrivado = nome;
    }
}