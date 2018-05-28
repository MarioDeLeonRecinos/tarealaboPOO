package AbastractFactory;

import AbastractFactory.Aritmetica.FactoryAritmetica;
import AbastractFactory.Convertor.FactoryConvertor;



public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetica":
                return  new FactoryAritmetica();
            case "convertor":
                return new FactoryConvertor();
        }
        return null;
    }
}
