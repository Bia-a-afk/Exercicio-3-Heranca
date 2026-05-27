public class Produto {

    // Atributos
    protected String descricao;
    protected float valor;

    // Construtor
    public Produto(String descricao, float valor) {

        this.descricao = descricao;
        this.valor = valor;
    }

    // Metodo calcular valor final
    public float calcularValorFinal() {

        return valor;
    }

    // Mostrar dados
    public void exibir() {

        System.out.println("Descricao: " + descricao);

        System.out.println("Valor final: "
                + calcularValorFinal());
    }
}