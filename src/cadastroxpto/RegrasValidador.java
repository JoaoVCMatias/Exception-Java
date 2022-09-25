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
public class RegrasValidador{
    
    public static String validarMatricula(ArrayList<Aluno> banco, String matricula ) throws MatriculaInvalidaException{
        if(banco.isEmpty())
            return "Matricula validada";
        for(Aluno aluno : banco){
            if(aluno.getMatricula().equals(matricula)){
                MatriculaInvalidaException e = new MatriculaInvalidaException("Erro banco,",matricula);
                throw e;
            }            
        }
        return "Matricula validada";
    }
}
