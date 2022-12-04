package com.cst8277.messages.ojo.johnson.controller;

import com.cst8277.messages.ojo.johnson.model.Message;
import com.cst8277.messages.ojo.johnson.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

        @Autowired
        MessageService messageService;

        @GetMapping("/messages")
        public Iterable<Message> listAllMessages(){
            return messageService.listAllMessages();
        }

        @GetMapping("/messages/producer/{id}")
        public List<Message>  getMessagesByProducer(@PathVariable Long id){
            return messageService.getMessageByProducerId(id);
        }

        @GetMapping("/messages/subscriber/{id}")
        public List<Message>  getMessagesBySubscriber(@PathVariable Long id){
            return messageService.getMessagesBySubId(id);
        }



}
