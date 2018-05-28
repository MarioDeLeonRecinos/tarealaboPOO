/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbastractFactory.Aritmetica;

import AbastractFactory.AbstractFactory;
import AbastractFactory.Convertor.Convertor;

/**
 *
 * @author mcdre
 */
public class FactoryAritmetica implements AbstractFactory {

    @Override
    public Aritmetica getOperacionA(String operacion) {

        switch (operacion) {
            case "multi":
                return new Multiplicacion();
            case "resta":
                return new Resta();
            case "suma":
                return new Suma();
            case "divi":
                return new Division();
            default:
                return null;
        }
    }

    @Override
    public Convertor resultado() {
        return null;
    }
}

