
package exercicio04;


public class ImpostoRenda {
    
    public double valSalBruto;
    public double valSalLiquido;
    public double valDesconto;
    
    public void leDados(){
        valSalBruto = InOut.leDouble("Digite o valor do salário bruto: ");
    }
    
    public boolean verificaDados(){
        return valSalBruto > 0;
           
            
    }
    public double calculaImposto() {
        
        double calc;
        
        if (valSalBruto > 4664.68){
            calc = (valSalBruto *  0.275) - 869.36;
            
        } else if (valSalBruto >= 3751.06) {
            calc = (valSalBruto * 0.225) - 636.13;
            
        } else if (valSalBruto >= 2826.66){
            calc = (valSalBruto * 0.15) - 354.80;
            
        } else if (valSalBruto >= 1903.99) {
            calc = (valSalBruto * 0.075) - 142.80;
            
        }else{
            calc = valSalBruto - valSalBruto;
        }
       return calc;       
    }
}
