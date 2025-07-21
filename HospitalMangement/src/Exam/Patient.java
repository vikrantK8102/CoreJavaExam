package Exam;

public class Patient implements Comparable<Patient>{

	String name;
	int priorityOfP;
	
	public Patient(String name, int priorityOfP) {
		super();
		this.name = name;
		this.priorityOfP = priorityOfP;
	}
	
	@Override
	public int compareTo(Patient other) {
		// Reverse order: higher priority comes first
		return Integer.compare(other.priorityOfP, this.priorityOfP);
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriorityOfP() {
		return priorityOfP;
	}

	public void setPriorityOfP(int priorityOfP) {
		this.priorityOfP = priorityOfP;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", priorityOfP=" + priorityOfP + "]";
	}





	





}
