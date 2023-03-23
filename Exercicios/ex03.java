/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex006;

/**
 *
 * @author CAMARGO
 */
public class ex03 {
    
    static long fibo(int n){
        if ( n < 2){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
    public static void main(String[] args) {
        
        for(int i = 0; i <= 12; i++){
            
            System.out.println(ex03.fibo(i));
            
        }
    }
}
