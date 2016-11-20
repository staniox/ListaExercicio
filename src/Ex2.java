import java.util.Scanner;

/**
 * Created by Bruno on 20/11/2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        int valor;
        int lance;
        int qtd=1;
        Scanner in = new Scanner(System.in);
        valor = in.nextInt();
        do {
            lance=in.nextInt();
            if (lance<valor){
                System.out.println("valor inferior ao informado . tente um numero mais alto");
                qtd+=1;
            }
            else if (lance>valor){
                System.out.println("valor superior ao informado . tente um numero mais baixo");
                qtd+=1;
            }
            else break;

        }while (lance!=valor || qtd<=10);
        if (qtd>0&& qtd<4) System.out.println("muito sortudo");
        else if (qtd>3&& qtd<7) System.out.println("sortudo");
        else if (qtd>6&& qtd<11) System.out.println("normal");
        else System.out.println("tente novamente pé frio");

    }

}
