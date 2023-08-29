
package exercicio04;


public class CalculoIRPF {

    public static void main(String[] args) {
        ImpostoRenda Irpf = new ImpostoRenda();
        Irpf.leDados();
        
       if (Irpf.verificaDados()){
           InOut.MsgDeInforma("Valor do Imposto de renda",Double.toString(Irpf.calculaImposto()));
         }else{
           InOut.MsgDeErro("ERRO", "Não é possivel calcular o imposto de renda com tais valors");
       }
    }  
}
