package test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainTest {

    public void testMain() {
        log.info("Starting tests...");
        Person person1 = new Person("Michael", "Reid", 31);
        Person person2 = new Person("Michael", "Reid", 30);
        assert(!person1.equals(person2));
        log.info("Finishing tests...");
    }
}