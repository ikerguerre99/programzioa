package Guztia;

public class Ardoa extends Artikuloa {

	public Ardoa(String kodea, String izena, String marka, double salneurria, int stock) {
		super(kodea, izena, marka, salneurria, stock);
		// TODO Auto-generated constructor stub
	}


	private String kolorea;
	private String jatorria;
	private int urtea;
	private String mahatsa;
	
	/**
	 * @return the kolorea
	 */
	public String getKolorea() {
		return kolorea;
	}

	/**
	 * @param kolorea the kolorea to set
	 */
	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}

	/**
	 * @return the jatorria
	 */
	public String getJatorria() {
		return jatorria;
	}

	/**
	 * @param jatorria the jatorria to set
	 */
	public void setJatorria(String jatorria) {
		this.jatorria = jatorria;
	}

	/**
	 * @return the urtea
	 */
	public int getUrtea() {
		return urtea;
	}

	/**
	 * @param urtea the urtea to set
	 */
	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	/**
	 * @return the mahatsa
	 */
	public String getMahatsa() {
		return mahatsa;
	}

	/**
	 * @param mahatsa the mahatsa to set
	 */
	public void setMahatsa(String mahatsa) {
		this.mahatsa = mahatsa;
	}

	
	public void printEzaugarriak(){
		}

	@Override
	public boolean osasungarria() {
		// TODO Auto-generated method stub
		return false;
	}
}
