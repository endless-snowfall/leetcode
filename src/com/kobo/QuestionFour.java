package com.kobo;

import java.util.HashMap;

class Hist {

    public HashMap<String, Integer> map = new HashMap<String, Integer>();

    public int add(String k) {
        int i = 0;

        if (map.containsKey(k)) {
            i = map.get(k);
            map.put(k, ++i);
        } else {
            map.put(k, i);
        }

        return i;
    }

    public int getHist(String k) {
        return map.get(k);
    }
}
