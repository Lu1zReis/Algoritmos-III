package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso c = new Curso(); // tipo_classe nome-var = (criando o objeto) => espaço ciado na memoria para alocar  
        // esconder algo e deixar visivel só em uma determinado momento é conhecido como encasulamento (public, protected, private)
        c.nome = "SI";
        
        Curso c2 = c;
        c2.nome= "CO"; // Var guarda a referencia 

        System.out.println(c.nome);
        System.out.println(c2.nome);
    }
}
