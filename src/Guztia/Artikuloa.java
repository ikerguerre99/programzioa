package Guztia;

public abstract class Artikuloa {

	protected String kodea;
	protected String izena;
	protected String marka;
	protected double salneurria;
	protected int stock;
	
	public Artikuloa(String kodea, String izena, String marka, double salneurria, int stock){
		this.kodea=kodea;
		this.izena=izena;
		this.marka=marka;
		this.salneurria=salneurria;
		this.stock=stock;
	}
	public Artikuloa(){
		
	}
	
	public void gehituStock(){
		
	}
	
	public void kenduStock(){
		
	}
	
	public abstract void printEzaugarriak();
	
	public abstract boolean osasungarria();
	
	/**
	 * @return the kodea
	 */
	public String getKodea() {
		return kodea;
	}

	/**
	 * @param kodea the kodea to set
	 */
	public void setKodea(String kodea) {
		this.kodea = kodea;
	}

	/**
	 * @return the izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * @param izena the izena to set
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * @return the marka
	 */
	public String getMarka() {
		return marka;
	}

	/**
	 * @param marka the marka to set
	 */
	public void setMarka(String marka) {
		this.marka = marka;
	}

	/**
	 * @return the salneurria
	 */
	public double getSalneurria() {
		return salneurria;
	}

	/**
	 * @param salneurria the salneurria to set
	 */
	public void setSalneurria(double salneurria) {
		this.salneurria = salneurria;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}