package modulos;

public class Ealgoritmo {
    static int tamaño=25;
    static int a1[]=new int[tamaño];
    static void rellenaraleatorios(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=(int)(Math.random()*100+1);
        }
    }

    //TODO DEBE COMENTARSE
    static void imprimir(int x[])
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print("numero "+"["+i+"]="+x[i]+"\t");

        }
    }

    static void ejecuta(int y[])
    {
        int z=0,k=0;
        for(int i=0;i<MAX/2;i++)
        {
            z=y[i];
            k=y[MAX-1-i];
            y[MAX-i-1]=z;

            y[i]=k;
        }
    }

    public static void main(String[] args)
    {
        rellenaraleatorios(a1);
        imprimir(a1);
        ejecuta(a1);
        System.out.println("__________");
        System.out.println("");
        imprimir(a1);
    }
}
