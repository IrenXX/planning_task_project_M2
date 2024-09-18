package ru.kemova.planning_task_project_M2.services;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import ru.kemova.planning_task_project_M2.model.EmailMessageTask;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendEmail(EmailMessageTask emailTask) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailTask.getEmail());
        message.setSubject(emailTask.getTitle());
        message.setText(emailTask.getBody());
        mailSender.send(message);
    }
}
