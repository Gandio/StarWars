package Ejercito;
import java.util.ArrayList;

import Tropas.*;

public interface Ejercito {
	public ArrayList<Nave> crearNaves(int n);
	public ArrayList<Soldado> crearSoldados(int n);
	public Jefe crearJefe();
}
