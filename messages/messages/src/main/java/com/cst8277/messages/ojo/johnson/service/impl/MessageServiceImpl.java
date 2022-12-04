package com.cst8277.messages.ojo.johnson.service.impl;

import com.cst8277.messages.ojo.johnson.model.Message;
import com.cst8277.messages.ojo.johnson.service.MessageService;
import com.cst8277.messages.ojo.johnson.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Iterable<Message> listAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> getMessageByProducerId(Long id) {
        return messageRepository.findByProducerId(id);
    }

    @Override
    public List<Message> getMessagesBySubId(Long id) {
        return messageRepository.getMessagesBySubId(id);
    }



}
