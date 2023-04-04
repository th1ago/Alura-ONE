import javax.swing.JOptionPane;

public class JavaSprint01 {

    public static void main(String[] args) {

        String opcoes= JOptionPane.showInputDialog(null,
            "Selecione um conversor",
            "Conversor",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{"Conversor de Moeda","Conversor de Temperatura"},
            "Escolha").toString();

        String input = JOptionPane.showInputDialog("Insira um valor");

        Funcao funcao = new Funcao();

        switch (opcoes) {
            case "Conversor de moeda":
                double valorRecebido = Double.parseDouble(input);
                funcao.converterMoedas(valorRecebido);
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar");
                if (resposta == JOptionPane.OK_OPTION) {
                    System.out.println("Escolha opcao afirmatica");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
                break;
            }
    }   
}
