/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class Ex04 {

public  static  void  principal ( String [] args ){
        Scanner  x = novo  Scanner ( System . in );
        
        int  a , b ; // -> atalho para fazer a soma
         
            Sistema . fora . println ( "Digite o valor de A:" );
        a = x . proximoInt (); // -> copia de scanner de A, o parenteses permite q usuario add um numero
        
            Sistema . fora . println ( "Digite o valor de B:" );
           b = x . proximoInt ();
           
        int  soma = a + b ;
            Sistema . fora . println ( "Digite o valor da soma é: " + soma );
            Sistema . fora . printf ( "\n O resultado é %d \n" , soma );
    }

    
}
