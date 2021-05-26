/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cesarino1;

/**
 *
 * @author Francesco
 */
//Classe che definisce il triangolo, calcola la sua area ed il perimetro e pure il tipo che stiamo trattando
public class InfoTriangolo {
    
    private double latoA;
    
    private double latoB;
    
    private double latoC;

    public InfoTriangolo(double latoA, double latoB, double latoC) {
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoB = latoC;
    }

    public double calcolaPerimetro(){

        return latoA + latoB + latoC;
    }

    public double areaTriangolo(){

        double semiPerimetro = this.calcolaPerimetro() / 2;
        double ris = semiPerimetro * (semiPerimetro - latoA) * (semiPerimetro - latoA) * (semiPerimetro - latoC);

        return Math.sqrt(ris);
    }

    public String tipologiaTriangolo(){

        if(latoA == latoB && latoB == latoC && latoC == latoA){

            return "Equilatero";
        }else if(latoC == latoB && latoC != latoA && latoB != latoA){

            return "Isoscele";
        }else if(latoA == latoB && latoA != latoC && latoB != latoC){

            return "Isoscele";
        }else if(latoA == latoC && latoA != latoB && latoC != latoB){

            return "Isoscele";
        }else{

            return "Scaleno";
        }
    }
    
}
