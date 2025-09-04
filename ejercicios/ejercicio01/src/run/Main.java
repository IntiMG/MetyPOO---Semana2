package run;

import models.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Joaquin", "isi", "12345678");
        Student s2 = new Student("Angie", "isi", "24567890");
        Student s3 = new Student("Pedro", "isi", "0987");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
