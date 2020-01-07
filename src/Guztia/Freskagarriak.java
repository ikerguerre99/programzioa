package Guztia;

public abstract class Freskagarriak extends Artikuloa {

	private String Zaporea;
	boolean zukua;
	boolean gasa;
	int azukrea;
	
	/**
	 * @return the zaporea
	 */
	public String getZaporea() {
		return Zaporea;
	}

	/**
	 * @param zaporea the zaporea to set
	 */
	public void setZaporea(String zaporea) {
		Zaporea = zaporea;
	}

	/**
	 * @return the zukua
	 */
	public boolean isZukua() {
		return zukua;
	}

	/**
	 * @param zukua the zukua to set
	 */
	public void setZukua(boolean zukua) {
		this.zukua = zukua;
	}

	/**
	 * @return the gasa
	 */
	public boolean isGasa() {
		return gasa;
	}

	/**
	 * @param gasa the gasa to set
	 */
	public void setGasa(boolean gasa) {
		this.gasa = gasa;
	}

	/**
	 * @return the azukrea
	 */
	public int getAzukrea() {
		return azukrea;
	}

	/**
	 * @param azukrea the azukrea to set
	 */
	public void setAzukrea(int azukrea) {
		this.azukrea = azukrea;
	}

	
	public void printEzaugarriak(){
		
	}
	
}
