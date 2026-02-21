package Orientação_a_Objetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int a,b,c,d,B;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if (a==b && b==c && c==d){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else if (a<c && b<d) {
           System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n",c-a,d-b);
        } else if (b>d && a<c){
            int H = (60+d)-b;
            if (H<60){
                B = (c-a)-1;
            }else{
                B = (c-a);
                H = H-60;
            }
            System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n",B,H);
        }
    }
    }

