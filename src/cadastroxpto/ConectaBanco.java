/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroxpto;

import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class ConectaBanco {
    private ArrayList<Aluno> banco = new ArrayList<Aluno>();
    
    
    
    public void inseirBanco(Aluno aluno) {
        try{
            String retorno = RegrasValidador.validarMatricula(banco, aluno.getMatricula());
            System.out.println(retorno);
            banco.add(aluno);
            
        }catch(MatriculaInvalidaException e){
            System.out.println(e.getMessage());
        }
        
            
        
    }
    
    
    public ArrayList<Aluno> retornaBanco(){
        return this.banco;
    }
}
