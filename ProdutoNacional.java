public class ProdutoNacional extends Produto {

    // imposto 10%
    private float imposto = 10;

    // taxa 5%
    private float taxa = 5;

    // Construtor
    public ProdutoNacional(String descricao, float valor) {

        super(descricao, valor);
    }

    // Sobrescrita
    @Override
    public float calcularValorFinal() {

        return valor
                + (valor * imposto / 100)
                + (valor * taxa / 100);
    }
}