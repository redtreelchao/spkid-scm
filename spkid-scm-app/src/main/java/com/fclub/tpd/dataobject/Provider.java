package com.fclub.tpd.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.fclub.tpd.dataobject.DeliveryArea;




/**
 * 供应商
 * @version $Id: Provider.java 248 2013-07-26 09:40:52Z liuhuashi $
 */
public class Provider implements Serializable {
    
    private static final long serialVersionUID = 5073377933513892759L;
    
    /** 唯一主键-自增ID */
    private Integer           providerId;
    /** 供应商编码 */
    private String            providerCode;
    /** 供应商名称 */
    private String            providerName;
    /** 税率 */
    private BigDecimal        providerCess;
    /** 添加管理员ID */
    private int               providerAid;
    /** 添加时间 */
    private Date              providerTime;
    
    /** 开户行 */
    private String            providerBank;
    /** 银行账号 */
    private String            providerAccount;
    
    /** 供应商公司名称 */
    private String            officialName;
    private String			  officialAddress;
    
    // 供应商登录账户信息
    private String            userName;
    private String            password;
    private Boolean           providerStatus;
    
    // TPD信息
    private String			  responsibleUser;
    private String			  responsiblePhone;
    private String			  responsibleQQ;
    private String			  responsibleMail;
    
    private String			  orderProcessUser;
    private String			  orderProcessPhone;
    private String			  orderProcessQQ;
    private String			  orderProcessMail;
    
    private String            returnAddress;
    private String			  returnConsignee;
    private String			  returnPostcode;
    private String			  returnMobile;
    
    private Integer			  adminId;
    private Integer			  providerCooperation;
    
    private String			  shippingFeeConfig;
    
    private String			  displayName;
    private String			  logo;
    private String 			  providerAd;
    private Date			  providerAdSdate;
    private Date			  providerAdEdate;
    private Double 			  accountBalance;
    private Double 			  smsPrice;
    
    // 发货商
    private Integer			  parentId;
    private String 			  sendCountry;
	private String 			  sendProvince;
	private String 			  sendCity;
	private String 			  sendDistrict;
	private String 		parentProviderName;
	
	private DeliveryArea 		deliveryArea;
	

	public DeliveryArea getDeliveryArea() {
		return deliveryArea;
	}

	public void setDeliveryArea(DeliveryArea deliveryArea) {
		this.deliveryArea = deliveryArea;
	}
	
	
	public void setParentProviderName(String parentProviderName) {
		this.parentProviderName = parentProviderName;
	}	

	
	public String getParentProviderName(){
		return this.parentProviderName;
	}
	
	public Boolean hasParent(){
		return this.parentId > 0;
	}
	/* ---- extend methods ---- */
	public String getSendCountry() {
		return sendCountry;
	}

	public void setSendCountry(String sendCountry) {
		this.sendCountry = sendCountry;
	}

	public String getSendProvince() {
		return sendProvince;
	}

	public void setSendProvince(String sendProvince) {
		this.sendProvince = sendProvince;
	}

