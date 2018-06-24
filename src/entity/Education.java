package entity;

public class Education {
	private String institutionName;
	private int yearOfPassing;
	/**
	 * @param institutionName
	 * @param yearOfPassing
	 */
	public Education(String institutionName, int yearOfPassing) {
		super();
		this.institutionName = institutionName;
		this.yearOfPassing = yearOfPassing;
	}
	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}
	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	/**
	 * @return the yearOfPassing
	 */
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	/**
	 * @param yearOfPassing the yearOfPassing to set
	 */
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	
	
}
