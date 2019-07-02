package com.boot.sh;

import com.boot.sh.common.util.SHA256Util;
import com.boot.sh.demo.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Xingyu Sun
 * @date 2019/6/21 13:44
 */
public class Tests {

    @Test
    public void test(){
        String s = SHA256Util.sha256("123456", "");
        System.out.println(s);
        Person person = new Person();
        person.setAge(1);
        person.setName("sxy");
        person.setSex("man");

        Person person1 = new Person();
        person1.setAge(-1);
        person1.setName("sxy1");
        person1.setSex("man1");

        Person person2 = new Person();
        person2.setAge(0);
        person2.setName("sxy2");
        person2.setSex("man2");
        List<Person> people = Arrays.asList(person, person1, person2);
        people.stream().sorted((x,y)->x.getAge().compareTo(y.getAge())).collect(Collectors.toList());
    }
}
