
import javax.swing.JOptionPane; // Importando a ferramenta de janelas!

public class PROJETO2FALHO {
    public static void main(String[] args) {
        boolean alex = false;
        // Apaguei o Scanner daqui!
        int alexs;
        int soma;

        do {
            try {
                alexs = 0;
                soma = 0;

                int[] intervalo = new int[2];

                // JANELA 1: Pergunta o "De" e já converte para int
                String deTexto = JOptionPane.showInputDialog(null, "Você quer somar os números em qual intervalo?\nDe:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
                intervalo[0] = Integer.parseInt(deTexto);

                // JANELA 2: Pergunta o "Até" e já converte para int
                String ateTexto = JOptionPane.showInputDialog(null, "Até:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
                intervalo[1] = Integer.parseInt(ateTexto);

                int meio = (intervalo[1] - intervalo[0]) + 1;
                int[] numeros = new int[meio];

                for(int i = intervalo[0]; i <= intervalo[1]; i++){
                    numeros[alexs] = i;
                    alexs++;
                }

                // JANELA 3: Menu
                String menu = "Você quer somar quais números?\n1. Números pares\n2. Números Ímpares\n3. Todos os números";
                String escolhaTexto = JOptionPane.showInputDialog(null, menu, "Escolha uma opção", JOptionPane.QUESTION_MESSAGE);
                int d = Integer.parseInt(escolhaTexto);

                if (d == 1 && (numeros[0] % 2) == 0) {
                    for (int i = numeros[0]; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                }
                else if (d == 1 && (numeros[0] % 2) == 1) {
                    for (int i = numeros[0] + 1; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                }
                else if (d == 2 && (numeros[0] % 2) == 0) {
                    for (int i = numeros[0] + 1; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                }
                else if (d == 2 && (numeros[0] % 2) == 1) {
                    for (int i = numeros[0]; i <= intervalo[1]; i = i + 2) {
                        soma = soma + i;
                    }
                }
                else {
                    for (int i = numeros[0]; i <= intervalo[1]; i++) {
                        soma = soma + i;
                    }
                }

                // JANELA 4: Mostra o resultado final
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                alex = true;

            } catch (Exception e) {
                // JANELA 5: Se o cabra digitar letra ou cancelar, dá a tela de erro com o X vermelho!
                JOptionPane.showMessageDialog(null, "Você fez alguma coisa de errado!\nDigite apenas números.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (!alex);
    }
}