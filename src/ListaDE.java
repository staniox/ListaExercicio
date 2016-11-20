import java.util.Scanner;

/**
 * Created by Bruno on 24/07/2016.
 */
public class ListaDE {
    No head = null , tail =null;
    int size = 0;

    public void adicionarNaCabeca (Integer num){
        No novo = new No(num);
        if (isEmpty()){
            head=novo;
            tail=novo;
        }
        else {
            head.ant=novo;
            novo.prox=head;
            head =novo;
        }
        size++;
    }

    public void adicionarNoRabo (Integer num){
        No novo = new No(num);
        if (isEmpty()){
            head=novo;
            tail=novo;
        }
        else {
            tail.prox=novo;
            novo.ant=tail;
            tail =novo;
        }
        size++;
    }


    public  boolean removeCabeca(){
       if (isEmpty()){
           return false;
       }
        No aux = head;

        if (head.prox!=null){
            aux=head.prox;
            head.prox=null;
            head =aux;
        }
        else {
            head= null;
            tail =null;
        }
        size-=1;
        return true;


    }

    public  boolean removeRabo(){
        if (isEmpty()){
            return false;
        }
        No aux = tail;

        if (tail.ant!=null){
            aux=tail.ant;
            tail.ant=null;
            tail =aux;
            tail.prox=null;
        }
        else {
            head= null;
            tail =null;
        }
        size-=1;
        return true;



    }
    public int mostraLista (No h){

        if (h.prox==null){
            System.out.println(h.num);
           return h.num;
        }
        else{
            System.out.println(h.num);
            h=h.prox;
            return mostraLista(h);
        }
    }




    public boolean isEmpty() {
        return (head==null);
    }

    public static void main(String[] args) {
        ListaDE lista = new ListaDE();
        Scanner in = new Scanner(System.in);
       int num=0;
        while (num!=-1) {
            System.out.printf("Escolha as opções:\n1 - adicionar na cabeça\n2 - adicionar no rabo\n3 - remover da cabeça\n4 - remover do rabo\n");
            num = in.nextInt();

            switch (num) {
                case (1):
                    num = in.nextInt();
                    lista.adicionarNaCabeca(num);
                    break;

                case (2):
                    num = in.nextInt();
                    lista.adicionarNoRabo(num);
                    break;

                case (3):
                    lista.removeCabeca();
                    break;

                case (4):
                    lista.removeRabo();
                    break;

                case 5:
                    lista.mostraLista(lista.head);
                    break;

            }
        }
    }
}
