package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouper {
    public static Map<String, List<NamedObject>> groupListByName(Collection<NamedObject> objects) {
        return objects.stream().collect(Collectors.groupingBy(NamedObject::name));
    }

    public static Map<String, Collection<NamedObject>> groupByName(Collection<NamedObject> objects) {
        return objects.stream().collect(Collectors.groupingBy(NamedObject::name, Collectors.toCollection(ArrayList::new)));
    }
}
