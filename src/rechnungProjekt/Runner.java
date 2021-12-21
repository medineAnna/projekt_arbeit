package rechnungProjekt;

public class Runner {

	public static void main(String[] args) {
		/* Restaurant bill, create a bill object, 
		 * a bill contains the ordered food, quantity and price, 
		 * get order and total cost of the bill, use arraylists to record the order
		 *
		 * Fatura objesini olusturun,
		 * siparis edilen yemegin, miktari ve fiyatini hesaplayin
		 * ArrayList kullanarak siparisleri kayit edin */
		
		
		
		//dish and cost ayni sirada
		String[]dish= {"Sandiwich","Coffe","French Fries","Salad"};
		double[]cost= {6.5, 3.2, 4.0, 3.5};
		
		Bill myBill=new Bill();//Bill instance olusturduk
		
		myBill.addOrder("Sandwich", 2, dish, cost);
		myBill.addOrder("Coffe", 2, dish, cost);//2sandwich, 2 tane coffe
		myBill.addOrder("French Fries", 1, dish, cost);
		myBill.addOrder("Salad", 1, dish, cost);
		
		myBill.getOrder();
		
		System.out.println(myBill.getTotal());
	}

}
