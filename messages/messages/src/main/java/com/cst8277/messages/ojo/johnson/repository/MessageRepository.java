package com.cst8277.messages.ojo.johnson.repository;

import com.cst8277.messages.ojo.johnson.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
    List<Message> findAll();
    List<Message> findByProducerId(Long id);

//    @Query(value = "select * from messages  where id = ?1", nativeQuery = true)
@Query(value = "select id,content,created, producer_id from messages m  Join subscriptions s " +
        " on m.producer_id = s.producers_id\n" +
        "where subscribers_id = ?1",nativeQuery = true)
    List<Message> getMessagesBySubId(Long id);

}

//    select subscribers_id,producers_id,content from messages Join subscriptions
//    on messages.producer_id = subscriptions.producers_id
//        where subscribers_id = '50002';

//@Query(value = "select s.subscribers_id,s.producers_id,m.content from messages m Join subscriptions s" +
//        " on m.producer_id = s.producers_id\n" +
//        "where subscribers_id = :subscriberId",nativeQuery = true)
