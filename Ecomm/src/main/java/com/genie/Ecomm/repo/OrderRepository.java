package com.genie.Ecomm.repo;

import com.genie.Ecomm.model.Orders;
import com.genie.Ecomm.model.User;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Long> {

   @Query("SELECT o from Orders o JOIN FETCH o.user")
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);

}
