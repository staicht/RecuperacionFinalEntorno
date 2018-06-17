package modulos;

public class LlenaVectoresAleatoriamenteYLosCompara
{
    static int tamañoVectorA=10;
    static int tamañoVectorB=20;
    static int vectorA[]=new int[tamañoVectorA];
    static int vectorB[]=new int[tamañoVectorB];
    static int elemA=0;
    static int elemB=0;
    static int z=0;
    static void llenaArreglo(){
        for(int i=0;i<vectorA.length;i++){
            vectorA[i]=(int)(Math.random()*100+1);
        }

        for(int i=0;i<vectorB.length;i++){
            vectorB[i]=(int)(Math.random()*100+1);
        }

    }

    static void compara(){
        for(int i=0;i<vectorA.length;i++){
            for(int j=0;j<vectorB.length;j++){
                if(vectorA[i]==vectorB[j])
                    elemA++;
            }
            System.out.println("Resultado :"+vectorA[i]+":"+elemA);
            elemA=0;
        }
    }

    static void imprimir(){
        for(int i=0;i<vectorA.length;i++){
            System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
        }
        for(int i=0;i<vectorB.length;i++){
            System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
        }
    }

    public static void main(String[] args){
        llenaArreglo();
        imprimir();
        compara();
    }
}