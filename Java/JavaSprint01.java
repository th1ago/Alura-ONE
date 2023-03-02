import javax.swing.JOptionPane;

public class JavaSprint01 {
    public static void main(String[] args) {
        Object[] possibleValues = {"Moeda, Temperatura"};
        JOptionPane.showInputDialog(null,
        "Selecione um conversor", 
        "Conversor",
        JOptionPane.INFORMATION_MESSAGE, null,
        possibleValues, possibleValues[0]);
    }   
}
