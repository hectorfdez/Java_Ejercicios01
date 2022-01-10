/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;
import java.util.Arrays;
/**
 *
 * @author Héctor Fernández
 */
public class EjerciciosNivel01 {

public int[] maximos(int[] lista){
    int[] arrayMaximos = {0,0};
    for (int i=0; i<lista.length;)
        if(lista[i]>arrayMaximos[0]){
            arrayMaximos[1] = arrayMaximos[0];
            arrayMaximos[0] = lista[i];
        }
        else if (lista[i]>arrayMaximos[0]){
             arrayMaximos[1] = lista[i];
        }
    
   return arrayMaximos;
}
//segundo ejercicio: PALÍNDROMO
//para hacer este ejercicio necesito hacer primero una función
//que "LIMPIE" el string para quitarle los acentos y espacios en blancos
    
    private String limpiaFrase(String frase){
        frase = frase.toLowerCase();//paso la frase a minúsculas
        frase = frase.replace('á', 'a');
        frase = frase.replace('é', 'e');
        frase = frase.replace('í', 'i');
        frase = frase.replace('ó', 'o');
        frase = frase.replace('ú', 'u');
        //quito también los espacios en blanco
        frase = frase.replace(" ", "");
        
        return frase;
    }
    
    public boolean esPalindromo(String frase){
        frase = limpiaFrase(frase);// quita acentos y espacios
        int indiceIzquierdo = 0;
        int indiceDerecho = frase.length();
        
        while (frase.charAt(indiceIzquierdo)== frase.charAt(indiceDerecho)&& indiceIzquierdo<=indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if(indiceIzquierdo > indiceDerecho){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        int[] numeros = {99,37,7,54,13};
        int[] numeros2 = {-1,100,8,84,103,100005,77};
        EjerciciosNivel01 e = new EjerciciosNivel01();
        System.out.print(Arrays.toString(e.maximos(numeros)));
        System.out.print(Arrays.toString(e.maximos(numeros)));
        
        System.out.println(e.esPalindromo("Acaso hubo buhos aquí"));
    }
}
