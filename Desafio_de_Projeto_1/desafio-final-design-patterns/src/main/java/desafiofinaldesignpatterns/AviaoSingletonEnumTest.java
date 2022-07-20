package desafiofinaldesignpatterns;

import desafiofinaldesignpatterns.classes.AviaoSingletonEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AviaoSingletonEnumTest {

	public static void main(String[] args) {
		SpringApplication.run(AviaoSingletonEnumTest.class, args);
		AviaoSingletonEnum.agendarAssento("1A");
		AviaoSingletonEnum.agendarAssento("1A");
	}
}
