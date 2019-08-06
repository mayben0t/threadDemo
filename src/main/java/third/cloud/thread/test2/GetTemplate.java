package third.cloud.thread.test2;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

public class GetTemplate implements Template {
    TemplateItem templateItem = new LearningTemplateImpl();
    TemplateItem templateItem2 = new LiveTemplateImpl();

    ExecutorService threadPool = Executors.newFixedThreadPool(2);

    @Override
    public List<List<Integer>> getResult(int productId, int liveId) {
        List<List<Integer>> id = new CopyOnWriteArrayList<>();
        List<List<Integer>> res = new CopyOnWriteArrayList<>();
        Future<List<List<Integer>>> submit1 = threadPool.submit(new Callable<List<List<Integer>>>() {
            @Override
            public List<List<Integer>> call() throws Exception {
                return templateItem.test(id, 1, 1);
            }
        });
        Future<List<List<Integer>>> submit = threadPool.submit(new Callable<List<List<Integer>>>() {
            @Override
            public List<List<Integer>> call() throws Exception {
                return templateItem2.test(id, 1, 1);
            }
        });
        try {
            res =(List<List<Integer>>) submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return res;
    }
}
