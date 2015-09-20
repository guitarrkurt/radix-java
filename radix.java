public class radix 
{
	lista listita = new lista(); 

	@SuppressWarnings("null")
	public void ingresaDigitosLista()
	//ingresa los enteros metidos por el usuario en una lista ligada hasta que precione cero
	{
		int noDigitosEnteroMasGrande = 1;
		int contadorDoWhile = 1;
		leeEnteros lee = new leeEnteros();
		int enteroLeido = 0;
		lista cola ;
		lista cola2 = new lista();
		lista auxAsignacion = new lista();
		listaDeListas prueba =new listaDeListas();;
		listaDeListas prueba2;
		listaDeListas prueba3 = new listaDeListas();
		listaDeListas prueba4 = new listaDeListas();
		int noDigitosEntero = 0;
		
		listaDeListas jobs[] = new listaDeListas[100];
		
		do{
			cola = new lista(); 

			prueba2 = new listaDeListas();
			int datoBorrado = 0;
			int unidad = 0;
			
			
				
				if(contadorDoWhile == 1){
					datoBorrado = 0;
					unidad = 0;
					System.out.println("Ingrese los datos");
					System.out.println("Dejar Ingresar Precione 0");
					cola.insertarNodoConLecturaPropia(0);/*ingresamos un cero puesto da problemas a la hora de jalar todos los datos de la lista, no jala el primero de la lista, queremos formar una lista que ya tenga un nodo*/
					
					for(int contador = 1; contador < 100; contador++)
					{
						System.out.println("Ingresa el"+contador+"°."+"numero a la lista:");
						enteroLeido = lee.leeEntero();
						
						noDigitosEntero = lee.obtieneLongitudEntero(enteroLeido);//Aprovechamos para contar el numero de digitos
						if(noDigitosEntero > noDigitosEnteroMasGrande)
						{
							noDigitosEnteroMasGrande = noDigitosEntero;
						}
						
						if(enteroLeido != 0)//pregunta si ya quiere terminar de leer datos
						{
							cola.insertarNodoConLecturaPropia(enteroLeido);
							
						}else
						{
							break;
						}

						
					}
					
					System.out.println("Creamos la lista de listas");
					prueba.insertarNodoAbajo(9);//se crea una lista de listas del 0 al 9
					prueba.imprimirListaDeListasYeah();//se imprime lista de listas
					

					/*.................................................................*/
					while(!cola.esVacia())
					{
						System.out.println("hijo de su poutamadre wini poo");
						datoBorrado = cola.borrarRegresa();	
						cola.imprimirLista();
						System.out.println("\n"+"Numero a Ingresar:"+datoBorrado);
						
						unidad=unidadesDecenasModificado(datoBorrado,contadorDoWhile);
						System.out.println("\nDigito Significativo: "+unidad);
						
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						
						prueba.insertaNodoDerechaSegunNoListas(unidad,datoBorrado);//inserta el dato borrado segun la unidad
						prueba.imprimirListaDeListasYeah();//se imprime lista de listas
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						System.out.println("Insertamos: ");
						jobs[1]= prueba;
					}
					System.out.println("jobs primero exito");
					
					prueba.imprimirListaDeListasYeah();
					System.out.println("jobs2 primero exito");
				}
				else
				{
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					prueba4=jobs[1];
					prueba4.imprimirListaDeListasYeah();
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					System.out.println("Entro al else caro");
					
					datoBorrado = 0;
					unidad = 0;
					//kjas
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					prueba4.imprimirListaDeListasYeah();
					
					auxAsignacion=prueba4.uneEnUnaListaTodasListas();//esta uniendo mal
					
					auxAsignacion.imprimirLista();
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					System.out.println("Salio con exito");
					
					System.out.println("imprimio con exito");
					System.out.println("mother fuckers");

					prueba3.insertarNodoAbajo(9);
					prueba3.imprimirListaDeListasYeah();
					/*...............................................................*/
					while(!auxAsignacion.esVacia())
					{
						System.out.println("hijo de su poutamadre wini poo");
						datoBorrado = auxAsignacion.borrarRegresa();	//Aqui esta el problema
						auxAsignacion.imprimirLista();
						System.out.println("\n"+"Numero a Ingresar2:"+datoBorrado);
						
						unidad=unidadesDecenasModificado(datoBorrado,contadorDoWhile);
						System.out.println("\nDigito Significativo: "+unidad);
						

						System.out.println("Insertamos:2 ");
						prueba3.insertaNodoDerechaSegunNoListas(unidad,datoBorrado);//inserta el dato borrado segun la unidad
						prueba3.imprimirListaDeListasYeah();//se imprime lista de listas
						System.out.println("insertar hijo de su puta madre");
						System.out.println("\nDigito Significativo: "+datoBorrado);
						System.out.println("insertar hijo de su puta madre");
						System.out.println("insertar hijo de su puta madre");
						System.out.println("insertar hijo de su puta madre");
						System.out.println("insertar hijo de su puta madre");
						
						
					}
					System.out.println("casi sale del else");
					

				}

				System.out.println("sale del if");
				contadorDoWhile++;
				System.out.println("el contadorDoWhile valor de:"+contadorDoWhile);

		}while(contadorDoWhile <= noDigitosEnteroMasGrande);
		
		
	}



	public int ingresaDigitosListaYRegresaElDigitoMasGrande()
	//ingresa los enteros metidos por el usuario en una lista ligada hasta que precione cero
	//tambien aprovecha para ver de cuantos digitos consta el entero ingresado mas grande
	//es decir cuantas veces se hara el radix, 456 --> 3 veces, 5678923 --> 7 veces
	{
		int contador = 1, enteroLeido = 0, noDigitosEntero = 0, noDigitosEnteroMasGrande = 0 ;
		leeEnteros lee = new leeEnteros();
		System.out.println("Ingrese los datos");
		while(contador < 100)
		{
			System.out.println("Para dejar Ingresar Precione 0");
			enteroLeido = lee.leeEntero();
			noDigitosEntero = lee.obtieneLongitudEntero(enteroLeido);
			if(noDigitosEntero > noDigitosEnteroMasGrande)
			{
				noDigitosEnteroMasGrande = noDigitosEntero;
			}
			if(enteroLeido != 0)//si el numero ingresado es distinto cero sigue guardando en la lista, sino sale y quedan guardados en la lista
			{
				System.out.println("Ingresa el"+contador+"o."+"numero");
				listita.insertarNodoConLecturaPropia(enteroLeido);
			}else{
				contador--;
				break;
			}
			contador++;
		}
		return noDigitosEnteroMasGrande;
	}



	public int unidadesDecenas(int noHaDescomponer, int unidadDecenaOCentena)
	{
		//Apartir de la clace "lista" en su metodo sistemaNumeracion
		//Se pide el numero a descomponer en sus  factores, se logra con el % 10
		lista auxiliar = new lista();
		while(noHaDescomponer % 10 != 0)
		{
			int res= noHaDescomponer % 10;//se guarda en una variable res para no repetir el proceso
			auxiliar.insertarNodoConLecturaPropia(res);//encola los modulos, osea escribe el numero al revez, interesa para empezar derecha a izquiera, es decir unidades--> decenas etc
			//System.out.println(res); //Por si se requiere ir viendo los modulos
			noHaDescomponer /= 10;//para que la variable haga las operaciones con el cociente y arroje correctamente los modulos o residuos, es decir que no se cicle con el mismo residuo
		}
		return auxiliar.borrarRegresa();//regresa un solo numero, segun sea respecto a la numeracion que pidio, unidad..decena..centena
	}
	
	static public int unidadesDecenasModificado(int noHaDescomponer, int unidadDecenaOCentena)
	{
		//Apartir de la clace "lista" en su metodo sistemaNumeracion
		//Se pide el numero a descomponer en sus  factores, se logra con el % 10
		int resu = 0;
		for(int i = 0; i<unidadDecenaOCentena;i++)
		{
			resu= noHaDescomponer % 10;//se guarda en una variable res para no repetir el proceso
			//encola los modulos, osea escribe el numero al revez, interesa para empezar derecha a izquiera, es decir unidades--> decenas etc
			//System.out.println(res); //Por si se requiere ir viendo los modulos
			noHaDescomponer /= 10;//para que la variable haga las operaciones con el cociente y arroje correctamente los modulos o residuos, es decir que no se cicle con el mismo residuo
		}
	return resu;//regresa un solo numero, segun sea respecto a la numeracion que pidio, unidad..decena..centena

	}

}


