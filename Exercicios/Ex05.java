/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class Ex05 {
    
public  static  void  principal ( String [] args ){
         Scanner  entrada = new  Scanner ( System . in );
         
         int  base , altura ;
         
           Sistema . fora . println ( "Digite o valor da altura: " );
           altura = entrada . proximoInt ();
           
           Sistema . fora . println ( "Digite o valor da base: " );
           base = entrada . proximoInt ();
           
           int  resultado = base * altura / 2 ;
            Sistema . fora . println ( "O valor da área do triângulo é: " + resultado );

}
