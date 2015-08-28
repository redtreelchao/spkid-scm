package com.fclub.tpd.dataobject;

import java.io.Serializable;
import java.util.List;


public class DeliveryArea implements Serializable {

	private static final long serialVersionUID = 143L;
	private List<Object> 			  sendDistrictList;
	private List<Object> 			  sendCountryList;
	private List<Object> 			  sendProvinceList;
	private List<Object> 			  sendCityList;
	private Integer           providerId;
	private Integer           parentId;
	private Boolean 		hasArea;
	private Boolean			hasSendCountry;
	private Boolean			hasSendProvince;
	private Boolean			hasSendCity;
	private Boolean			hasSendDistrict;
	
	public DeliveryArea() {
	}
	public DeliveryArea(List<Object> sendCountryList,
			List<Object> sendProvinceList,
			List<Object> sendCityList,
				List<Object> sendDistrictList
				) {
		this.setSendCityList(sendCityList);
		this.setSendProvinceList(sendProvinceList);
		this.setSendCountryList(sendCountryList);
		this.setSendDistrictList(sendDistrictList);

		this.hasArea = (this.getHasSendCountry() ||
					this.getHasSendDistrict() ||
					this.getHasSendCity() ||
					this.getHasSendProvince()
				);
	}
	
	
	public Boolean getHasSendCountry() {
		return hasSendCountry;
	}

	public void setHasSendCountry(Boolean hasSendCountry) {
		this.hasSendCountry = hasSendCountry;
	}

	public Boolean getHasSendProvince() {
		return hasSendProvince;
	}

	public void setHasSendProvince(Boolean hasSendProvince) {
		this.hasSendProvince = hasSendProvince;
	}

	public Boolean getHasSendCity() {
		return hasSendCity;
	}

	public void setHasSendCity(Boolean hasSendCity) {
		this.hasSendCity = hasSendCity;
	}

	public Boolean getHasSendDistrict() {
		return hasSendDistrict;
	}

	public void setHasSendDistrict(Boolean hasSendDistrict) {
		this.hasSendDistrict = hasSendDistrict;
	}

	public Boolean getHasArea(){
		return hasArea;
	}
	public void setHasArea(Boolean hasArea){
		this.hasArea = hasArea;
	}
    public Integer getParentId(){
    	return parentId;
    }
    
    public void setParentId(Integer parentId) {
    	this.parentId = parentId;
    }
    public Integer getProviderId() {
		return providerId;
	}
    public Integer getRealProviderId(){
    	if( this.parentId > 0) return this.parentId;
    	else return this.providerId;
    }

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	public List<Object> getSendDistrictList() {
		return sendDistrictList;
	}

	public void setSendDistrictList(List<Object> sendDistrictList) {
		this.sendDistrictList = sendDistrictList;
		this.hasSendDistrict = !sendDistrictList.isEmpty();
	}

	public List<Object> getSendCountryList() {
		return sendCountryList;
	}

	public void setSendCountryList(List<Object> sendCountryList) {
		this.sendCountryList = sendCountryList;
		this.hasSendCountry = !sendCountryList.isEmpty();
	}

	public List<Object> getSendProvinceList() {
		return sendProvinceList;
	}

	public void setSendProvinceList(List<Object> sendProvinceList) {
		this.sendProvinceList = sendProvinceList;
		this.hasSendProvince = !sendProvinceList.isEmpty();
	}

	public List<Object> getSendCityList() {
		return sendCityList;
	}

	public void setSendCityList(List<Object> sendCityList) {
		this.sendCityList = sendCityList;
		this.hasSendCity = !sendCityList.isEmpty();
	}
}