/**
 * Created by Administrator on 2016/11/20.
 */
public class ConditionSystem {
    private int threshold;

    public ConditionSystem(int threshold) {
        this.threshold = threshold;
    }

    public boolean probe(int signal) {
        if(signal>threshold){
            return true;
        }
        return false;

    }
}
