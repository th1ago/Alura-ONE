import javax.swing.JOptionPane;

public class Conversor {
    public void conversorReaisDolar(double valor){
        double moedaDolar = valor / 5.25;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Voce tem $ " + moedaDolar + "dolares");
    }

    public void conversorReaisEuro(double valor){
        double moedaEuro = valor / 5.52;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Voce tem $ " + moedaEuro + "euros");
    }

    // (0 °C × 9/5) + 32 = 32 °F
    public void conversorCelsiusFahrenheit(double c) {
        c = 9 * c / 5 + 32;
    }

    // 0 °C + 273,15 = 273,15 K
    public void conversorCelsiusKelvin(double c) {
         c = c + 273.15;
    }
}