package Ejercito;

import java.util.ArrayList;

import Tropas.*;


public class EjercitoRebelde implements Ejercito{

	@Override
	public ArrayList<Nave> crearNaves(int n) {
		// TODO Auto-generated method stub
		ArrayList<Nave> naves = new ArrayList<Nave>();
		
		for(int i = 0; i < n; ++i)
			naves.add(new XWing());
		
		return naves;
	}

	@Override
	public ArrayList<Soldado> crearSoldados(int n) {
		// TODO Auto-generated method stub
		ArrayList<Soldado> soldados = new ArrayList<Soldado>();
		
		for(int i = 0; i < n; ++i)
			soldados.add(new Rebelde());
		
		return soldados;
	}

	@Override
	public Jefe crearJefe() {
		// TODO Auto-generated method stub
		return new Jedi();
	}
	

}
