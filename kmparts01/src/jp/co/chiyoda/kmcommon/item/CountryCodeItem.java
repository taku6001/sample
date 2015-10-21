package jp.co.chiyoda.kmcommon.item;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class CountryCodeItem implements Serializable{
	private static final long serialVersionUID = 1L;

	private Boolean isTarget;
	private String countryCode;
	private String countryNameEn;
	private String countryNameAbbrEn;
	private String countryNameJp;
	private String countryNameAbbrJp;


	public Boolean getIsTarget() {
		return isTarget;
	}
	public void setIsTarget(Boolean isTarget) {
		this.isTarget = isTarget;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryNameEn() {
		return countryNameEn;
	}
	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}
	public String getCountryNameAbbrEn() {
		return countryNameAbbrEn;
	}
	public void setCountryNameAbbrEn(String countryNameAbbrEn) {
		this.countryNameAbbrEn = countryNameAbbrEn;
	}
	public String getCountryNameJp() {
		return countryNameJp;
	}
	public void setCountryNameJp(String countryNameJp) {
		this.countryNameJp = countryNameJp;
	}
	public String getCountryNameAbbrJp() {
		return countryNameAbbrJp;
	}
	public void setCountryNameAbbrJp(String countryNameAbbrJp) {
		this.countryNameAbbrJp = countryNameAbbrJp;
	}

	
}
