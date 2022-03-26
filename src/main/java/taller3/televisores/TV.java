package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		
		numTV++;
	}

	public static void setNumTV(int numTV){
		TV.numTV = numTV;
	}

	public static int getNumTV(){
		return TV.numTV;
	}
	
	public void canalUp() {
		this.setCanal(this.canal + 1);
	}
	
	public void canalDown() {
		this.setCanal(this.canal - 1);
	}
	
	public void volumenUp() {
		this.setVolumen(this.volumen + 1);
	}

	public void volumenDown() {
		this.setVolumen(this.volumen - 1);
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (this.estado == true && (1 <= canal && canal <= 120)) {
			this.canal = canal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (this.estado == true && (0 <= volumen && volumen <= 7)) {
			this.volumen = volumen;
		}
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}	
	
}
