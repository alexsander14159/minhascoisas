package for_;

import java.util.Scanner;

public class TABUADA {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Qual número você quer saber a tabuada?");
        int número = scanner.nextInt();
        for(int i = 1;i<11;i++)
            System.out.println(número + " x " + i + "= " + i * número );
}  


}
