package Group3.AzureWebApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureWebAppApplication {
	@Value("${connectionString2}")
    private String connectionString;

	public static void main(String[] args) {
		SpringApplication.run(AzureWebAppApplication.class, args);
	}

}
