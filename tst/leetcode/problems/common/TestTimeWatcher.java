package leetcode.problems.common;

import java.util.concurrent.TimeUnit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import com.google.common.base.Stopwatch;

public class TestTimeWatcher extends TestWatcher {

    private Stopwatch stopwatch = Stopwatch.createUnstarted();

    @Override
    protected void starting(Description description) {
        stopwatch.start();
    }

    @Override
    protected void finished(Description description) {
        stopwatch.stop();

        System.out.println(String.format("Test %s:%s took %d ms.",
                description.getClassName(),
                description.getMethodName(),
                stopwatch.elapsed(TimeUnit.MILLISECONDS)));
    }
};
