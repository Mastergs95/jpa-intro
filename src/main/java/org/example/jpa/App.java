package org.example.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{

//    public static void main(String[] args )
//    {
//        Configuration cfg = new Configuration();
//        cfg=cfg.configure("META-INF/hibernate.cfg.xml");
//
//        SessionFactory factory = cfg.buildSessionFactory();
//        Session session = factory.openSession();
//
//        Employee firstEmployee = new Employee(1121,"Peter","Holland","Manager",120000);
//
//        Employee secondEmployee = new Employee(1141,"Bruce","Brenner","Analyst",80000);
//
//        Transaction transaction = session.getTransaction();
//
//        session.save(firstEmployee);
//        session.save(secondEmployee);
//
//        transaction.commit();
//
//        session.close();
//        factory.close();
//    }




//        public static void main( String[] args )
//        {
//
//            EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeDBUnit");
//            EntityManager entityManager = factory.createEntityManager();
//
//            try {
//                entityManager.getTransaction().begin();
//
//
//                Employee firstEmployee = new Employee( "Peter", "Holland",
//                        "Manager", 120000d);
//
//                Employee secondEmployee = new Employee( "Bruce", "Brenner",
//                        "Analyst", 90000d);
//
//                Employee thirdEmployee = new Employee("Naomi","Miller","Vice President",160000d);
//
//                Department firstDepartment = new Department("Tech", "Floor 3");
//                Department secondDepartment = new Department("Research","Floor 5");
//
//                entityManager.persist(firstDepartment);
//                entityManager.persist(secondDepartment);
//
//                entityManager.persist(firstEmployee);
//                entityManager.persist(secondEmployee);
//                entityManager.persist(thirdEmployee);
//
//                entityManager.getTransaction().commit();
//
//                entityManager.close();
//                factory.close();
//
//            } catch (Exception exception){
//                System.err.println("An exception occurred: " + exception);
//            } finally {
//                entityManager.getTransaction().commit();
//
//                entityManager.close();
//                factory.close();
//            }
//        }
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeDBUnit");
        EntityManager entityManager = factory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            EmployeeEntry entryOne = new EmployeeEntry(1, LocalDate.now(), LocalTime.now());
            EmployeeEntry entryTwo = new EmployeeEntry(1, LocalDate.now().minusDays(1),LocalTime.now());
            EmployeeEntry entryThree = new EmployeeEntry(2, LocalDate.now(),LocalTime.now());

            System.out.println("Saving down entry: " + entryOne.toString());
            System.out.println("Saving down entry: " + entryTwo.toString());
            System.out.println("Saving down entry: " + entryThree.toString());

            entityManager.persist(entryOne);
            entityManager.persist(entryTwo);
            entityManager.persist(entryThree);

        } catch (Exception exception){
            System.err.println("An exception occurred: " + exception);
        } finally {
            entityManager.getTransaction().commit();

            entityManager.close();
            factory.close();
        }

    }
}