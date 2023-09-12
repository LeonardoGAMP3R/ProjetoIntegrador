import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class CadastroImoveis {
    public static void main(String[] args) {
        List<Imovel> imoveis = new ArrayList<>();

        while (true) {
            String escolhaStr = JOptionPane.showInputDialog("Escolha o tipo de imóvel (1 - Casa, 2 - Apartamento, 0 - Sair):");

            if (escolhaStr == null) {
                break;
            }

            int escolha = Integer.parseInt(escolhaStr);

            Imovel imovel = null;

            if (escolha == 0) {
                if (imoveis.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum imóvel cadastrado.");
                } else {
                    mostrarImoveisCadastrados(imoveis);
                }
                break;
            } else if (escolha == 1) {
                imovel = new Casa();
            } else if (escolha == 2) {
                imovel = new Apartamento();
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                continue;
            }

            String cidade = JOptionPane.showInputDialog("Digite a cidade do imóvel:");
            imovel.setCidade(cidade);

            if (imovel instanceof Casa) {
                String tamQuintalStr = JOptionPane.showInputDialog("Digite o tamanho do quintal:");
                int tamQuintal = Integer.parseInt(tamQuintalStr);
                ((Casa) imovel).setTamQuintal(tamQuintal);

                String contaAguaStr = JOptionPane.showInputDialog("Digite o valor da conta de água:");
                double contaAgua = Double.parseDouble(contaAguaStr);
                ((Casa) imovel).setContaAgua(contaAgua);
            } else if (imovel instanceof Apartamento) {
                String condominioStr = JOptionPane.showInputDialog("Digite o valor do condomínio:");
                double condominio = Double.parseDouble(condominioStr);
                ((Apartamento) imovel).setCondominio(condominio);
            }

            imoveis.add(imovel);
        }
    }

    public static void mostrarImoveisCadastrados(List<Imovel> imoveis) {
        StringBuilder listaImoveis = new StringBuilder("Lista de imóveis cadastrados:\n");

        for (Imovel imovel : imoveis) {
            listaImoveis.append("Tipo de Imóvel: ").append(imovel.getClass().getSimpleName()).append("\n");
            listaImoveis.append("Cidade: ").append(imovel.getCidade()).append("\n");

            if (imovel instanceof Casa) {
                listaImoveis.append("Tamanho do Quintal: ").append(((Casa) imovel).getTamQuintal()).append("\n");
                listaImoveis.append("Conta de Água: ").append(((Casa) imovel).getContaAgua()).append("\n");
            } else if (imovel instanceof Apartamento) {
                listaImoveis.append("Valor do Condomínio: ").append(((Apartamento) imovel).getCondominio()).append("\n");
            }

            listaImoveis.append("=============================\n");
        }

        JOptionPane.showMessageDialog(null, listaImoveis.toString());
    }
}
