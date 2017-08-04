/*  1:   */ import java.io.PrintStream;
/*  2:   */ import java.util.Properties;
/*  3:   */ import javax.mail.Authenticator;
/*  4:   */ import javax.mail.Message;
/*  5:   */ import javax.mail.Message.RecipientType;
/*  6:   */ import javax.mail.MessagingException;
/*  7:   */ import javax.mail.PasswordAuthentication;
/*  8:   */ import javax.mail.Session;
/*  9:   */ import javax.mail.Transport;
/* 10:   */ import javax.mail.internet.InternetAddress;
/* 11:   */ import javax.mail.internet.MimeMessage;
/* 12:   */ 
/* 13:   */ public class Sender
/* 14:   */ {
/* 15:   */   private String username;
/* 16:   */   private String password;
/* 17:   */   private Properties props;
/* 18:   */   
/* 19:   */   public Sender(String host, String port, String username, String password)
/* 20:   */   {
/* 21:60 */     this.username = username;
/* 22:61 */     this.password = password;
/* 23:   */     
/* 24:63 */     this.props = new Properties();
/* 25:   */     
/* 26:   */ 
/* 27:   */ 
/* 28:67 */     this.props.put("mail.smtp.host", host);
/* 29:68 */     this.props.put("mail.smtp.port", port);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void send(String subject, String text, String fromEmail, String toEmail)
/* 33:   */   {
/* 34:72 */     Session session = Session.getInstance(this.props, new Authenticator()
/* 35:   */     {
/* 36:   */       protected PasswordAuthentication getPasswordAuthentication()
/* 37:   */       {
/* 38:74 */         return new PasswordAuthentication(Sender.this.username, Sender.this.password);
/* 39:   */       }
/* 40:   */     });
/* 41:   */     try
/* 42:   */     {
/* 43:79 */       Message message = new MimeMessage(session);
/* 44:   */       
/* 45:81 */       message.setFrom(new InternetAddress(fromEmail));
/* 46:   */       
/* 47:83 */       message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
/* 48:   */       
/* 49:85 */       message.setSubject(subject);
/* 50:   */       
/* 51:87 */       message.setText(text);
/* 52:   */       
/* 53:   */ 
/* 54:90 */       Transport.send(message);
/* 55:   */     }
/* 56:   */     catch (MessagingException e)
/* 57:   */     {
/* 58:92 */       System.out.println(e);
/* 59:   */     }
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Users\ывожпл\Downloads\ExpoErrold\ExpoErrold\EXport\
 * Qualified Name:     Sender
 * JD-Core Version:    0.7.0.1
 */