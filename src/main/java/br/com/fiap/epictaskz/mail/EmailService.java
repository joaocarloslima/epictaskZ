package br.com.fiap.epictaskz.mail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender mailSender;

    public void sendEmail(String message) throws MessagingException {

        var email = mailSender.createMimeMessage();
        var helper = new MimeMessageHelper(email);

        helper.setTo("joao@fiap.com.br");
        helper.setSubject("Nova tarefa");
        helper.setText("""
                    <h1>Nova Tarefa</h1>
                    <p>%s</p>
                """.formatted(message), true);

        mailSender.send(email);

    }
}
