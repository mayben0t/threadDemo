package third.cloud.thread.character1;

import java.util.concurrent.TimeUnit;

public class Eat2 implements Runnable {
    Object baozi;
    Object beef;
    Eat eat;
    public Eat2(Object baozi, Object beef) {
        this.baozi = baozi;
        this.beef = beef;
//        this.eat = e;
    }

    @Override
    public void run() {
        eatBA();
    }

    public void eatBA(){
        synchronized (beef){
                try {
                    TimeUnit.SECONDS.sleep(3);
                    eat.eatAB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("zz2");
        }
    }
}
