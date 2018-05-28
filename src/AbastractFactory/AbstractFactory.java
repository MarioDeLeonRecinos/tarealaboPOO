/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory;

import AbastractFactory.Aritmetica.Aritmetica;
import AbastractFactory.Convertor.Convertor;
/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getOperacionA(String operacion);
    Convertor resultado();
}