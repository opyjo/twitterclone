package com.cst8277.messages.ojo.johnson.service;

import com.cst8277.messages.ojo.johnson.model.Message;

import java.util.List;


public interface MessageService {
    Iterable<Message> listAllMessages();

    List<Message> getMessageByProducerId(Long id);

    List<Message> getMessagesBySubId(Long id);


}