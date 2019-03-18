package test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
}
