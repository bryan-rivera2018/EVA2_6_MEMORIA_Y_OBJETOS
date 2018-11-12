/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba oObj = new Prueba();
        oObj.iValor = 100;
        System.out.println("EL valor es: " + oObj.iValor);
        //Copia
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println("iAlgo = " +iAlgo);
        System.out.println("iCopia = " +iCopia);
        iAlgo = 1000;
        System.out.println("iAlgo = " +iAlgo);
        System.out.println("iCopia = " +iCopia);
        //Copia del objeto
        Prueba pCopiaObj = oObj;
        System.out.println("EL valor es: " + oObj.iValor);
        System.out.println("EL valor es: " + pCopiaObj.iValor);
        oObj.iValor = 9999;
        System.out.println("EL valor es: " + oObj.iValor);
        System.out.println("EL valor es: " + pCopiaObj.iValor);
        
    }
    
}
class Prueba{
    int iValor;// 4 BYTES Minimo
}