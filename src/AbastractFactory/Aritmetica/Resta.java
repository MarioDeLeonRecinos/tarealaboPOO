/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class Resta implements Aritmetica{
    @Override
    public String resultado(float n1,float n2){
        float n3=n1-n2;
        String strAmount=String.valueOf(n3);
        return strAmount;
    }
}
