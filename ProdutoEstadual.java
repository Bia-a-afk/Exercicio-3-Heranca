public class ProdutoEstadual extends Produto {

    // imposto de 10%
    private float imposto = 10;

    // Construtor
    public ProdutoEstadual(String descricao, float valor) {

        super(descricao, valor);
    }

    // Sobrescrita
    @Override
    public float calcularValorFinal() {

        return valor + (valor * imposto / 100);
    }
}