package main_tester;

import super_classes.Animal;
import sub_classes.Cachorro;
import sub_classes.Gato;
import sub_classes.Ave;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String entrada;
        int entradaNumerica;

        System.out.println("Olá, Tudo bem? \nEsse é o sistema de cadastro de \"Pets\"");
        System.out.println("Deseja Cadastrar o seu PET ? (\"YES\" or \"NO\") ");
        entrada = sc.nextLine();

        if (entrada.equalsIgnoreCase("yes")) {

            System.out.println("Por favor digite o tipo do seu animal de estimação");
            System.out.println("Cachorro\t|\tGato\t|\tAve");
            entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("cachorro")) {
                ArrayList<Cachorro> dogs = new ArrayList<Cachorro>();
                do {
                    Cachorro cadastro = new Cachorro();// A cada iteração  o objeto é salvo no arraylist e resetado
                    cadastro.setPet();
                   
                   dogs.add(cadastro);

                    System.out.println("O número de animais cadastrados é: "+dogs.size()+"\n");

                    System.out.println("Deseja Cadastrar outro PET ? (\"YES\" or \"NO\") \n");
                    entrada = sc.nextLine();
                } while (entrada.equalsIgnoreCase("yes"));

                System.out.println("Seus animaizinhos foram cadastrados em nosso sistema.\n");

                System.out.println("Deseja conferir os animais cadastrados \" YES\"  or \"NO\" ?");
                entrada = sc.nextLine();

                if(entrada.equalsIgnoreCase("yes") ){

                      System.out.println(" ---------------------------------------ANIMAIS CADASTRADOS---------------------------------------\n");
                      
                      for( Cachorro dog : dogs){
                        System.out.print("\tNOME: "+dog.getNome()+"\t\t");
                        System.out.print("RAÇA: "+dog.getRaca()+"\t\t");
                        System.out.print("IDADE: "+dog.getIdade()+"\t\t");
                        System.out.print("GENERO: "+dog.getGenero()+"\n\n");

                      }
                      System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                    
                }else{
                   System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                }

            } else if (entrada.equalsIgnoreCase("gato")) {
                ArrayList<Gato> cats = new ArrayList<Gato>();
                do {
                    Gato cadastro = new Gato();// A cada iteração  o objeto é salvo no arraylist e resetado
                    cadastro.setPet();
                   
                    cats.add(cadastro);

                    System.out.println("O número de animais cadastrados é: "+cats.size()+"\n");

                    System.out.println("Deseja Cadastrar outro PET ? (\"YES\" or \"NO\") \n");
                    entrada = sc.nextLine();
                } while (entrada.equalsIgnoreCase("yes"));

                System.out.println("Seus animaizinhos foram cadastrados em nosso sistema.\n");

                System.out.println("Deseja conferir os animais cadastrados \" YES\"  or \"NO\" ?");
                entrada = sc.nextLine();

                if(entrada.equalsIgnoreCase("yes") ){

                      System.out.println(" ---------------------------------------ANIMAIS CADASTRADOS---------------------------------------\n");
                      
                      for( Gato cat : cats){
                        System.out.print("\tNOME: "+cat.getNome()+"\t\t");
                        System.out.print("RAÇA: "+cat.getRaca()+"\t\t");
                        System.out.print("IDADE: "+cat.getIdade()+"\t\t");
                        System.out.print("GENERO: "+cat.getGenero()+"\n\n");

                      }
                      System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                    
                }else{
                   System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                }

            } else if (entrada.equalsIgnoreCase("ave")) {
                ArrayList<Ave> aves = new ArrayList<Ave>();
                do {
                    Ave cadastro = new Ave();// A cada iteração  o objeto é salvo no arraylist e resetado
                    cadastro.setPet();
                   
                    aves.add(cadastro);

                    System.out.println("O número de animais cadastrados é: "+aves.size()+"\n");

                    System.out.println("Deseja Cadastrar outro PET ? (\"YES\" or \"NO\") \n");
                    entrada = sc.nextLine();
                } while (entrada.equalsIgnoreCase("yes"));

                System.out.println("Seus animaizinhos foram cadastrados em nosso sistema.\n");

                System.out.println("Deseja conferir os animais cadastrados \" YES\"  or \"NO\" ?");
                entrada = sc.nextLine();

                if(entrada.equalsIgnoreCase("yes") ){

                      System.out.println(" ---------------------------------------ANIMAIS CADASTRADOS---------------------------------------\n");
                      
                      for( Ave ave : aves){
                        System.out.print("\tNOME: "+ave.getNome()+"\t\t");
                        System.out.print("RAÇA: "+ave.getRaca()+"\t\t");
                        System.out.print("IDADE: "+ave.getIdade()+"\t\t");
                        System.out.print("GENERO: "+ave.getGenero()+"\n\n");

                      }
                      System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                    
                }else{
                   System.out.println(" ---------------------------------------PROGRAMA FINALIZADO---------------------------------------");
                }
               
            }

        } else if (entrada.equalsIgnoreCase("no")) {
            System.out.println("O programa será encerrado");

            do {
                System.out.println("Digite 0 para encerrar o programa");
                entradaNumerica = sc.nextInt();

                if (entradaNumerica == 0) {
                    for (int i = 10; i != 0; i--) {
                        System.out.println("Desligando sistemas em " + i);
                    }
                    System.out.println("Sitema Desligado");
                }
            } while (entradaNumerica != 0);

        } else {
            System.out.println("Resposta Incorreta, Digite novamente !.");
        } // else YES or NO - cadastro animal

        sc.close();// fechando entrada de teclado do System

      
    }
}
