package enviando.email;

/**
 * Unit test for simple App.
 */
import enviando.email.ObjetoEnviaEmail;
/**
 * 
 * @author alisson
 *
 */
public class AppTest { 

	@org.junit.Test
	public void testeEmail() throws Exception{
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá <br/><br/>");
		stringBuilderTextoEmail.append("Menssagem envia pelo JAVAMAIL usando HTML<br/>");
		stringBuilderTextoEmail.append("<br/><br/>");
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://github.com/Alisson7Neres/\" style=\"text-decoration:none;\" > GITHUB");

		ObjetoEnviaEmail enviaEmail =
				new ObjetoEnviaEmail
				("alisson.ribeiro.rock@gmail.com", "mr.robot@hotmail.com", 
						"Email com eclipse", stringBuilderTextoEmail.toString());
		enviaEmail.enviarEmail(true);
		enviaEmail.enviarEmailAnexo(true);
		
		Thread.sleep(1000);
	}
		
}
