package entity;

public class Certification {
	private String certificationUrl;
	private String certificationName;
	private String certificationProvider;
	private int certificationYear;
	/**
	 * @param certificationUrl
	 * @param certificationName
	 * @param certificationProvider
	 * @param certificationYear
	 */
	public Certification(String certificationUrl, String certificationName, String certificationProvider,
			int certificationYear) {
		super();
		this.certificationUrl = certificationUrl;
		this.certificationName = certificationName;
		this.certificationProvider = certificationProvider;
		this.certificationYear = certificationYear;
	}
	/**
	 * @return the certificationUrl
	 */
	public String getCertificationUrl() {
		return certificationUrl;
	}
	/**
	 * @param certificationUrl the certificationUrl to set
	 */
	public void setCertificationUrl(String certificationUrl) {
		this.certificationUrl = certificationUrl;
	}
	/**
	 * @return the certificationName
	 */
	public String getCertificationName() {
		return certificationName;
	}
	/**
	 * @param certificationName the certificationName to set
	 */
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	/**
	 * @return the certificationProvider
	 */
	public String getCertificationProvider() {
		return certificationProvider;
	}
	/**
	 * @param certificationProvider the certificationProvider to set
	 */
	public void setCertificationProvider(String certificationProvider) {
		this.certificationProvider = certificationProvider;
	}
	/**
	 * @return the certificationYear
	 */
	public int getCertificationYear() {
		return certificationYear;
	}
	/**
	 * @param certificationYear the certificationYear to set
	 */
	public void setCertificationYear(int certificationYear) {
		this.certificationYear = certificationYear;
	}
	
	
}
