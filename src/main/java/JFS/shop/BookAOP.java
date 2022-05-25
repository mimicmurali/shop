package JFS.shop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class BookAOP {

	@Before(value="execution(public void show())");
	public void aftershow() {
		System.out.println("does not return any value");
	}
}
