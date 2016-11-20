/**
 * Created by Bruno on 20/11/2016.
 */

     import java.util.Scanner;
public class Ex1 {
 public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int n = scanner.nextInt(), quantidade, valorAnterior, valorAtual;
             boolean crescente;
             for (int i = 0; i < n; i++) {
                 quantidade = scanner.nextInt();
                 crescente = true;
                 valorAnterior = scanner.nextInt();
                 for (int j = 0; j < quantidade ; j++) {
                     valorAtual = scanner.nextInt();
                     if(valorAtual < valorAnterior) {
                         crescente=false;
                         break;
                         }
                     else {
                         valorAnterior = valorAtual;
                         }
                     }
                 if(crescente)
                     System.out.println("S\n");
                 else
                 System.out.println("N\n");
                 }
             }
 }

