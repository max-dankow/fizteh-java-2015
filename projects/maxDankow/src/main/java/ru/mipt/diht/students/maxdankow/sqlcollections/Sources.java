package ru.mipt.diht.students.maxdankow.sqlcollections;

import java.util.Arrays;
import java.util.List;

public class Sources {

    @SafeVarargs
    public static <T> List<T> list(T... items) {
        return Arrays.asList(items);
    }

}
