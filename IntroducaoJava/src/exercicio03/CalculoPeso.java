
package exercicio03;


public class CalculoPeso {

    public static void main(String[] args) {
        PesoIdeal meuPeso = new PesoIdeal();
        meuPeso.leDados();
        
        if (meuPeso.verificaDados()){
            InOut.MsgDeInforma("Peso Ideal",Double.toString(meuPeso.calculaPesoIdeal()));
        } else {
            InOut.MsgDeErro("ERRO", "Não é possível definir um resultado com tais valores.");
        }
        }
    }

