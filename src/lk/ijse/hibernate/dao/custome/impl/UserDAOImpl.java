package lk.ijse.hibernate.dao.custome.impl;

import lk.ijse.hibernate.entity.User;
import lk.ijse.hibernate.utill.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean save(User entity) throws Exception {
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(entity);
            transaction.commit();
            session.close();
            return true;

    } catch (Exception ex) {
        transaction.rollback();
        session.close();
        ex.printStackTrace();
        return false;
    }
    }

    @Override
    public boolean update(User entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }
}
