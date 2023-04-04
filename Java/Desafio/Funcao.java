import javax.swing.JOptionPane;

public class Funcao {
    Conversor moedas = new Conversor();

    public void converterMoedas(double valorRecebido){
        String opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a moeda que vai ser convertida",
            "Moedas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[]{"Reais para Dolar","Dolar para Rreal", "Reais para Euro", "Euro para Reais"},
            "Escolha").toString();

        switch (opcao) {
            case "Reais para Dolar":
                moedas.conversorReaisDolar(valorRecebido);
                break;
            case "Reais para Euro":
                moedas.conversorReaisEuro(valorRecebido);
                break;
        }
    }
}
