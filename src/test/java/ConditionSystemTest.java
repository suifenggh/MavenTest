import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2016/11/20.
 */
public class ConditionSystemTest {
    @Test
    public void AlertWhenAbove(){
        ConditionSystem conditionSystem = new ConditionSystem(10);
        assertTrue(conditionSystem.probe(19));
    }
}
