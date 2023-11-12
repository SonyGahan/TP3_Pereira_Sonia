package TP3;

import java.util.ArrayList;
import java.util.List;

public class TransformadorMayusculas {

    //Declaro el metodo que utiliza la interfaz para transformar cada string en mayuscula
    public static List<String> transformarStrings(List<String> lista, IMayusculas imayusculas) {
        List<String> listaTransformada = new ArrayList<>();
                       
        lista.forEach((s) -> listaTransformada.add(imayusculas.transformar(s))); 
        return listaTransformada;
    }

    public static void main(String[] args) {
        List<String> listaOriginal = List.of("hola", "desde", "java", "mundo");

        //Implementamos la interfaz funcional utilizando una expresion lambda
        IMayusculas mayusculas = (s) -> s.toUpperCase();

        //Llamada al metodo para transformar las cadenas en mayusculas
        List<String> listaTransformada = transformarStrings(listaOriginal, mayusculas);

        //Mostramos el resultado
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Transformada: " + listaTransformada);
    }

}

