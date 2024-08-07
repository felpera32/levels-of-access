public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 26);

        // Acesso ao público
        System.out.println("Nome: " + pessoa.nomePublico);

        // Acesso ao protegido, dentro do mesmo pacote
        System.out.println("Idade: " + pessoa.getIdadeProtegida());

        // Acesso ao membro privado através de métodos públicos
        pessoa.setNomePrivado("Francis");
        System.out.println("Nome privado: " + pessoa.getNomePrivado());
    }
}
