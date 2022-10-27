//clase items para vender en la tienda de sports.
public class Item {
	//hacer atributos.
	private String nombre;
	private int id;
	private int precio;
	//hacer constructor parametrizado.
	public Item(String nombre, int id, int precio) {
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
	}
	//hacer getters y setters.
	public void setNombre(){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	//set y get
	public void setId(){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	//hacer set yget de precio.
	public void setPrecio(){
		this.precio = precio;
	}
	public int getPrecio(){
		return precio;
	}
}//cerrar class.