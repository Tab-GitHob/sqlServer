package org.cn.yq;

import java.sql.Timestamp;
import java.util.Date;

public class GasBottleInfo {
	private Integer bottleID; // 气瓶ID
	private String manufacturerNo; // 出厂编号
	private String enterpriseSteelNo; // 企业钢码编号
	private String bottleLabelNo; // 标签编号
	private String modelNumber; // 型号
	private String standard; // 规格(kg)
	private Double weight; // 瓶体自重(kg)
	private Double bottleNetWeight; // 瓶体自重(kg)
	private Integer enterpriseID; // 所属企业
	private Integer stationID; // 所属站点
	private String manufacturer; // 生产厂家
	private Date productionDate; // 出厂日期
	private Date invalidDate; // 报废时间
	private Date invalidDisposeDate; // 报废处理时间
	private Date labelInstallDate; // 标签安装时间
	private String testUnit; // 检测单位名称
	private Date lastTestDate; // 上次检测时间
	private String lastHolderName; // 上次持有者名称
	private String lastHolderCardNo; // 上次持有者身份认证卡编号
	private String lastFlowLink; // 上次流转环节
	private Date currentFlowDate; // 当前环节启动时间
	private String currentHolderName; // 本次持有者名称
	private String specialtyCardNo; // 本次持有者身份认证卡编号
	private String currentFlow; // 本次流转环节
	private Date nextTestDate; // 下次检测时间
	private String fillingStatus; // 充装状态
	private Float fillingBeforeWeight; // 充装前重量(kg)
	private Float fillingAfterWeight; // 充装后重量(kg)
	private String flowStatus; // 流转状态
	private String useStatus; // 使用状况
	private String disposeStatus; // 报废处理状况
	private String coverPicture; // 护罩图片附件
	private Date enterDate; // 录入时间
	private Integer enterStaffID; // 录入人
	private Date updateDate; // 更新时间
	private Integer updateStaffID; // 更新人
	private String bottleComment; // 描述
	private Integer deleted; // 删除
	
	@SuppressWarnings("unused")
	private String maskBottleLabelNo;// 掩码气瓶标签号
	@SuppressWarnings("unused")
	private String encryptBottleLabelNo;// 掩码气瓶标签号
	private Integer isScrapOldBottleLabel;// 是否作废原来绑定的气瓶标签，0是，1否
	private String bottleLabelID;// 气瓶标签序列号
	private String enterpriseName; // 所属企业名称
	private String enterName;// 录入人姓名
	private String updateName;// 修改人姓名
	private String testStationName;// 检测单位
	@SuppressWarnings("unused")
	private String maskSpecialtyCardNo;// 掩码当前持有卡
	@SuppressWarnings("unused")
	private String maskLastHolderCardNo;// 掩码上次持有卡
	private String modelName;// 气瓶型号名称
	private Integer bottleViolationCount;// 违规次数
	private String lastHolderCardID;// 上次持有者卡序号
	private String specialtyCardID;// 当前持有者卡序号

	// ========
	private String labelNo; // 新增编码（关联标签表）
	private String fillingStationName; //充装单位
	private String updateTime;
	private Integer phoneUserType ;//手机插入操作用户类型
	private Integer phoneUpdateUserType ;//手机修改操作用户类型
	private Timestamp updateHolderTime ;//气瓶持有者时间戳（用于手机缓存）
	private Integer isAreaSearch;//是不是按区域查询 大于0是按区域查询，此值存取区域ID
	
	//-----新增的
	private Integer stationTypeID;//所属的站点的类型ID
	private Date enterDateBegin; // 录入的开始时间
	private Date enterDateEnd;//录入的结束时间
	private String stationName;//所属站点的名称



	public Integer getIsAreaSearch() {
		return isAreaSearch;
	}

	public void setIsAreaSearch(Integer isAreaSearch) {
		this.isAreaSearch = isAreaSearch;
	}

	public Timestamp getUpdateHolderTime() {
		return updateHolderTime;
	}

	public void setUpdateHolderTime(Timestamp updateHolderTime) {
		this.updateHolderTime = updateHolderTime;
	}

	public Integer getPhoneUpdateUserType() {
		return phoneUpdateUserType;
	}

	public void setPhoneUpdateUserType(Integer phoneUpdateUserType) {
		this.phoneUpdateUserType = phoneUpdateUserType;
	}

	public Integer getPhoneUserType() {
		return phoneUserType;
	}

