package es.upm.medicalhistories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List; 

public class MedicalHistory {
	
	private String name;
	private String dob;
	private String BloodType;
	private boolean alive; 
	private String dod; 
	private List<Disease> diseases; 
	
	public MedicalHistory() { //esto es un objeto de la clase MedicalHistory; es el constructor
		this.alive = true; 
		this.diseases = new ArrayList<Disease>();
		
	}
	
	
	public List<Disease> getDiseases() {
		return diseases;
	}
	
	public void addDisease (Disease diseases) {
		this.diseases.add(diseases); 
	}
	
	public boolean hasDisease(Disease diseases) {
		boolean contiene = this.diseases.contains(disease);
		return contiene;
	}
	
	//otro constructor
	public MedicalHistory(String name, String dob, String bloodType) {
		super();
		this.name = name;
		this.dob = dob;
		BloodType = bloodType;
		this.alive = true;
		this.diseases = new ArrayList<Disease>();
	}

	boolean isAlive() {  //nombre del método, (arguemtnos que pueden entrar)
		//aquí no acepta ningún argumeto, pero me decuelve true o false
		return alive; 
		
	}
		
	public void hasDied(String _dod) {
		this.dod = _dod;
		this.alive = false; 
		
	}
	
	public static void main(String[] args) {
		MedicalHistory rodrigo = new MedicalHistory();
		rodrigo.name = "Rodrigo"; //con el punto accedemos poniendo el nombre de la clase.método
		rodrigo.BloodType = "AB+";
		rodrigo.dob = "23/09/2025";
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public String getBloodType() {
		return BloodType;
	}
	public String getDod() {
		return dod;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "MedicalHistory [name=" + name + ", dob=" + dob + ", BloodType=" + BloodType + ", alive=" + alive
				+ ", dod=" + dod + ", diseases=" + diseases + "]";
	}
	
	
	
}

