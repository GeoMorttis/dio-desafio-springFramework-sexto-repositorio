package desafiofinaldesignpatterns;

import desafiofinaldesignpatterns.classes.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PessoaTest {

	public static void main(String[] args) {
		SpringApplication.run(PessoaTest.class, args);
		Pessoa p = new Pessoa.PessoaBuilder("Sérgio")
				.nomeDoMeio("Morttis")
				.ultimoNome("Rodrigues")
				.nomeDoPai("Vidal")
				.apelido("GeoMorttis")
				.build();
		System.out.println(p);
	}
}
