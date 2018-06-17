package modulos;

import java.util.Scanner;

public class Calgoritmo {
    static void ejecuta(int numImpares)
    {
        int i=1,impar=1;
        //String signo;
        String coma;

        while(i<=2*numImpares-1)
        {
            if (i==2*numImpares-1)
                coma="";
            else
                coma=", ";
            mostrar(i,coma);
            i+=2;
        }

    }

    static void mostrar(int i, String coma)
    {

        System.out.print(i+coma);
    }

    public static void main(String[] args)
    {
        System.out.println("INTRODUCE UN NUMERO: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        if(m<=0)
            System.out.println("Ingrese un parámetro válido [mayor a 0]");
        else
        {
            ejecuta(m);
            System.out.println("");
        }
    }
}
