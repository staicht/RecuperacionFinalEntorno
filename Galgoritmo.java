package modulos;

public class Galgoritmo {

    void ejecuta(int minimo, int maximo)
    {
        Galgoritmo num = new Galgoritmo();
        int numeroInvertidoOut[]=new int[maximo-minimo+1];
        int j=0;
        for(int i=minimo;i<=maximo;i++)
        {
            numeroInvertidoOut[j]=num.invertirNumero(i);

            if(i==numeroInvertidoOut[j])
            {
                System.out.println(i+" \t es.");
            }
            j++;
        }

    }

    int invertirNumero(int i)
    {

        int numeroAux=0;

        int numeroInvertido=0;
        numeroAux=i;

        numeroInvertido=numeroAux%10;

        while(numeroAux>9)
        {
            numeroAux=numeroAux/10;
            numeroInvertido=numeroInvertido*10 + numeroAux%10;
        }


        return numeroInvertido;


    }

    public static void main(String[] args)
    {
        Galgoritmo numero = new Galgoritmo();
        int limiteMax=1,limiteMin=0;
        numero.ejecuta(limiteMin,limiteMax);

    }
}
