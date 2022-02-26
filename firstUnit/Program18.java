public class Table extends Thread{
    int n;

    public Table(int n){
        this.n = n;
    }

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        System.out.println();
    }
}