package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        SessionFactory sessionFactory = context.getBean(SessionFactory.class);

        Session session = sessionFactory.openSession();

        Student student1 = new Student("Ayan", 20);

        session.beginTransaction();
        session.persist(student1);
        session.getTransaction().commit();

        session.close();
    }
}
