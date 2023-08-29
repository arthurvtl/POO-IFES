
package exercicio03;
import exercicio01.InOut;

public class PesoIdeal {
    
    public double altura;
    public double peso;
    public char sexo;
    
    public void leDados() {
        sexo = InOut.leChar("Informe o sexo [M/F]: ");
        altura = InOut.leDouble("Informe sua altura: ");
        peso = InOut.leDouble("Informe seu peso: ");
    }
    
public boolean verificaDados() {
        if (sexo == 'M' || sexo == 'F'){
            if (peso >= 2 && peso <= 200 && altura >= 1.00 && altura <= 2.50){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }   
}    
public double calculaPesoIdeal(){
    double pesoIdeal;
    if (sexo == 'M'){
        pesoIdeal = (72.7 * altura) - 58;
        return pesoIdeal;
        }else{
            pesoIdeal = (62.1 * altura) - 44.7;
            return pesoIdeal;    
    }
    
    }
}

    