package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class AppTest {
	
		
   @org.junit.Test
	public void testeEmail() throws Exception {
	  
	   StringBuilder stringBuilderTextoEmail = new StringBuilder();
	   
	   stringBuilderTextoEmail.append("Testando html");
	   stringBuilderTextoEmail.append("Você está  recebendo o acesso ao curso de java. <br/><br/>");
	   stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
	   
	   stringBuilderTextoEmail.append("<b>Login:</b> email@gmail.com<br/>");
	   stringBuilderTextoEmail.append("<b>Senha:</b> email@gmail.com<br/><br/>");	   
	   
	   stringBuilderTextoEmail.append("<a target=\"_blanck\"href=\"http://google.com.br\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius:30px; font-size:20px; font-family:courier; border: 3px solid green;background-color:#99DA39;\"> Acesse ao Site</a><br/><br/>");
	   
	   stringBuilderTextoEmail.append("<span style=\"font-size:8px\"> Ass.: Herculano Lima</span>");
	   
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("hercullanolima@gmail.com, testardevs@gmail.com", 
									"Herculano - Treinamneto Curso Java", 
									"Testando e-mail feito com programação em JAVA", 
									stringBuilderTextoEmail.toString());
		 
		
		enviaEmail.enviarEmailAnexo(true);
		
		/*Caso o email não esteja sendo enviaso então
		 colocar um tempo de espera, mais isso só pode
		 ser usado para testes*/
		
		Thread.sleep(5000);
	   
	   
   }
}
