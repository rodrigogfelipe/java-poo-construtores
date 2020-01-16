/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque).Em seguida: •
 *  Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque) • 
 *  Realizar uma entrada no estoque e mostrar novamente os dados do produto • Realizar uma saída no estoque e mostrar
 *  novamente os dados do produto
*/ 

package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}



	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) { /*incrementar o quantity*/
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) { /*decrementar o quantity*/
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $"
				+ String.format("%.2f", totalValueStock());

	}

}
