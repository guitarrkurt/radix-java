import java.util.Scanner;

public class lista {
	nodo inicio, aux, nuevo, cola, tope, ant, estado;
	lista(){
		inicio = aux = nuevo = cola =  tope = ant = estado =null;
	}
	lista(int numero){
		insertarNodoConLecturaPropia(numero);
	}

	

	public void insertarNodo(){
		System.out.println("Ingresa el numero entero");
		leeEnteros lee = new leeEnteros();
		/*nuevo = new nodo (lee());
		if (inicio == null){
			inicio = nuevo;
		}else{
			aux = inicio;
			while (aux.siguiente != null){
				aux = aux.siguiente;
			}
			aux.siguiente = nuevo;

				}
			}	*/
		if(inicio == null){
			cola = new nodo (lee.leeEntero());
			inicio =cola;
		}
		else{
			cola.siguiente = new nodo(lee.leeEntero());
			cola = cola.siguiente;
		}
	}
	
	public void insertarNodoConLecturaPropia(int numero)
	//es decir que no necesitamos del metodo leer(), pues ya nos pasan el entero, con el cual trabajar
	{
	//	nodoDoble prueba = new nodoDoble();
		if(inicio == null)
		{
				
				cola = new nodo (numero);
				inicio =cola;
				//prueba.insertarNodoAbajo(numero);
		}
		else{
				cola.siguiente = new nodo(numero);
				cola = cola.siguiente;
			}
	}
	
	
	public int getDato()
	{
		//metodo obtiene el ultimo dato (campo dato) de la lista
		aux = inicio;
		while(aux.siguiente != null)
		{
			aux = aux.siguiente;
		}
		//System.out.println(aux.dato);
		return (aux.dato);
	}
	
	public void getDatoYBorraUltimo()
	{
		//metodo obtiene el ultimo dato (campo dato) de la lista
		tope = inicio;
		
		while(tope.siguiente != null)
		{
			System.out.println("entro al while");
			tope = tope.siguiente;
		}
		ant = tope;
		tope = null;
		//ant.siguiente=null;
		System.out.println("hello word");
		System.out.println(ant.dato);
		//return ant.dato;
	}



	
	public void imprimirLista()
	{
		aux = inicio;
			while(aux != null)
			{
				System.out.print("{"+aux.dato+"} ");
				aux = aux.siguiente;
			}
	}
		
	public int getCampoInfo_DelNodo_Especificado(int NumeroNodo)
	//va a regresar el la informacion del x° especificado en la variable "NumeroNodo", entiendase por x° como 3°, 6°,7° etc
	{
		int contador = 1;
		aux = inicio;
			while((aux != null) && (contador < NumeroNodo))
			{
				//System.out.println("{"+aux.dato+"}");//por si se requiere imprimir
				aux = aux.siguiente;
				contador++;
			}		
			return aux.dato;
	}
		
	public void borrar()
	{
		nodo aux1, aux2;
		aux1=inicio;
		aux2=inicio.siguiente;
		while(aux2.siguiente != null)
		{
			aux2 = aux2.siguiente;
		    aux1 = aux1.siguiente;
   		}
		aux1.siguiente = null;
	}

	public int borrarRegresa()
	{
		int guardar;
		nodo aux1 = inicio;
		nodo aux2 = inicio.siguiente;
//...................................

		if(aux1.siguiente == null)
		{
			System.out.println("{NULL}");
			return aux1.dato;
		}
		else
		{
			while(aux2.siguiente != null)
			{
				aux2 = aux2.siguiente;
				aux1 = aux1.siguiente;
			}
			guardar = aux2.dato;
			aux1.siguiente = null;
			return guardar;
		}
	}
	
	public boolean esVacia()
	{
		nodo estado = inicio;
		System.out.println("*********"+estado);
		System.out.println(estado.dato);
		if(estado.siguiente == null)
		{
			return true;
		}else{
			return false;
		}
	}
	public boolean aunTieneElementos()
	{
		estado = inicio;
		if(estado.siguiente != null)
		{
			return true;
		}else{
			return false;
		}
	}
	



}