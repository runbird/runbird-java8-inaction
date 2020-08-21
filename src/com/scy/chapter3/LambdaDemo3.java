package com.scy.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类名： LambdaDemo3 <br>
 * 描述：TODO <br>
 * 创建日期： 2020/8/21 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class LambdaDemo3 {

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "aaa",null);
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(list, nonEmptyStringPredicate);
    }
}
