/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Convertor;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Aritmetica.Aritmetica;

/**
 *
 * @author mcdre
 */
public class FactoryConvertor implements AbstractFactory {

    @Override
    public Aritmetica getOperacionA(String operacion) {
        return null;
    }

    @Override
    public Convertor resultado() {
        return new Binario();
    }
    
}
