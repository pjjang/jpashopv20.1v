package jpabook.jpashopv2.repository;

import jakarta.persistence.EntityManager;
import jpabook.jpashopv2.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    //public List<Order> findAll(OrderSearch orderSearch) {

//        return em.createQuery("select o from Order o join o.member m" +
//                        " where o.status = :status" +
//                        " and m.name", Order.class)
//                .setParameter("status", orderSearch.getOrderStatus())
//                .setParameter("name", orderSearch.getMemberName())
//                //페이징 시작위치
//                //.setFirstResult(10)
//                //갯수
//                //.setMaxResults(10000)
//                .getResultList());

    //}
}
