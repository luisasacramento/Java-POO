// Representam um processamento que possui um significado
//Vantagens: Modularização, delegação e reaproveitamento

//podem receber dados de entrada(parâmetros ou argumentos)
//podem ou não retornar uma saída

//ORIENTAÇÃO A OBJETO: funções em classes recebem o nome de "métodos"


import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int higher = max(a,b,c);
        showResult(higher);

        sc.close();


        }

    //public: para que fique visivel para outas classes
    // static: para que possa ser chamada independente de se criar um objeto


    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;

        } else if (y>z) {
            aux = y;

        }else {
            aux=z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);

    }

}


