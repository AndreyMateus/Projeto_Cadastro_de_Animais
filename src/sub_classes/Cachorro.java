package sub_classes;

import super_classes.Animal;//Importanto a classe Animal para poder herdar ela com o extends. - Importar é basicamente dizer o caminho de onde ela está localizada.


//Extendendo a classe Cachorro para herdar as propriedades e métodos da classe animal 
public class Cachorro extends Animal {
    
  


  //Construtores passando parâmetros para os construtores de sua super classe.
  public Cachorro(){
    super();
  }

  public Cachorro(String nome){
    super(nome);
  }

  public Cachorro(String nome, int idade){
    super(nome,idade);
  }

  public Cachorro(String raca, char genero){
    super(raca,genero);
  }

  public Cachorro(String nome, String raca, int idade, String genero){
    super(nome,raca,idade,genero);
  }

  public Cachorro(String nome,  int idade, String raca, String genero){
   this(nome,idade);
   setRaca(raca);
   setGenero(genero); 
  }

  //Sobreescrita de método
  /**
   * @Override Recebe um valor pelo parâmetro, aprimora o valor e passa o valor para o método definido na super classe.
   */
  @Override 
  public void setIdade(int idade){
    idade = idade*7;//A idade de um cachorro é a mutiplicação do ano por 7.
    super.setIdade(idade);
    System.out.println("Idade do seu cachorro foi definida como "+idade+" anos");
  }



}
