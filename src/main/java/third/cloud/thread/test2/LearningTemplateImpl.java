package third.cloud.thread.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LearningTemplateImpl implements TemplateItem {
    @Override
    public List<List<Integer>> test(List<List<Integer>> result, int productItemId, int liveId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if(result!=null && result.size()>0){
            return result;
        }
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(2);
        a.add(2);
        if(!(result.size()>0)) {
            result.add(a);
        }
        return result;
    }
}
