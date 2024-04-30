package PracticePrograms;

class ThreadNew extends Thread{

    public ThreadNew(String name, ThreadGroup tg1){
        super(tg1, name);
        start();
    }

    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}

public class ThreadGroupActiveCount {

    public static void main(String[] args){
        ThreadGroup tg1 = new ThreadGroup("ParentGroup");
        ThreadGroup tg2 = new ThreadGroup(tg1,"ChildGroup");

        ThreadNew th1 = new ThreadNew("Thread One", tg1);
        ThreadNew th2 = new ThreadNew("Thread Two", tg1);

        System.out.println("The total number of active threads are: "+tg1.activeCount());
        System.out.println("The total number of active group count are: "+tg1.activeGroupCount());

    }
}
