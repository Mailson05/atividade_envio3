

class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(this.getNome() + " está latindo!");
    }
}
