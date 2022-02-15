package sub_classes;

import super_classes.Animal;
public class Ave extends Animal {
    

// Construtores passando parâmetros para os construtores de sua super classe.

public Ave() {
    super();
}

public Ave(String nome) {
    super(nome);
}

public Ave(String nome, int idade) {
    super(nome, idade);
}

public Ave(String raca, char genero) {
    super(raca, genero);
}

public Ave(String nome, String raca, int idade, String genero) {
    super(nome, raca, idade, genero);
}

public Ave(String nome, int idade, String raca, String genero) {
    this(nome, idade);
    setRaca(raca);
    setGenero(genero);
}





    
}
