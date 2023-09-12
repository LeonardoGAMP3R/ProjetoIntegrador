public class Apartamento extends Imovel {
    private double condominio;

    public Apartamento() {
    }

    public void setCondominio(String condominio) {
        this.condominio = Double.parseDouble(condominio);
    }

    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }

    @Override
    public void imprimirDadosImovel() {
        super.imprimirDadosImovel();
        System.out.println("Valor do Condomínio: " + condominio);
    }

    public double getCondominio() {
        return condominio;
    }
}
