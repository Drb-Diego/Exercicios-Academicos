using System;

namespace Exercicio_Hospital
{
    class Program
    {
        static void Main(string[] args){
            //Hospital
            Hospital hospital = new Hospital();

            hospital.endereco = "av. qualquer coisa";
            hospital.nome = "clinica qualquer coisa";
            hospital.quantidade_de_leitos = 4;
            hospital.quantidade_de_funcionarios = 2;
            hospital.salario_medio = 1000;

            Console.WriteLine("*-------------------------- HOSPITAL -----------------------------------*\n" + "Endereço: " + hospital.endereco + "\nNome: " + hospital.nome + "\nQuantidade de leitos: " + hospital.quantidade_de_leitos + "\nQuantidade de Funcionarios: " + hospital.quantidade_de_funcionarios + "\nSalario Medio: " + (hospital.salario_medio * hospital.quantidade_de_funcionarios) + "\n*-----------------------------------------------------------------------*");

           
           //Hospital de Campanha
           Campanha campanha = new Campanha();
           
           campanha.endereco = "AV. Qualquer coisa 2";
           campanha.nome = "Clinica qualquer coisa (campanha)";
           campanha.quantidade_de_leitos = 6;
           campanha.quantidade_de_funcionarios = 10;
           campanha.salario_medio = 1000;
           campanha.quantidade_de_respiradores = 10;

           Console.WriteLine ("*-------------------------- HOSPITAL CAMPANHA --------------------------*\n" + "Endereço: " + campanha.endereco + "\nNome: " + campanha.nome + "\nQuantidade de leitos: " + campanha.quantidade_de_leitos + "\nQuantidade de Funcionarios: " + campanha.quantidade_de_funcionarios + "\nSalario Medio: " + (campanha.salario_medio * campanha.quantidade_de_funcionarios) + "\nQuantidade de Respiradores Disponiveis: " + campanha.quantidade_de_respiradores +  "\n*------------------------------------------------------------------------*"); 

            //Hospital de Upa
            Upa upa = new Upa();
            
            upa.endereco = "AV. Qualquer coisa 3";
            upa.nome = "Clinica qualquer coisa (upa)";
            upa.quantidade_de_leitos = 6;
            upa.quantidade_de_funcionarios = 8;
            upa.salario_medio = 2000;
            upa.quantidade_de_ambulancia = 10;
            upa.quantidade_de_ambulancia = 10;

           
            
           Console.WriteLine ("*-------------------------- HOSPITAL UPA --------------------------------*\n" + "Endereço: " + upa.endereco + "\nNome: " + upa.nome + "\nQuantidade de leitos: " + upa.quantidade_de_leitos + "\nQuantidade de Funcionarios: " + upa.quantidade_de_funcionarios + "\nSalario Medio: " + (upa.salario_medio * upa.quantidade_de_funcionarios) + "\nQuantidade de Ambulancias: " + upa.quantidade_de_ambulancia + "\n*------------------------------------------------------------------------*");             
        }
    }
}
