import java.util.Scanner;


public class leeEnteros {
	
	public int leeEntero()
	{
		Scanner s = new Scanner(System.in);
		String cadena = s.nextLine();
	return Integer.parseInt(cadena);
	}

	public int obtieneLongitudEntero(int entero){
		String longitud = entero+"";
		return longitud.length();
		
	}
}
