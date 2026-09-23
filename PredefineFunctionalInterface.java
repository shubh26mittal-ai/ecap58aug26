package java8features;
import java.util.Date;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class PredefineFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = (n)->n>0;
		boolean v = p.test(10);
		System.out.println(v);//true
		
		boolean v1 = p.test(-65);
		System.out.println(v1);//false
		
		 Function<Integer, Integer> f1 = (a) -> a * a;

	        int r = f1.apply(5);
	        System.out.println(r);   // 25

	        Consumer<String> c = s -> System.out.println(s);
	        c.accept("Hello");//Hello
	        
	        Supplier s = () -> new Date();

	        System.out.println(s);        // lambda object reference, e.g. PredefineFunctionalInterface$$Lambda$14/0x...@1b6d3586
	        System.out.println(s.get());  // current date/time, e.g. Tue Sep 22 10:15:30 IST 2026

	        Supplier<PredefineFunctionalInterface> s1 = () -> new PredefineFunctionalInterface();

	        System.out.println(s1);       // lambda object reference, e.g. PredefineFunctionalInterface$$Lambda$15/0x...@4554617c
	        System.out.println(s1.get()); //java8features.PredefineFunctionalInterface@446cdf90

	}

}
