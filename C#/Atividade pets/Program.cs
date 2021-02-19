using System;
using System.Collections.Generic;

namespace Atividade_pets
{
    /*
        Crie um sistema que irá registrar os pets de várias pessoas. As pessoas (donos) serão cadastrados com nome, idade e endereço. E os pets que podem ser gato ou cachorro serão cadastrados ambos com nome, raça, se estão vacinados ou não e idade. Se for cachorro vai cadastrar também se é pequeno, médio ou grande porte. Uma pessoa pode ter vários pets e o pet é apenas de um dono. Liste depois todos os pets e os seus respectivos donos.    
    */

    class Program
    {
        static void Main(string[] args)
        {
            //Criando Lista de donos
            List <Dono> donos = new List<Dono>();
            
            // Cadastrando dono 1 e add na lista
            Dono d1 = new Dono ();
            d1.Nome = "Diego";
            d1.Idade = 20;
            d1.Endereco = "Itapua";
            donos.Add (d1);

            //Cadastrando Pets do dono 1 e add na lista
            Cachorro pet1_Dono1 = new Cachorro ();
            pet1_Dono1.TipoPet = "Cachorro";
            pet1_Dono1.Nome = "Leia";
            pet1_Dono1.Raca = "Sharpei";
            pet1_Dono1.Idade = 5;
            pet1_Dono1.Vacina = true;             
            pet1_Dono1.Tamanho = "Medio";
            d1.adicionar_pets(pet1_Dono1);
            

            Gato pet2_Dono1 = new Gato();
            pet2_Dono1.TipoPet = "Gato";
            pet2_Dono1.Nome = "Luke";
            pet2_Dono1.Raca = "Azul russo";
            pet2_Dono1.Idade = 2;            
            pet2_Dono1.Vacina = false;
            d1.adicionar_pets(pet2_Dono1);
          

            // Cadastrando dono 2 e add na lista
            Dono d2 = new Dono ();
            d2.Nome = "Rafael";
            d2.Idade = 40;
            d2.Endereco = "Barra";
            donos.Add (d2);

            //Cadastrando Pets do dono 2 e add na lista
            Gato pet1_Dono2 = new Gato ();
            pet1_Dono2.TipoPet = "Gato";
            pet1_Dono2.Nome = "Obi-wan";
            pet1_Dono2.Raca = "Angorá";
            pet1_Dono2.Idade = 3;
            pet1_Dono2.Vacina = true;
            d2.adicionar_pets(pet1_Dono2);

            
            Console.WriteLine("*---------------------------------------------------------------------------------*");
            foreach(var dono in donos){
                Console.WriteLine ("Nome: " + dono.Nome + " | Idade: " + dono.Idade + " | Endereco: " + dono.Endereco);
                
                    foreach (var pet in dono.pets){
                        Console.WriteLine ("Nome: " + pet.Nome + " | Animal: " + pet.TipoPet + " | Raça: " + pet.Raca + " | Idade: " + pet.Idade + " | Vacina: " + pet.Vacina);
                    }    
                Console.WriteLine("*---------------------------------------------------------------------------------*");
            }  
            
            





            


        }
    }
}
