using System.Collections.Generic;

namespace Atividade_pets
{
    public class Dono
    {
        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Endereco { get; set; }
        
        public List<Pet> pets = new List<Pet>();

        public void adicionar_pets (Pet pet){
            pets.Add(pet);
        }

        

        



        
    }
}