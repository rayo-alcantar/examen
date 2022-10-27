//Crear clase para administrar clientes, que creen objetos de items.
//Crear clase para administrar items, que creen objetos de items.
public class Cliente {
	//crear atributos.
	private String nombre;
	private String apellido;
	private int id;
	private int carrito;
	//crear de tipo Item.
	private Item item;
	//crear constructor sin parámetros.
	public Cliente() {
	}
	//crear constructor parametrizado.
	public Cliente(String nombre, String apellido, int id, int carrito, Item item) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.carrito = carrito;
		this.item = item;

	}//cerrar constructor.
	//crear seders y geters.
	//set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//get
	public String getNombre() {
		return nombre;
	}
	//set
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//get
	public String getApellido() {
		return apellido;
	}
	//set
	public void setId(int id) {
		this.id = id;
	}
	//get
	public int getId() {
		return id;
	}
	//set.
	public void setCarrito(int carrito) {
		this.carrito = carrito;
	}
	//get
	public int getCarrito() {
		return carrito;
	}
	//set
	public void setItem(Item item) {
		this.item = item;
	}
	//get
	public Item getItem() {
		return item;
	}
	//hacer método tostring.
	public String toString() {
		return "Nombre: " + nombre + " Apellido: " + apellido + " Id: " + id + " Item: " + item;
	}
	//hcaer método que permita añadir un elemento al carrito, lo almacene, añada uno al carrito, y lo muestre.
	public void añadirItem(Item item) {
		this.item = item;
		carrito++;
		System.out.println("Item añadido al carrito.");
	}
	//hacer método que elimine un item del carrito.
	public void eliminarItem(Item item) {
		this.item = item;
		carrito--;
		System.out.println("Item eliminado del carrito.");
	}
}//cerrar class.