package com.kafka.estoque_service.service;

import org.springframework.kafka.annotation.BackOff;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Service;

@Service
public class EstoqueListener {
    @KafkaListener(topics = "estoque-topico", groupId = "estoque-group")
    @RetryableTopic(
            backOff =   @BackOff(value = 3000),
            attempts = "5",
            autoCreateTopics = "true",
            include = Exception.class
    )
    public void processarVenda(String mensagem) {
        System.out.println("Venda recebida: " + mensagem);
    }
}
