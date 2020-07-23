package com.jbariel.example.util;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SingletonUtils {

    private static Map<String, Object> singletons = new HashMap<>();

    public static final <T> T getSingleton(Class<T> clazz) {
        return (null == clazz) ? null : getOrAddFromSingletons(clazz);
    }

    private static <T> T getOrAddFromSingletons(Class<T> clazz) {
        T obj = clazz.cast(singletons.get(clazz.getName()));
        if (null == obj) {
            try {
                obj = clazz.getDeclaredConstructor().newInstance();
                singletons.put(clazz.getName(), obj);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
                System.out
                        .println("Does your object (" + clazz.getName() + ") have a default no-args constructor?!?!?");
            }
        }
        return obj;
    }
}