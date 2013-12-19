import java.util.ArrayList;
import Tropas.*;
import Ejercito.*;

public class Cliente {
	
	private Ejercito ejercito;
	public ArrayList<Nave> naves;
	public ArrayList<Soldado> soldados;
	public Jefe jefe;
	
	
	public Cliente(Ejercito e) {
		// TODO Auto-generated constructor stub
		ejercito = e;
	}
	
	public void generarTropa() {
		naves = ejercito.crearNaves(2);
		soldados = ejercito.crearSoldados(2);
		jefe = ejercito.crearJefe();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n = 2;
		
		System.out.println("Fan de imperio");
		
		Cliente clienteImperio = new Cliente(new EjercitoImperio());
		
		clienteImperio.generarTropa();
		
		System.out.println("se enfrenta a...");
		
		System.out.println("fan de rebeldes");
		
		Cliente clienteRebelde = new Cliente(new EjercitoRebelde());
		
		clienteRebelde.generarTropa();
		
		System.out.println("Comienza la batalla!");
		
		for (int i = 0; i < n; ++i) {
			clienteImperio.naves.get(i).disparar();
			clienteImperio.soldados.get(i).atacar();
			clienteRebelde.naves.get(i).disparar();
			clienteRebelde.soldados.get(i).atacar();
		}
		clienteImperio.jefe.ordenar();
		clienteRebelde.jefe.ordenar();
		
		System.out.println("YO SOY TU PADRE");
	}

}
