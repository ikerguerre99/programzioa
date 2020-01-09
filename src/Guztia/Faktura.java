package Guztia;

import java.util.ArrayList;

public class Faktura {

	private int zenbakia;
	private String izena;
	private String abizena;
	private ArrayList<FakturaLerroak> fakturaLerroak;
	private double totala;
	
	
	/**
	 * @return the zenbakia
	 */
	public int getZenbakia() {
		return zenbakia;
	}
	/**
	 * @param zenbakia the zenbakia to set
	 */
	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
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
	 * @return the abizena
	 */
	public String getAbizena() {
		return abizena;
	}
	/**
	 * @param abizena the abizena to set
	 */
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	/**
	 * @return the fakturaLerroak
	 */
	public ArrayList<FakturaLerroak> getFakturaLerroak() {
		return fakturaLerroak;
	}
	/**
	 * @param fakturaLerroak the fakturaLerroak to set
	 */
	public void setFakturaLerroak(ArrayList<FakturaLerroak> fakturaLerroak) {
		this.fakturaLerroak = fakturaLerroak;
	}
	/**
	 * @return the totala
	 */
	public double getTotala() {
		return totala;
	}
	/**
	 * @param totala the totala to set
	 */
	public void setTotala(double totala) {
		this.totala = totala;
	}

}
