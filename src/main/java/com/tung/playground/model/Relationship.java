package com.tung.playground.model;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public enum Relationship {
    MATERNAL_GRANDMOTHER("Maternal-Grandmother", p -> List.of(p.getMother().getMother())),
    MATERNAL_AUNT("Maternal-Aunt", p -> {
        Female maternalGrandmother = (Female) MATERNAL_GRANDMOTHER.resolver.apply(p).get(0);
        return maternalGrandmother.getChildren().stream()
                .filter(p2 -> Gender.FEMALE.equals(p2.getGender()))
                .collect(toList());
    }),
    SIBLINGS("Siblings", p -> p.getMother().getChildren());

    private final String keyword;
    private final Function<Person, List<Person>> resolver;

    Relationship(String keyword, Function<Person, List<Person>> resolver) {
        this.keyword = keyword;
        this.resolver = resolver;
    }
}
