import javax.swing.JOptionPane;

public class JavaSprint01 {
    public static void main(String[] args) {
        Object[] possibleValues = {"Moeda", "Temperatura"};
        Object conversor = JOptionPane.showInputDialog(null,
                "Selecione um conversor", 
                "Conversor",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                possibleValues, possibleValues[0]);

        if (conversor == possibleValues[0]) {
            System.out.println("Qual a moeda selecionada");
        } else {
            System.out.println("Selecione a temperatura");
        }
    }   
}
