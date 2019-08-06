package third.cloud.thread.character1;

public class Test {
    public static void main(String[] args) {
        Object baozi = new Object();
        Object beef = new Object();
        Eat2 e2 = new Eat2(baozi,beef);
        Eat e = new Eat(baozi,beef,e2);
        e2.eat=e;
//        while (true) {
            new Thread(e::run).start();
            new Thread(e2::run).start();
//        }
    }
}
