package replall;

public class ShoppingStore {
	  String item;
	  double price;
	  double quantity;
ShoppingStore(String item, double price,double quantity){
this.item=item;
this.price=price;
this.quantity=quantity;
}
public double shoppingPlaza() {
	double shoppingPlaza=this.price*this.quantity;
	System.out.println(this.item+" "+shoppingPlaza);
	return shoppingPlaza;
	
}
public static void main(String[] args) {
	 ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	 ShoppingStore mattress = new ShoppingStore("mattress" , 219.59, 2);
	 double  rtn=blancket.shoppingPlaza();
	double rtn1= mattress.shoppingPlaza();
	double rtn2=rtn+rtn1;
	 
	 System.out.println("You purcahsed "+rtn2 +"Today");
}
}

