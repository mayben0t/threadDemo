package third.cloud.thread.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LiveTemplateImpl implements TemplateItem {
    @Override
    public List<List<Integer>> test(List<List<Integer>> result, int productItemId, int liveId) {
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        if(!(result.size()>0)) {
            result.add(a);
        }
        return result;
    }
}
