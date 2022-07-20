package desafiofinaldesignpatterns;

import desafiofinaldesignpatterns.classes.AviaoSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class AviaoSingletonTest {

	public static void main(String[] args)
			throws IllegalAccessException, InvocationTargetException, InstantiationException {
		SpringApplication.run(AviaoSingletonTest.class, args);
		agendarAssento("1A");
		agendarAssento("1A");
		AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
		AviaoSingleton aviaoSingleton2 = null;
		Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
		for(Constructor constructor : constructors){
			constructor.setAccessible(true);
			aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
			break;
		}
		System.out.println(aviaoSingleton.hashCode());
		System.out.println(aviaoSingleton2.hashCode());
	}
	private static void agendarAssento(String assento) {
		AviaoSingleton a = AviaoSingleton.getINSTANCE();
		System.out.println(a.bookAssento(assento));
	}
}
