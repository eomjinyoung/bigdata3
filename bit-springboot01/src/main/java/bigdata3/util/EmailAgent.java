package bigdata3.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class EmailAgent {
  @Autowired MailSender mailSender;
  
  public void send(String to, String subject, String text) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("jyeom15@gmail.com");
    message.setTo(to);
    message.setSubject(subject);
    message.setText(text);
    
    mailSender.send(message);
  }
}
