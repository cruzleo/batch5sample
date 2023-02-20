package org.ssglobal.training.codes.itemH;

class Product {
	public String productName; 
	public int productStock = 0;

	public void download(int pcs) {
		productStock = productStock + pcs;
	}
	
	public void upload(int pcs) {
		productStock = productStock - pcs;
	}
	
	public String print() {
		return productName + ", " + productStock + " pieces";
	}
	
	public class TestProduct {
		public static void main(String[] args) {
			Product lamp = new Product(); //instantiate
			lamp.productName = "IKEA Lamp"; 
			lamp.productStock = 1000; 
			
			System.out.println("Before the loading: " + lamp.print());
			lamp.download(1000);
			lamp.upload(100);
			System.out.println("After the loading: " + lamp.print());
		}
	}
}
