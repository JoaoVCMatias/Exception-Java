/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroxpto;

/**
 *
 * @author joao
 */
public class CadastroXPTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno("Joao","0001");
        Aluno aluno2 = new Aluno("Pedro","0002");
        Aluno aluno3 = new Aluno("Maria","0001");
        ConectaBanco banco = new ConectaBanco();
        banco.inseirBanco(aluno1);
        banco.inseirBanco(aluno2);
        banco.inseirBanco(aluno3);
        
        
        
    }
    
}
