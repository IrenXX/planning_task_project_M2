package ru.kemova.planning_task_project_M2.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.kemova.planning_task_project_M2.model.EmailMessageTask;
import ru.kemova.planning_task_project_M2.services.EmailService;

@Component
@RequiredArgsConstructor
public class EmailTaskConsumer {
    private final EmailService emailService;


    @KafkaListener(topics = "EMAIL_SENDING_TASKS", groupId = "email-sender-group",
            containerFactory = "kafkaListenerContainerFactory")
    public void consume(EmailMessageTask emailTask) {
        emailService.sendEmail(emailTask);
    }
}
