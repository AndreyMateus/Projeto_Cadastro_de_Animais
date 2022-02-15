package sub_classes;

import super_classes.Animal;

public class Gato extends Animal {

    // Construtores passando parâmetros para os construtores de sua super classe.

    public Gato() {
        super();
    }

    public Gato(String nome) {
        super(nome);
    }

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public Gato(String raca, char genero) {
        super(raca, genero);
    }

    public Gato(String nome, String raca, int idade, String genero) {
        super(nome, raca, idade, genero);
    }

    public Gato(String nome, int idade, String raca, String genero) {
        this(nome, idade);
        setRaca(raca);
        setGenero(genero);
    }

}
