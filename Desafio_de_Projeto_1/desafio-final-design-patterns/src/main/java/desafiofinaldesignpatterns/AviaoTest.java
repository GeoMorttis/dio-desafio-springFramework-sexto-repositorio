package desafiofinaldesignpatterns;

import desafiofinaldesignpatterns.classes.Aviao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AviaoTest {

	public static void main(String[] args) {
		SpringApplication.run(AviaoTest.class, args);
		agendarAssento("1A");
		agendarAssento("1A");
	}

	private static void agendarAssento(String assento) {
		Aviao a = new Aviao();
		System.out.println(a.bookAssento(assento));
	}
}
