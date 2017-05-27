package org.chapter04.compositetest;

import org.chapter04.composite.InstrumentedSet;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Admin on 2017/5/24.
 */
public class SetTest {

    @Test
    public void test01() {
        InstrumentedSet<String> hashSet = new InstrumentedSet<>(new TreeSet<>());
//        hashSet.add("aaa");
//        hashSet.add("bbb");
//        hashSet.add("ccc");
        Set<String> set = new HashSet<>();
        set.add("ddd");
        set.add("eee");
        set.add("fff");
        hashSet.addAll(set);
        System.out.println(hashSet.getAddCount());
        Set set1 = new HashMap().entrySet();
    }
}
