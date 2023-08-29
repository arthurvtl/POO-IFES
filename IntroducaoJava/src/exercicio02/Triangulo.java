
package exercicio02;

import java.lang.Math;
import exercicio01.InOut;

public class Triangulo {
    
    public double ladoA;
    public double ladoB;
    public double ladoC;
    
    
    public void leDados() {
        ladoA = InOut.leInt("Informe o valor do lado A: ");
        ladoB = InOut.leInt("Informe o valor do lado B: ");
        ladoC = InOut.leInt("Informe o valor do lado C: ");
    }
    
    public double calculaArea() {
        double s = (ladoA+ ladoB + ladoC)/2;
        return (Math.sqrt((s * (s-ladoA)*(s-ladoB)*(s-ladoC))));
    }
        public double calculaPerimetro(){
        return ladoA + ladoB + ladoC;
    }
    public boolean verificaTriangulo(){    
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            return true;    
         } else {
            return false;
        } 
    }
}
