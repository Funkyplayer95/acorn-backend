package springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Predescription {
	private int id;
	private String sPatientName;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getsPatientName() {
		return sPatientName;
	}

	public void setsPatientName(String sPatientName) {
		this.sPatientName = sPatientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	
	@Override
	public String toString() {
		return getId() + ":" + getsPatientName() 
			+ ":" + getMedicines();
	}

}
