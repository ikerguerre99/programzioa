package Guztia;

public class Freskagarriak extends Artikuloa {
	
	private String zaporea;
	boolean zukua;
	boolean gasa;
	int azukrea;

	
	public Freskagarriak(){
		super();
	}

	/**
	 * @return the zaporea
	 */
	public String getZaporea() {
		return zaporea;
	}

	/**
	 * @param zaporea the zaporea to set
	 */
	public void setZaporea(String zaporea) {
		this.zaporea = zaporea;
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

	@Override
	public void printEzaugarriak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean osasungarria() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	
}
