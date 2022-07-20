package desafiofinaldesignpatterns;

import desafiofinaldesignpatterns.classes.Moeda;
import desafiofinaldesignpatterns.classes.MoedaFactory;
import desafiofinaldesignpatterns.classes.Pais;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoedaFactoryTest {

	public static void main(String[] args) {
		SpringApplication.run(MoedaFactoryTest.class, args);
		Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
		System.out.println(moeda.getSimbolo());
	}
}
