

class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(this.getNome() + " está miando!");
    }
}