	public String getSendCity() {
		return sendCity;
	}

	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}

	public String getSendDistrict() {
		return sendDistrict;
	}

	public void setSendDistrict(String sendDistrict) {
		this.sendDistrict = sendDistrict;
	}
    
    
    public boolean isAdmin() {
    	return adminId != null && adminId.intValue() > 0;
    }
    
    public Integer getParentId(){
    	return parentId;
    }
    public Integer getRealProviderId(){
    	 return this.providerId;
    }
    
    public void setParentId(Integer parentId) {
    	this.parentId = parentId;
    }
    public Integer getProviderId() {
    	if( this.parentId > 0) return this.parentId;
    	else return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	public String getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public BigDecimal getProviderCess() {
		return providerCess;
	}

	public void setProviderCess(BigDecimal providerCess) {
		this.providerCess = providerCess;
	}

	public int getProviderAid() {
		return providerAid;
	}

	public void setProviderAid(int providerAid) {
		this.providerAid = providerAid;
	}

	public Date getProviderTime() {
		return providerTime;
	}

	public void setProviderTime(Date providerTime) {
		this.providerTime = providerTime;
	}

	public String getProviderBank() {
		return providerBank;
	}

	public void setProviderBank(String providerBank) {
		this.providerBank = providerBank;
	}

	public String getProviderAccount() {
		return providerAccount;
	}

	public void setProviderAccount(String providerAccount) {
		this.providerAccount = providerAccount;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public String getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(String officialAddress) {
		this.officialAddress = officialAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getProviderStatus() {
		return providerStatus;
	}

	public void setProviderStatus(Boolean providerStatus) {
		this.providerStatus = providerStatus;
	}

	public String getResponsibleUser() {
		return responsibleUser;
	}

	public void setResponsibleUser(String responsibleUser) {
		this.responsibleUser = responsibleUser;
	}

	public String getResponsiblePhone() {
		return responsiblePhone;
	}

	public void setResponsiblePhone(String responsiblePhone) {
		this.responsiblePhone = responsiblePhone;
	}

	public String getResponsibleQQ() {
		return responsibleQQ;
	}

	public void setResponsibleQQ(String responsibleQQ) {
		this.responsibleQQ = responsibleQQ;
	}

	public String getResponsibleMail() {
		return responsibleMail;
	}

	public void setResponsibleMail(String responsibleMail) {
		this.responsibleMail = responsibleMail;
	}

	public String getOrderProcessUser() {
		return orderProcessUser;
	}

	public void setOrderProcessUser(String orderProcessUser) {
		this.orderProcessUser = orderProcessUser;
	}

	public String getOrderProcessPhone() {
		return orderProcessPhone;
	}

	public void setOrderProcessPhone(String orderProcessPhone) {
		this.orderProcessPhone = orderProcessPhone;
	}

	public String getOrderProcessQQ() {
		return orderProcessQQ;
	}

	public void setOrderProcessQQ(String orderProcessQQ) {
		this.orderProcessQQ = orderProcessQQ;
	}

	public String getOrderProcessMail() {
		return orderProcessMail;
	}

	public void setOrderProcessMail(String orderProcessMail) {
		this.orderProcessMail = orderProcessMail;
	}

	public String getReturnAddress() {
		return returnAddress;
	}

	public void setReturnAddress(String returnAddress) {
		this.returnAddress = returnAddress;
	}

	public String getReturnConsignee() {
		return returnConsignee;
	}

	public void setReturnConsignee(String returnConsignee) {
		this.returnConsignee = returnConsignee;
	}

	public String getReturnPostcode() {
		return returnPostcode;
	}

	public void setReturnPostcode(String returnPostcode) {
		this.returnPostcode = returnPostcode;
	}

	public String getReturnMobile() {
		return returnMobile;
	}

	public void setReturnMobile(String returnMobile) {
		this.returnMobile = returnMobile;
	}
	
	public Integer getAdminId() {
		return adminId;
	}
	
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
	public Integer getProviderCooperation() {
		return providerCooperation;
	}
	
	public void setProviderCooperation(Integer providerCooperation) {
		this.providerCooperation = providerCooperation;
	}
	
	public String getShippingFeeConfig() {
		return shippingFeeConfig;
	}
	
	public void setShippingFeeConfig(String shippingFeeConfig) {
		this.shippingFeeConfig = shippingFeeConfig;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getProviderAd() {
		return providerAd;
	}

	public void setProviderAd(String providerAd) {
		this.providerAd = providerAd;
	}

	public Date getProviderAdSdate() {
		return providerAdSdate;
	}

	public void setProviderAdSdate(Date providerAdSdate) {
		this.providerAdSdate = providerAdSdate;
	}

	public Date getProviderAdEdate() {
		return providerAdEdate;
	}

	public void setProviderAdEdate(Date providerAdEdate) {
		this.providerAdEdate = providerAdEdate;
	}

	@Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	} ;
	
    public Double getSmsPrice() {
		return smsPrice;
	}

	public void setSmsPrice(Double smsPrice) {
		this.smsPrice = smsPrice;
	} ;
}