package JFS.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MyFavBook {
     @Value("#{100+100}")
     public int murali;
     @Value("firewings")  
	public String favbkname;
	public void myfavbook() {
		System.out.println("myfavbook ");
	}
	@Override
	public String toString() {
		return "MyFavBook [murali=" + murali + ", favbkname=" + favbkname + "]";
	}
}
