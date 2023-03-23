/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex006;

/**
 *
 * @author CAMARGO
 */
public class ex04 {
    
    void parImpar(){

        int totalpar = 0, totalimpar = 0;

        for(int i = 0; i < 100; i++){

            if(i % 2 == 0){
                totalpar = totalpar + i;     
            }
            else{
                totalimpar = totalimpar + i;
            }
        }

        System.out.println("Soma dos números pares: "+totalpar);
        System.out.println("Soma dos números ímpares: "+totalimpar);

        if(totalpar > totalimpar){
            System.out.println("A soma dos números pares é maior que dos números ímpares.");
        }
        else{
            System.out.println("A soma dos números ímpares é maior que dos números pares.");
        }
    }
}
