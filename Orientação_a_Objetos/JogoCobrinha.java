package Orientação_a_Objetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class JogoCobrinha extends JPanel implements ActionListener {

    private final int LARGURA_TELA = 600;
    private final int ALTURA_TELA = 600;
    private final int TAMANHO_BLOCO = 25;
    private final int TOTAL_BLOCOS = (LARGURA_TELA * ALTURA_TELA) / (TAMANHO_BLOCO * TAMANHO_BLOCO);

    // Lista de pontos que formam o corpo da cobra (Uso de ArrayList)
    private final ArrayList<Point> corpoCobra = new ArrayList<>();
    private Point comida;
    private char direcao = 'D'; // R: Direita, L: Esquerda, U: Cima, D: Baixo
    private boolean rodando = false;
    private Timer timer;

    public JogoCobrinha() {
        this.setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
        iniciarJogo();
    }

    public void iniciarJogo() {
        corpoCobra.clear();
        corpoCobra.add(new Point(5 * TAMANHO_BLOCO, 5 * TAMANHO_BLOCO)); // Posição inicial
        criarComida();
        rodando = true;
        timer = new Timer(150, this); // Velocidade do jogo (ms)
        timer.start();
    }

    public void criarComida() {
        Random random = new Random();
        int x = random.nextInt((int) (LARGURA_TELA / TAMANHO_BLOCO)) * TAMANHO_BLOCO;
        int y = random.nextInt((int) (ALTURA_TELA / TAMANHO_BLOCO)) * TAMANHO_BLOCO;
        comida = new Point(x, y);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenhar(g);
    }

    public void desenhar(Graphics g) {
        if (rodando) {
            // Desenhar comida
            g.setColor(Color.RED);
            g.fillOval(comida.x, comida.y, TAMANHO_BLOCO, TAMANHO_BLOCO);

            // Desenhar cobra
            for (int i = 0; i < corpoCobra.size(); i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN); // Cabeça
                } else {
                    g.setColor(new Color(45, 180, 0)); // Corpo
                }
                g.fillRect(corpoCobra.get(i).x, corpoCobra.get(i).y, TAMANHO_BLOCO, TAMANHO_BLOCO);
            }
        } else {
            fimDeJogo(g);
        }
    }

    public void mover() {
        Point cabeca = new Point(corpoCobra.get(0));

        switch (direcao) {
            case 'U' -> cabeca.y -= TAMANHO_BLOCO;
            case 'D' -> cabeca.y += TAMANHO_BLOCO;
            case 'L' -> cabeca.x -= TAMANHO_BLOCO;
            case 'R' -> cabeca.x += TAMANHO_BLOCO;
        }

        corpoCobra.add(0, cabeca); // Adiciona nova cabeça

        // Verifica se comeu a comida
        if (cabeca.equals(comida)) {
            criarComida();
        } else {
            corpoCobra.remove(corpoCobra.size() - 1); // Remove a cauda se não comeu
        }
    }

    public void verificarColisoes() {
        Point cabeca = corpoCobra.get(0);

        // Colisão com as bordas
        if (cabeca.x < 0 || cabeca.x >= LARGURA_TELA || cabeca.y < 0 || cabeca.y >= ALTURA_TELA) {
            rodando = false;
        }

        // Colisão com o próprio corpo
        for (int i = 1; i < corpoCobra.size(); i++) {
            if (cabeca.equals(corpoCobra.get(i))) {
                rodando = false;
                break;
            }
        }

        if (!rodando) {
            timer.stop();
        }
    }

    public void fimDeJogo(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Fim de Jogo!", (LARGURA_TELA - metrics.stringWidth("Fim de Jogo!")) / 2, ALTURA_TELA / 2);

        // Uso de JOptionPane para feedback final
        JOptionPane.showMessageDialog(this, "Sua pontuação: " + (corpoCobra.size() - 1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (rodando) {
            mover();
            verificarColisoes();
        }
        repaint();
    }

    private class LeitorTeclas extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT -> { if (direcao != 'R') direcao = 'L'; }
                case KeyEvent.VK_RIGHT -> { if (direcao != 'L') direcao = 'R'; }
                case KeyEvent.VK_UP -> { if (direcao != 'D') direcao = 'U'; }
                case KeyEvent.VK_DOWN -> { if (direcao != 'U') direcao = 'D'; }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game - Java");
        JogoCobrinha jogo = new JogoCobrinha();
        frame.add(jogo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
