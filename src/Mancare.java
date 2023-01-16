
public class Mancare {
	
	private String nume;
	private int calorii;
	private int proteine;
	private int carbohidrati;
	private int grasimi;
	private double pret;
	private int cantitate;
	private int bucati;
	
	Mancare(){
	}
	
	Mancare(String nume, int calorii, int proteine, int carbohidrati, int grasimi){
		this.nume = nume;
		this.calorii = calorii;
		this.proteine = proteine;
		this.carbohidrati = carbohidrati;
		this.grasimi = grasimi;
	}
	
	Mancare(String nume, int calorii, int proteine, int carbohidrati, int grasimi, double pret, int cantitate){
		this.nume = nume;
		this.calorii = calorii;
		this.proteine = proteine;
		this.carbohidrati = carbohidrati;
		this.grasimi = grasimi;
		this.pret = pret;
		this.cantitate = cantitate;
	}
	
	Mancare(String nume, int cantitate, double pret){
		this.nume = nume;
		this.cantitate = cantitate;
		this.pret = pret;
	}
	

	public String toStringC() {
		return nume + " calories: " + calorii + " protein: " + proteine + " carbs: " + carbohidrati + " fat: " + grasimi ;
	}
	
	public String toStringO() {
		return nume + " amount: " + cantitate + " price: " + pret;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public int getCalorii() {
		return this.calorii;
	}
	
	public int getProteine() {
		return this.proteine;
	}
	
	public int getCarbohidrati() {
		return this.carbohidrati;
	}
	
	public int getGrasimi() {
		return this.grasimi;
	}
	
	public double getPret() {
		return this.pret;
	}
	
	public int getCantitate() {
		return this.cantitate;
	}
	
	public int getBucati() {
		return this.bucati;
	}
	
	public void setBucati(int newBucati) {
		this.bucati = newBucati;
	}
	
	public void setNume(String newNume) {
		this.nume = newNume;
	}
	
	public void setCalorii(int newCalorii) {
		this.calorii = newCalorii;
	}
	
	public void setProteine(int newProteine) {
		this.proteine = newProteine;
	}
	
	public void setCarbohidrati(int newCarbohidrati) {
		this.carbohidrati = newCarbohidrati;
	}
	
	public void setGrasimi(int newGrasimi) {
		this.grasimi = newGrasimi;
	}
	
	public void setPret(double newPret) {
		this.pret = newPret;
	}
	
	public void setCantitate(int newCantitate) {
		this.cantitate = newCantitate;
	}

}