package Q3;

public class ThreadManger implements Runnable{
    Status s= new Status();

    public ThreadManger(Status s){
        this.s=s;
    }
    @Override
    public void run() {
        while (true) {
            s.setX();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(s.getX());
                break;
            }
        }
    }
}

