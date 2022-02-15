package super_classes;

import java.util.Scanner;

public class Animal {
    
    //Atributos privados para a aplicação do conceito de Herança
    private String nome; 

    private String raca;

    private int idade;

    private String genero;

    private boolean pedigree;
  

    //Criando os construtores para a inicialização dos atributos com VALORES já preenchidos.
    //Também estamos aplicando uma sobrecarga de contrutores - polimorfismo

    //Construtor padrão que é herdado da classe Object
    public Animal(){

    }

    //Construtores personalizados
    //O modificador de acesso "public" é para que o construtor seja visível a "subclasses" que estão em outros "pacotes".

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String raca, String genero){
        this.raca = raca;
        this.genero = genero;
    }

    public Animal(String nome, String raca, int idade, String genero ){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.genero = genero;
    }

    public Animal(String nome, int idade, String raca, String genero){
        this(nome,idade);//Chamando o próprio construtor que possui a entrada de 2 paramêtros com racas de valores correspondentes ao dados que serão passados.
        this.raca = raca;
        this.genero = genero;
    }

    //Métodos para acessar e modificar as propriedades/atributos privadas 

    //Os métodos SET "Definem" um valor na variável privada que a subclasse não pode enxergar

    //Os métodos GET "Retornam" o valor na variável privada que a subclasse não pode enxergar

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setPedrigree(boolean pedrigree){
        this.pedigree = pedrigree;
      
      }
    
      //o "is" é utilizado como se fosse o "get", porém é somente para os racas booleanos
      public boolean isPedrigree(){
        return this.pedigree;    
      }
    //Caso tenha instânciado um objeto de um construtor padrão e as propriedas vieram sem valores, então também podemos setar/definir o valor para todas as propriedades/atributos de uma vez.
    public void setAllProprities(String nome, String raca, int idade, String genero){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.genero = genero;
    }
    //O método getAllProprities não é possível pois são muitos racas para retornar, então utilizaremos os métodos de retorno que já fizemos acima.


    //Função criar pet
    Scanner sc = new Scanner(System.in);
    String entrada;//Variáveis que coletam valor de entrada não podem ser privadas ou protegidas.
    public void setPet(){
        System.out.println("Qual o nome do seu Animal ?");
        setNome(sc.nextLine());
        
        System.out.println("Qual o genero do seu Animal \"M\" or \"F\" ?");
        setGenero(sc.nextLine());

        System.out.println("Qual a raça do seu Animal ?");
        setRaca(sc.nextLine());

        System.out.println("Quantos anos tem seu Animal ?");
        setIdade(sc.nextInt());

        System.out.println("Seu Animal é pedigree? \"YES\" or \"NO\" ");
        sc.nextLine();
        if(sc.nextLine().equalsIgnoreCase("yes")){
            setPedrigree(true);
        }
        else{
            setPedrigree(false);
        }
    
    }

   










}
