package modulos;

import java.util.Random;
import java.util.Scanner;

public class LlenaUnArrayDelTamañoQueElijas {

    void AnalizaVariable(int var,int m)
    {
        System.out.println(var);
        if(var%m==0)
            System.out.println("ES");
        else
            System.out.println("NO ES");
    }

    public static void main(String[] args)
    {
        System.out.println("INTRODUCE UN NUMERO: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        Random random = new Random();

         LlenaUnArrayDelTamañoQueElijas = new  LlenaUnArrayDelTamañoQueElijas();

        d.AnalizaVariable(random.nextInt(100),m);
    }
}
