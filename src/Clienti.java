
public class Clienti {
	
	private String username;
	private String password;
	private String nume;
	private String adresa;
	private String email;
	private int numar;
	
	Clienti(){}
	
	Clienti(String username,String password,String nume,String adresa,String email,int numar){
		this.username = username;
		this.password = password;
		this.nume = nume;
		this.adresa = adresa;
		this.email = email;
		this.numar = numar;
	}
	
	public String toString() {
		return "Username: " + username + " password: " + password + " name: " + nume + " address: " + adresa + " email: " + email + " phone number: " +"0"+ numar;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public void setParola(String newPassword) {
		this.password = newPassword;
	}
	
	public void setNume(String newNume) {
		this.nume = newNume;
	}
	
	public void setAdresa(String newAdresa) {
		this.adresa = newAdresa;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void setNumar(int newNumar) {
		this.numar = newNumar;
	}
	
}
