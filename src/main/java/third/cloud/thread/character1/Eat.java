package third.cloud.thread.character1;

import java.util.concurrent.TimeUnit;

public class Eat implements Runnable{
    Object baozi;
    Object beef;
    Eat2 eat2;

    public Eat(Object baozi, Object beef,Eat2 e) {
        this.baozi = baozi;
        this.beef = beef;
        eat2=e;
    }

    @Override
    public void run() {
        eatAB();
    }

    public void eatAB(){
        synchronized (baozi){
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eat2.eatBA();
                System.out.println("zz");
        }
    }


}
