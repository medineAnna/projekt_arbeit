package rechnungProjekt;

import java.util.ArrayList;

public class Bill {

	private ArrayList<String> orderedFood;// siparis edilen yiyecekler listesi
	private ArrayList<Integer> OrderedQuantity;// miktari icerir

	public Bill() {// cons class

		orderedFood = new ArrayList<String>();// object olusturdum
		OrderedQuantity = new ArrayList<Integer>();

	}

	private double totalCost;// fatura icin toplam tutari cons'u

	public double getTotal() {
		return totalCost;
	}

	public void addOrder(String meal, int quantity, String[] dish, double[] cost) {// yemek,miktar,tabak,tutar

		orderedFood.add(meal);// yemekleri ekledik
		OrderedQuantity.add(quantity);// otomatik box

		for (int i = 0; i < dish.length; i++) {
			if (meal.equals(dish[i])) {
				totalCost += quantity * cost[i];

			}
		}
	}

	public void getOrder() {
		for (int i = 0; i < orderedFood.size(); i++) {
			System.out.println(orderedFood.get(i) + " " + OrderedQuantity.get(i));
		}
	}

}
