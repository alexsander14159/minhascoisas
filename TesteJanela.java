import javax.swing.JOptionPane;

public class TesteJanela {
    public static void main(String[] args) {
        try {
            // Pede o número na janelinha (ele sempre vem como String)
            String textoDigitado = JOptionPane.showInputDialog("Digite sua idade:");

            // Transforma o texto da janela em int
            int idade = Integer.parseInt(textoDigitado);

            // Mostra o resultado em outra janela
            JOptionPane.showMessageDialog(null, "Daqui a 10 anos você terá " + (idade + 10) + " anos.");

        } catch (Exception e) {
            // Se ele digitar letras, a janela de erro vermelha aparece!
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números!", "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }
}