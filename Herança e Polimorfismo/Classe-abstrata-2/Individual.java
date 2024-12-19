public class Individual extends TaxPayer {
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualInCome, Double healthExpenditures) {
		super(name, anualInCome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double Tax() {
		if (anualInCome < 20000) {
			return anualInCome * 0.15;
		} else {
			return (anualInCome * 0.25) - (healthExpenditures * 0.5);
		}

	}

}
