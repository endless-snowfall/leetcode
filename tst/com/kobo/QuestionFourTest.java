package com.kobo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuestionFourTest {

    private static final String KEY = "anthonylikesicecream";

    private Hist hist;
    @Spy private HashMap<String, Integer> mockedMap;

    @Before
    public void before() {
        hist = new Hist();
        hist.map = mockedMap;
    }

    @Test
    public void test() {
        assertTrue(hasRace(hist));
    }

    private boolean hasRace(Hist hist) {
        // This illustrates what happens when two threads enter the if block
        // simultaneously
        when(mockedMap.containsKey(KEY)).thenReturn(false, false);

        hist.add(KEY);
        hist.add(KEY);

        // We would expect the first invocation to put 0 into the map, and the
        // subsequent invocation to increase the value to 1. However, the race
        // condition causes 0 to be put into the map for both invocations.
        return hist.getHist(KEY) == 0;
    }
}
