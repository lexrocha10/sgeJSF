package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory emf;
    private static EntityManager em;

    static {
        try {

            emf = Persistence.createEntityManagerFactory("SGE-PU2");

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {

        em = emf.createEntityManager();

        return em;
    }

}
