package entity;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	private String ownerName;
	private String ownerBio;
	private String owneremail;
	private List<Education> ownerEducation = new ArrayList<Education>();
	private List<Certification> ownerCertifications = new ArrayList<>();
	
	
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the ownerBio
	 */
	public String getOwnerBio() {
		return ownerBio;
	}
	/**
	 * @param ownerBio the ownerBio to set
	 */
	public void setOwnerBio(String ownerBio) {
		this.ownerBio = ownerBio;
	}
	/**
	 * @return the owneremail
	 */
	public String getOwneremail() {
		return owneremail;
	}
	/**
	 * @param owneremail the owneremail to set
	 */
	public void setOwneremail(String owneremail) {
		this.owneremail = owneremail;
	}
	/**
	 * @return the ownerEducation
	 */
	public List<Education> getOwnerEducation() {
		return ownerEducation;
	}
	/**
	 * @param ownerEducation the ownerEducation to set
	 */
	public void setOwnerEducation(Education education) {
		ownerEducation.add(education);
	}
	/**
	 * @return the ownerCertifications
	 */
	public List<Certification> getOwnerCertifications() {
		return ownerCertifications;
	}
	/**
	 * @param ownerCertifications the ownerCertifications to set
	 */
	public void setOwnerCertifications(Certification certification) {
		ownerCertifications.add(certification);
	}
	
	@Override
	public String toString() {
		String res = "<b>Email: </b>" + owneremail + "<br> <b>Bio: </b>" + ownerBio;
		if(ownerEducation.size() > 0) {
			res += "<br><br><b><u> Education Details </u></b>";
			for(Education edu: ownerEducation) {
				res += "<br><b> Institution: </b>" + edu.getInstitutionName() + "<br><b> Year of Passing: </b>" + edu.getYearOfPassing();
			}
		}
		if(ownerCertifications.size() > 0) {
			res += "<br><br> <b><u>Certification Details: </u></b>";
			for(Certification cert: ownerCertifications) {
				res += "<br><b> Certification Name: </b>" + cert.getCertificationName() + "<br><b> Year of Certification: </b>" + cert.getCertificationYear();
			}
		}
		return res;
	}
	
}
