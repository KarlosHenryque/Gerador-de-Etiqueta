package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programaas extends Produtos{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Produtos> list = new ArrayList();
		
		System.out.println("Insira o numero de produtos que ira cadastrar:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++){
			System.out.println("\nComum, Usado, Imporado (c/u/i)");
			char type = sc.next().charAt(0);
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preco:");
			double preco = sc.nextDouble();
			
			if(type == 'c') {
				list.add(new Produtos(nome, preco));
			}
			
			else if(type == 'u') {
				System.out.println("Data de fabricação (DD/MM/YYYY)");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(nome, preco, data));
			}
			else{
				System.out.println("Taxa importada");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxa));
			}
		}
		
		System.out.println();
		System.out.println("Etiqueta de Preço");
		for (Produtos prod : list) {
			System.out.println(prod.etiquetaPreco());
		}
	}

}
