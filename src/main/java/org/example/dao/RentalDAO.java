package org.example.dao;

import org.example.org.example.entity.Customer;
import org.example.org.example.entity.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class RentalDAO extends GenericDAO<Rental>{
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    /*public Rental findRentalByCustomer(Customer customer) {
        Query<Rental> query = getCurrentSession().createQuery("select r from Rental r where Customer.id = :ID AND r.returnDate is null", Rental.class);
        query.setParameter("ID", customer.getId());
        query.setMaxResults(1);
        return query.getSingleResult();
    }*/

    public Rental getAnyUnreturnedRental() {
        Query<Rental> query = getCurrentSession().createQuery("select r from Rental r where r.returnDate is null ", Rental.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
