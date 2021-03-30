package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ClientesApplication {


	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
		
	
	}
//	
////	@Bean
////	public CommandLineRunner run( @Autowired ClienteRepository repository ){
////		return args -> {
////			Cliente cliente = Cliente.builder().cpf("1234567890").nome("Gabriel").build();
////			repository.save(cliente);
////		};
////		
////	}
//
}
