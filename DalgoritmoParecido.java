 package modulos;

import java.util.Random;
import java.util.Scanner;

public class DalgoritmoParecido {

    void AnalizaVariable(int var,int m)
    {
        System.out.println(var);
        if(var%m==0)
            System.out.println("S");
        else
            System.out.println("NO ES");
    }

    public static void main(String[] argss)
    {
        System.out.println("INTRODUC UN NUMERO: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        Random random = new Random();

        DalgoritmoParecido d = new DalgoritmoParecido();

        d.AnalizaVariable(random.nextInt(1000),m);
    }
}
