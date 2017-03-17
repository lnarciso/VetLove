package view;

import java.util.Scanner;

import model.Clientes;

public class AddClientes {
	
	public AddClientes(){
		
	}
	
	public Clientes AddClientes(){
		
		System.out.println("Introduza o nome do Cliente: ");
		String NomeCli = new Scanner(System.in).nextLine();
		
		Clientes C = new Clientes();
		C.setNomeCli (NomeCli);
		
		return C;
		
		
		
	}

}
