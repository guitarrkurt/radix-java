public class listaDeListas {
	nodoDoble  inicio, aux, nuevo, cola, derecha;
	lista nueva = new lista();
	listaDeListas()
	{
		inicio = aux = nuevo = cola = derecha = null;
	}
	
	public void insertarNodoAbajo(int tamano){
		/*Metodo que hace una lista hacia abajo numerada con nodos dobles*/
		//la var "tamano" es la longitud de la lista, por ejemplo:
		//		{1}-->NULL
		//		{2}-->NULL
		//		{3}-->NULL
		//		{4}-->NULL

		int contador = 0;
		while(contador <= tamano)
		{
			if(inicio == null){
				cola = new nodoDoble (0);
				inicio =cola;
				contador++;
			}
			else{
				cola.abajo = new nodoDoble(contador);
				cola = cola.abajo;
				contador++;
			}
		}
		System.out.println("Salio con exito");
	}
	
	public void insertaNodoDerechaSegunNoListas(int numeroLista, int datoHaIngresar)
	{
		System.out.println("entramos a insertar el nodo en lists");
		nodoDoble auxA = inicio;
		nodoDoble auxD = null;

		while(auxA.dato != numeroLista)
		{
			auxA=auxA.abajo;
		}
		auxD = auxA;
			while(auxD.siguiente != null)
			{
				System.out.println("segundo while");
				auxD = auxD.siguiente;
			}
		
		System.out.println("salimos de los whiles correctamente");
		auxD.siguiente = new nodoDoble(datoHaIngresar);
		System.out.println("Se ingreso Correctamente");
	}

	
	
	
	
	
	
	public lista obtenListaHastaTalNodoDescendente(int noLis){
		lista nueva = new lista();
		nodoDoble auxA = inicio;
		nodoDoble auxD = null;
		//chekar porfavor
		while(auxA.dato != noLis)
		{
			auxA=auxA.abajo;
		}
		while(auxD.siguiente != null)
		{
			nueva.insertarNodoConLecturaPropia(nuevo.siguiente.dato);
			auxD=auxD.siguiente;
		}
		return nueva;
	}
	
	public lista uneEnUnaListaTodasListas(){

		nodoDoble auxA = inicio;
		nodoDoble auxD = null;
		
		while(auxA != null)
		{
		
			auxD=auxA;
			while(auxD.siguiente != null)
			{
				
				auxD=auxD.siguiente;
				nueva.insertarNodoConLecturaPropia(auxD.dato);
			}

			
			auxA=auxA.abajo;
		}
		return nueva;
	}
	

	


	
	public boolean esVacia(nodoDoble test){
		
		if (test.siguiente == null)
		{
			return true;
		}else
		{
			return false;
		}
	}

	

	
	public nodoDoble recorreAbajoRegresaPos(int noLista)
	{
		//regresa un nodo hubicado
		aux = inicio;
		while(aux.dato != noLista)
		{
			aux=aux.abajo;
		}
		return aux;
	}



	
	public void imprimirListaDeListasYeah()
	{
		nodoDoble auxAbaj = inicio;
		nodoDoble auxDere;
		String concatena = "";

		while(auxAbaj != null){
			concatena = "";
			auxDere = auxAbaj;
			while(auxDere != null)
			{
				concatena+=("{"+auxDere.dato+"}"+"-->");	
				auxDere = auxDere.siguiente;
			}
			System.out.println(concatena);
			auxAbaj=auxAbaj.abajo;
		}

		System.out.println("Salio con exito de yeah");
	}

	
}
