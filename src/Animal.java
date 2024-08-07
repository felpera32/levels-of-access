class Animal {
    protected String nome;

    protected void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    public void mostrarNome() {
        System.out.println("O nome do cachorro é: " + nome);
    }
}
