package com.streamapiHomework1;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
}
