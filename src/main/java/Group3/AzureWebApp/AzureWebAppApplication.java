package Group3.AzureWebApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
@SpringBootApplication
public class AzureWebAppApplication {

	@Value("${connectionString2}")
	private String connectionString;
	public static void main(String[] args) {
		SpringApplication.run(AzureWebAppApplication.class, args);
	}

}