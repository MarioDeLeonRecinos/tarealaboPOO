/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Convertor;

/**
 *
 * @author LN710Q
 */
public class Binario implements Convertor{
    @Override
    public String resultado(int n1){
        return Integer.toBinaryString(n1);
    }
}
