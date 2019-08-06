package third.cloud.thread.test2;

import java.util.List;

public class Thanos {
    public static void main(String[] args) {
        Template te = new GetTemplate();
        List<List<Integer>> result = te.getResult(1, 2);
        result.stream().forEach(System.out::println);
    }
}
