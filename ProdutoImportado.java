public class ProdutoImportado extends Produto {

    // imposto 10%
    private float imposto = 10;

    // taxa 5%
    private float taxa = 5;

    // taxa importacao 5%
    private float taxaImportacao = 5;

    // Construtor
    public ProdutoImportado(String descricao,
                            float valor) {

        super(descricao, valor);
    }

    // Sobrescrita
    @Override
    public float calcularValorFinal() {

        return valor
                + (valor * imposto / 100)
                + (valor * taxa / 100)
                + (valor * taxaImportacao / 100);
    }
}