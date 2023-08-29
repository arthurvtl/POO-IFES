
package exercicio02;

import exercicio01.InOut;

/**
 *
 * @author tuff-
 */
public class TesteTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangulo meuTriangulo = new Triangulo();
        meuTriangulo.leDados();
        
        if (meuTriangulo.verificaTriangulo()){
            InOut.MsgDeInforma("Área do Retângulo",Double.toString(meuTriangulo.calculaArea()));
            InOut.MsgDeInforma("Área do Perimetro",Double.toString(meuTriangulo.calculaPerimetro()));
        } else {
            InOut.MsgDeErro("ERRO", "Não é possível formar um triângulo com tais valores.");
        }
    }
}
