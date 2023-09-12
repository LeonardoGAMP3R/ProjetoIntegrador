public class Imovel {
    private String end;
    private String cidade;

    public Imovel() {
    }

    public Imovel(String end) {
        this.end = end;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void imprimirDadosImovel() {
        System.out.println("Endereço: " + end);
        System.out.println("Cidade: " + cidade);
    }

    @Override
    public String toString() {
        return "Endereço: " + end + "\nCidade: " + cidade;
    }
}

