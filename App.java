/*
 * programa hecho para dadministrar una tienda de deportes; se puede añadir un item nuevo para la venta, mostrarlos y eliminarlos.
 * autor: ángel De jesús Alcantar Garza.
 */
import java.util.Scanner;
//clase donde hacemos método main, y métodos para controlar los atributos.
public class App {
	//atributos.
	private static Item[] items = new Item[10];
	private static int contador = 0;
	private static Scanner teclado;
	//método main.
	public static void main(String[] args){
		teclado = new Scanner(System.in);
		int opcion;
		//dar la bienvenida al sistema de la tienda de sports.
		System.out.println("Bienvenido al sistema de la tienda de sports.");
		System.out.println("Aquí podrás dar de alta artículos para su venta; eliminarlos e imprimirlos.");
		//hacer do while para menú.
		do{
			System.out.println("1. Agregar item.");
			System.out.println("2. Listar items.");
			System.out.println("3. borrar item.");
			System.out.println("4. salir");
			System.out.println("Ingrese opción: ");
			opcion = teclado.nextInt();
			//hacer switch para opciones.
			switch(opcion){
				case 1:
				//pedir y mandar datos.
				System.out.println("Ingrese nombre: ");
				String nombre = teclado.next();
				System.out.println("Ingrese id: ");
				int id = teclado.nextInt();
				System.out.println("Ingrese precio: ");
				int precio = teclado.nextInt();
				//haer objeto int.
				Item item = new Item(nombre, id, precio);
				agregarItem(item);
			break;
			case 2:
				listarItems();
			break;
			case 3:
				//lamar método.
				//pedir datos para el método.
				System.out.println("Ingrese id (recuerde que solo puede ser en órden decreciente): ");
				int id2 = teclado.nextInt();
				borrarItem(id2);
			break;
			case 4:
			
			break;
			default:
				System.out.println("Opción inválida.");
			break;
			} 
		}while(opcion != 4);
	}

	//métodos auxiliares.
	public static void agregarItem(Item item) {
		items[contador] = item;
		contador++;
	}
	public static void listarItems() {
		for (int i = 0; i < contador; i++) {
			System.out.println(items[i].getNombre()+ " precio: " + items[i].getPrecio() + ".");
		}
	}
	
	//método para borrar item.
	public static void borrarItem(int id) {
		for (int i = 0; i < contador; i++) {
			if (items[i].getId() == id) {
				items[i] = null;
				contador--;
			}
		}
	}
}//cerrar class.