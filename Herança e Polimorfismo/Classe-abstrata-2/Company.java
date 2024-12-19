public class Company extends TaxPayer {
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualInCome, int numberOfEmployees) {
		super(name, anualInCome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double Tax() {
		if (numberOfEmployees > 10) {
			return anualInCome * 0.14;
		} else {
			return anualInCome * 0.16;
		}
	}

}
