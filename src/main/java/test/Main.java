package test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.debug("Creating a person...");
        Person person1 = new Person("Michael", "Reid", 31);
        log.info("Person created = {}", person1);
        log.info("Person hash = {}", person1.hashCode());

        log.debug("Creating a person...");
        Person person2 = new Person("Michael", "Reid", 30);
        log.info("Person created = {}", person2);
        log.info("Person hash = {}", person2.hashCode());
    }
}