	public void setPhoneUserType(Integer phoneUserType) {
		this.phoneUserType = phoneUserType;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getFillingStationName() {
		return fillingStationName;
	}

	public void setFillingStationName(String fillingStationName) {
		this.fillingStationName = fillingStationName;
	}

	public String getLabelNo() {
		return labelNo;
	}

	public void setLabelNo(String labelNo) {
		this.labelNo = labelNo;
	}
	// ========

	public String getLastHolderCardID() {
		return lastHolderCardID;
	}

	public void setLastHolderCardID(String lastHolderCardID) {
		this.lastHolderCardID = lastHolderCardID;
	}

	public String getSpecialtyCardID() {
		return specialtyCardID;
	}

	public void setSpecialtyCardID(String specialtyCardID) {
		this.specialtyCardID = specialtyCardID;
	}

	public Integer getBottleViolationCount() {
		return bottleViolationCount;
	}

	public void setBottleViolationCount(Integer bottleViolationCount) {
		this.bottleViolationCount = bottleViolationCount;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getBottleNetWeight() {
		return bottleNetWeight;
	}

	public void setBottleNetWeight(Double bottleNetWeight) {
		this.bottleNetWeight = bottleNetWeight;
	}

	public String getTestStationName() {
		return testStationName;
	}

	public void setTestStationName(String testStationName) {
		this.testStationName = testStationName;
	}

	public String getEnterName() {
		return enterName;
	}

	public void setEnterName(String enterName) {
		this.enterName = enterName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getBottleLabelID() {
		return bottleLabelID;
	}

	public void setBottleLabelID(String bottleLabelID) {
		this.bottleLabelID = bottleLabelID;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEncryptBottleLabelNo() {
		try {
			return AesEncryptor.encrypt(bottleLabelNo);
		} catch (Exception ex) {
			return "";
		}
	}

	public void setEncryptBottleLabelNo(String encryptBottleLabelNo) {
		this.encryptBottleLabelNo = encryptBottleLabelNo;
	}

	public Integer getIsScrapOldBottleLabel() {
		return isScrapOldBottleLabel;
	}

	public void setIsScrapOldBottleLabel(Integer isScrapOldBottleLabel) {
		this.isScrapOldBottleLabel = isScrapOldBottleLabel;
	}

	public String getMaskBottleLabelNo() {
		return AesEncryptor.changeCardID(bottleLabelNo);
	}

	public void setMaskBottleLabelNo(String bottleLabelNo) {
		this.maskBottleLabelNo = bottleLabelNo;
	}

	public String getMaskSpecialtyCardNo() {
		return AesEncryptor.changeCardID(specialtyCardNo);
	}

	public void setMaskSpecialtyCardNo(String maskSpecialtyCardNo) {
		this.maskSpecialtyCardNo = maskSpecialtyCardNo;
	}

	public String getMaskLastHolderCardNo() {
		return AesEncryptor.changeCardID(lastHolderCardNo);
	}

	public void setMaskLastHolderCardNo(String maskLastHolderCardNo) {
		this.maskLastHolderCardNo = maskLastHolderCardNo;
	}

	public Integer getBottleID() {
		return bottleID;
	}

	public void setBottleID(Integer bottleID) {
		this.bottleID = bottleID;
	}

	public String getManufacturerNo() {
		return manufacturerNo;
	}

	public void setManufacturerNo(String manufacturerNo) {
		this.manufacturerNo = manufacturerNo;
	}

	public String getEnterpriseSteelNo() {
		return enterpriseSteelNo;
	}

	public void setEnterpriseSteelNo(String enterpriseSteelNo) {
		this.enterpriseSteelNo = enterpriseSteelNo;
	}

	public String getBottleLabelNo() {
		return bottleLabelNo;
	}

	public void setBottleLabelNo(String bottleLabelNo) {
		this.bottleLabelNo = bottleLabelNo;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getEnterpriseID() {
		return enterpriseID;
	}

	public void setEnterpriseID(Integer enterpriseID) {
		this.enterpriseID = enterpriseID;
	}

	public Integer getStationID() {
		return stationID;
	}

	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Date getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public Date getInvalidDisposeDate() {
		return invalidDisposeDate;
	}

	public void setInvalidDisposeDate(Date invalidDisposeDate) {
		this.invalidDisposeDate = invalidDisposeDate;
	}

	public Date getLabelInstallDate() {
		return labelInstallDate;
	}

	public void setLabelInstallDate(Date labelInstallDate) {
		this.labelInstallDate = labelInstallDate;
	}

	public String getTestUnit() {
		return testUnit;
	}

	public void setTestUnit(String testUnit) {
		this.testUnit = testUnit;
	}

	public Date getLastTestDate() {
		return lastTestDate;
	}

	public void setLastTestDate(Date lastTestDate) {
		this.lastTestDate = lastTestDate;
	}

	public String getLastHolderName() {
		return lastHolderName;
	}

	public void setLastHolderName(String lastHolderName) {
		this.lastHolderName = lastHolderName;
	}

	public String getLastHolderCardNo() {
		return lastHolderCardNo;
	}

	public void setLastHolderCardNo(String lastHolderCardNo) {
		this.lastHolderCardNo = lastHolderCardNo;
	}

	public String getLastFlowLink() {
		return lastFlowLink;
	}

	public void setLastFlowLink(String lastFlowLink) {
		this.lastFlowLink = lastFlowLink;
	}

	public Date getCurrentFlowDate() {
		return currentFlowDate;
	}

	public void setCurrentFlowDate(Date currentFlowDate) {
		this.currentFlowDate = currentFlowDate;
	}

	public String getCurrentHolderName() {
		return currentHolderName;
	}

	public void setCurrentHolderName(String currentHolderName) {
		this.currentHolderName = currentHolderName;
	}

	public String getSpecialtyCardNo() {
		return specialtyCardNo;
	}

	public void setSpecialtyCardNo(String specialtyCardNo) {
		this.specialtyCardNo = specialtyCardNo;
	}

	public String getCurrentFlow() {
		return currentFlow;
	}

	public void setCurrentFlow(String currentFlow) {
		this.currentFlow = currentFlow;
	}

	public Date getNextTestDate() {
		return nextTestDate;
	}

	public void setNextTestDate(Date nextTestDate) {
		this.nextTestDate = nextTestDate;
	}

	public String getFillingStatus() {
		return fillingStatus;
	}

	public void setFillingStatus(String fillingStatus) {
		this.fillingStatus = fillingStatus;
	}

	public Float getFillingBeforeWeight() {
		return fillingBeforeWeight;
	}

	public void setFillingBeforeWeight(Float fillingBeforeWeight) {
		this.fillingBeforeWeight = fillingBeforeWeight;
	}

	public Float getFillingAfterWeight() {
		return fillingAfterWeight;
	}

	public void setFillingAfterWeight(Float fillingAfterWeight) {
		this.fillingAfterWeight = fillingAfterWeight;
	}

	public String getFlowStatus() {
		return flowStatus;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	public String getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public String getDisposeStatus() {
		return disposeStatus;
	}

	public void setDisposeStatus(String disposeStatus) {
		this.disposeStatus = disposeStatus;
	}

	public String getCoverPicture() {
		return coverPicture;
	}

	public void setCoverPicture(String coverPicture) {
		this.coverPicture = coverPicture;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public Integer getEnterStaffID() {
		return enterStaffID;
	}

	public void setEnterStaffID(Integer enterStaffID) {
		this.enterStaffID = enterStaffID;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getUpdateStaffID() {
		return updateStaffID;
	}

	public void setUpdateStaffID(Integer updateStaffID) {
		this.updateStaffID = updateStaffID;
	}

	public String getBottleComment() {
		return bottleComment;
	}

	public void setBottleComment(String bottleComment) {
		this.bottleComment = bottleComment;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	
	
	
	public Integer getStationTypeID() {
		return stationTypeID;
	}

	public void setStationTypeID(Integer stationTypeID) {
		this.stationTypeID = stationTypeID;
	}

	public Date getEnterDateBegin() {
		return enterDateBegin;
	}

	public void setEnterDateBegin(Date enterDateBegin) {
		this.enterDateBegin = enterDateBegin;
	}

	public Date getEnterDateEnd() {
		return enterDateEnd;
	}

	public void setEnterDateEnd(Date enterDateEnd) {
		this.enterDateEnd = enterDateEnd;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public GasBottleInfo Clone() {

		GasBottleInfo clone = new GasBottleInfo();
		clone.bottleID = bottleID;
		clone.manufacturerNo = manufacturerNo;
		clone.enterpriseSteelNo = enterpriseSteelNo;
		clone.bottleLabelNo = bottleLabelNo;
		clone.modelNumber = modelNumber;
		clone.standard = standard;
		clone.weight = weight;
		clone.enterpriseID = enterpriseID;
		clone.stationID = stationID;
		clone.manufacturer = manufacturer;
		clone.productionDate = productionDate;
		clone.invalidDate = invalidDate;
		clone.invalidDisposeDate = invalidDisposeDate;
		clone.labelInstallDate = labelInstallDate;
		clone.testUnit = testUnit;
		clone.lastTestDate = lastTestDate;
		clone.lastHolderName = lastHolderName;
		clone.lastHolderCardNo = lastHolderCardNo;
		clone.lastFlowLink = lastFlowLink;
		clone.currentFlowDate = currentFlowDate;
		clone.currentHolderName = currentHolderName;
		clone.specialtyCardNo = specialtyCardNo;
		clone.currentFlow = currentFlow;
		clone.nextTestDate = nextTestDate;
		clone.fillingStatus = fillingStatus;
		clone.fillingBeforeWeight = fillingBeforeWeight;
		clone.fillingAfterWeight = fillingAfterWeight;
		clone.flowStatus = flowStatus;
		clone.useStatus = useStatus;
		clone.disposeStatus = disposeStatus;
		clone.coverPicture = coverPicture;
		clone.enterDate = enterDate;
		clone.enterStaffID = enterStaffID;
		clone.updateDate = updateDate;
		clone.updateStaffID = updateStaffID;
		clone.bottleComment = bottleComment;
		clone.deleted = deleted;
		clone.stationTypeID = stationTypeID;
		clone.enterDateBegin = enterDateBegin;
		clone.enterDateEnd = enterDateEnd;
		clone.stationName = stationName;
		return clone;
	}

	
}
