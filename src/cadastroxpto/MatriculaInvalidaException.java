/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroxpto;

/**
 *
 * @author joao
 */
public class MatriculaInvalidaException extends Exception {

    public MatriculaInvalidaException(String mensagemErro, String matricula) {
        super(mensagemErro + " não pode ser cadastrado mais de um funcionário com a matricula: " + matricula);
    }
    
}
