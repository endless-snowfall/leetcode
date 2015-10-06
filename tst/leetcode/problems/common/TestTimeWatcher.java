package leetcode.problems.common;

import java.util.concurrent.TimeUnit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import com.google.common.base.Stopwatch;

public class TestTimeWatcher extends TestWatcher {

    private static final double NS_IN_MS = 1000000;

    private Stopwatch stopwatch = Stopwatch.createUnstarted();

    @Override
    protected void starting(Description description) {
        stopwatch.start();
    }

    @Override
    protected void finished(Description description) {
        stopwatch.stop();

        System.out.println(String.format("Test %s:%s took %s ms.",
            description.getClassName(),
            description.getMethodName(),
            stopwatch.elapsed(TimeUnit.NANOSECONDS) / NS_IN_MS));
    }
};
