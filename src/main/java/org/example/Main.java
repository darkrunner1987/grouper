package org.example;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<NamedObject> list = List.of(
                new DefaultNamedObject("name1"),
                new DefaultNamedObject("name1"),
                new DefaultNamedObject("name2"),
                new DefaultNamedObject("name2"),
                new DefaultNamedObject("name2")
        );
        System.out.println(Grouper.groupByName(list));
    }
}