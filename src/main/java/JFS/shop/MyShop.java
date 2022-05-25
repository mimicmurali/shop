package JFS.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class MyShop {
	public int shopid;

	
 @Autowired
 public MyFavBook myFavBook;
public int getShopid() {
	return shopid;
}

public void setShopid(int shopid) {
	this.shopid = shopid;
}

public MyFavBook getMyFavBook() {
	return myFavBook;
}

public void setMyFavBook(MyFavBook myFavBook) {
	this.myFavBook = myFavBook;
}

public void show() {
	System.out.println("my book class method");
	myFavBook.myfavbook();
	System.out.println(myFavBook);
	
}
}


	
