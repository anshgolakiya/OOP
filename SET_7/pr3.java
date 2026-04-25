class TablePrinter {
    synchronized void printTable(int n){
        for(int i =1 ; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
class MyThread extends Thread {
    TablePrinter tp ;
    int num ;
    MyThread(TablePrinter tp , int num){
        this.tp = tp ;
        this.num = num ;
    }
    public void run(){
        tp.printTable(num);
    }
}
public class pr3 {
    public static void main(String[] args) {
        TablePrinter tp = new TablePrinter();
        MyThread t1 = new MyThread(tp, 5);
        MyThread t2 = new MyThread(tp, 7);

        t1.start();
        t2.start();
    }
}
