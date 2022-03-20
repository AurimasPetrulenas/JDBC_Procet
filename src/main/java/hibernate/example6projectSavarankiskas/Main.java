package hibernate.example6projectSavarankiskas;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Guest aurimas = Guest.builder()
                .first_name("Aurimas")
                .last_name("Petrulenas")
                .phone_no(370123456)
                .address("LT")
                .build();

        session.beginTransaction();
        session.persist(aurimas);
        session.getTransaction().commit();


    }
}
