package com.digihealth.doc.entity;

import java.util.Date;

public class DocOptCareRecord {
	private String id;

	/**
	 * ����id
	 */
	private String regOptId;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * ����ʱ��
	 */
	private String inOperRoomTime;

	/**
	 * ����ʱ��
	 */
	private String outOperRoomTime;

	/**
	 * ҩ�����
	 */
	private Integer allergic;

	private String operationCode;

	/**
	 * ��������
	 */
	private String operationName;

	/**
	 * ��־
	 */
	private String senses;

	/**
	 * ��ǰ������Һ
	 */
	private Integer venousInfusion1;

	/**
	 * �������
	 */
	private Integer venipuncture;

	/**
	 * �ܵ�
	 */
	private String pipeline;

	/**
	 * x��Ƭ
	 */
	private Integer xray;

	/**
	 * CTƬ
	 */
	private Integer CT;

	/**
	 * MRIƬ
	 */
	private Integer MRI;

	/**
	 * ������λ
	 */
	private String optbody;

	/**
	 * ��Ƶ�絶
	 */
	private Integer elecKnife;

	/**
	 * �걾
	 */
	private Integer specimen;

	/**
	 * �ͼ�
	 */
	private String inspection;

	/**
	 * �걾����
	 */
	private String specimenName;

	/**
	 * ��ע
	 */
	private String remark;

	/**
	 * �����ҽ��໤ʿ
	 */
	private String shiftChangedNurse;

	/**
	 * �����ҽӰ໤ʿ(���־ֵ����ڲ����Ӱ�)
	 */
	private String shiftChangeNurse;

	/**
	 * ϴ�ֻ�ʿID
	 */
	private String instrnurseId;

	/**
	 * ����ʱ��
	 */
	private Date shiftTime;

	/**
	 * ��ǰƤ�����
	 */
	private String skin1;

	/**
	 * ������λ��
	 */
	private String negativePosition;

	/**
	 * ֹѪ��
	 */
	private String tourniquet;

	/**
	 * ��λ֧������
	 */
	private String supportMaterial;

	/**
	 * ����ֲ����
	 */
	private String implants;

	/**
	 * ����
	 */
	private String leaveTo;

	/**
	 * ����
	 */
	private String leaveToOther;

	/**
	 * ��������Һ
	 */
	private String venousInfusion2;

	/**
	 * ������
	 */
	private String drainageTube;

	/**
	 * ������(�ϻ��ֵ���)
	 */
	private String drainageTube2;

	/**
	 * ����Ƥ�����
	 */
	private String skin2;

	private String pipeState;

	private Integer inspSpeedy;

	private String anaesMethodName;

	private String anaesMethodCode;

	private String allergicContents;

	private Integer negativeFlag;

	private Integer supportMaterialFlag;

	private Integer drainageTubeFlag;

	private String pipelineOther;

	private String implantsOther;

	/**
	 * �������໤ʿ
	 */
	private String wardShiftsNurse;

	/**
	 * �����Ӱ໤ʿ
	 */
	private String wardSuccessionNurse;

	/**
	 * Ѫ��
	 */
	private String bloodType;

	/**
	 * ѪҺ�ɷ�
	 */
	private String bloodConstituent;

	/**
	 * ��Ѫ��
	 */
	private String bloodTransfusion;

	/**
	 * ��Ѫ��
	 */
	private Integer bleedingAmount;

	/**
	 * ��Һ��
	 */
	private Integer infusionVolume;

	/**
	 * ����
	 */
	private Integer urineVolume;

	/**
	 * ��ǰ��ҩ
	 */
	private Integer preoperativeMedication;

	/**
	 * ��ǰ��ҩ����δ��
	 */
	private Integer medicationUsed;

	/**
	 * ���
	 */
	private Integer wristband;

	/**
	 * ����־
	 */
	private Integer bodySurface;

	/**
	 * ��ǰ������1 ѡ�У�0û��ѡ��
	 */
	private Integer banDrinking;

	/**
	 * ��ǰ��ʳ��1ѡ�У�0û��ѡ��
	 */
	private Integer fasting;

	/**
	 * �����������ָʾ���:1ѡ�У�0û��ѡ��
	 */
	private Integer sterilizationMark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getInOperRoomTime() {
		return inOperRoomTime;
	}

	public void setInOperRoomTime(String inOperRoomTime) {
		this.inOperRoomTime = inOperRoomTime;
	}

	public String getOutOperRoomTime() {
		return outOperRoomTime;
	}

	public void setOutOperRoomTime(String outOperRoomTime) {
		this.outOperRoomTime = outOperRoomTime;
	}

	public Integer getAllergic() {
		return allergic;
	}

	public void setAllergic(Integer allergic) {
		this.allergic = allergic;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getSenses() {
		return senses;
	}

	public void setSenses(String senses) {
		this.senses = senses;
	}

	public Integer getVenousInfusion1() {
		return venousInfusion1;
	}

	public void setVenousInfusion1(Integer venousInfusion1) {
		this.venousInfusion1 = venousInfusion1;
	}

	public Integer getVenipuncture() {
		return venipuncture;
	}

	public void setVenipuncture(Integer venipuncture) {
		this.venipuncture = venipuncture;
	}

	public String getPipeline() {
		return pipeline;
	}

	public void setPipeline(String pipeline) {
		this.pipeline = pipeline;
	}

	public Integer getXray() {
		return xray;
	}

	public void setXray(Integer xray) {
		this.xray = xray;
	}

	public Integer getCT() {
		return CT;
	}

	public void setCT(Integer cT) {
		CT = cT;
	}

	public Integer getMRI() {
		return MRI;
	}

	public void setMRI(Integer mRI) {
		MRI = mRI;
	}

	public String getOptbody() {
		return optbody;
	}

	public void setOptbody(String optbody) {
		this.optbody = optbody;
	}

	public Integer getElecKnife() {
		return elecKnife;
	}

	public void setElecKnife(Integer elecKnife) {
		this.elecKnife = elecKnife;
	}

	public Integer getSpecimen() {
		return specimen;
	}

	public void setSpecimen(Integer specimen) {
		this.specimen = specimen;
	}

	public String getInspection() {
		return inspection;
	}

	public void setInspection(String inspection) {
		this.inspection = inspection;
	}

	public String getSpecimenName() {
		return specimenName;
	}

	public void setSpecimenName(String specimenName) {
		this.specimenName = specimenName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShiftChangedNurse() {
		return shiftChangedNurse;
	}

	public void setShiftChangedNurse(String shiftChangedNurse) {
		this.shiftChangedNurse = shiftChangedNurse;
	}

	public String getShiftChangeNurse() {
		return shiftChangeNurse;
	}

	public void setShiftChangeNurse(String shiftChangeNurse) {
		this.shiftChangeNurse = shiftChangeNurse;
	}

	public String getInstrnurseId() {
		return instrnurseId;
	}

	public void setInstrnurseId(String instrnurseId) {
		this.instrnurseId = instrnurseId;
	}

	public Date getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(Date shiftTime) {
		this.shiftTime = shiftTime;
	}

	public String getSkin1() {
		return skin1;
	}

	public void setSkin1(String skin1) {
		this.skin1 = skin1;
	}

	public String getNegativePosition() {
		return negativePosition;
	}

	public void setNegativePosition(String negativePosition) {
		this.negativePosition = negativePosition;
	}

	public String getTourniquet() {
		return tourniquet;
	}

	public void setTourniquet(String tourniquet) {
		this.tourniquet = tourniquet;
	}

	public String getSupportMaterial() {
		return supportMaterial;
	}

	public void setSupportMaterial(String supportMaterial) {
		this.supportMaterial = supportMaterial;
	}

	public String getImplants() {
		return implants;
	}

	public void setImplants(String implants) {
		this.implants = implants;
	}

	public String getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getLeaveToOther() {
		return leaveToOther;
	}

	public void setLeaveToOther(String leaveToOther) {
		this.leaveToOther = leaveToOther;
	}

	public String getVenousInfusion2() {
		return venousInfusion2;
	}

	public void setVenousInfusion2(String venousInfusion2) {
		this.venousInfusion2 = venousInfusion2;
	}

	public String getDrainageTube() {
		return drainageTube;
	}

	public void setDrainageTube(String drainageTube) {
		this.drainageTube = drainageTube;
	}

	public String getDrainageTube2() {
		return drainageTube2;
	}

	public void setDrainageTube2(String drainageTube2) {
		this.drainageTube2 = drainageTube2;
	}

	public String getSkin2() {
		return skin2;
	}

	public void setSkin2(String skin2) {
		this.skin2 = skin2;
	}

	public String getPipeState() {
		return pipeState;
	}

	public void setPipeState(String pipeState) {
		this.pipeState = pipeState;
	}

	public Integer getInspSpeedy() {
		return inspSpeedy;
	}

	public void setInspSpeedy(Integer inspSpeedy) {
		this.inspSpeedy = inspSpeedy;
	}

	public String getAnaesMethodName() {
		return anaesMethodName;
	}

	public void setAnaesMethodName(String anaesMethodName) {
		this.anaesMethodName = anaesMethodName;
	}

	public String getAnaesMethodCode() {
		return anaesMethodCode;
	}

	public void setAnaesMethodCode(String anaesMethodCode) {
		this.anaesMethodCode = anaesMethodCode;
	}

	public String getAllergicContents() {
		return allergicContents;
	}

	public void setAllergicContents(String allergicContents) {
		this.allergicContents = allergicContents;
	}

	public Integer getNegativeFlag() {
		return negativeFlag;
	}

	public void setNegativeFlag(Integer negativeFlag) {
		this.negativeFlag = negativeFlag;
	}

	public Integer getSupportMaterialFlag() {
		return supportMaterialFlag;
	}

	public void setSupportMaterialFlag(Integer supportMaterialFlag) {
		this.supportMaterialFlag = supportMaterialFlag;
	}

	public Integer getDrainageTubeFlag() {
		return drainageTubeFlag;
	}

	public void setDrainageTubeFlag(Integer drainageTubeFlag) {
		this.drainageTubeFlag = drainageTubeFlag;
	}

	public String getPipelineOther() {
		return pipelineOther;
	}

	public void setPipelineOther(String pipelineOther) {
		this.pipelineOther = pipelineOther;
	}

	public String getImplantsOther() {
		return implantsOther;
	}

	public void setImplantsOther(String implantsOther) {
		this.implantsOther = implantsOther;
	}

	public String getWardShiftsNurse() {
		return wardShiftsNurse;
	}

	public void setWardShiftsNurse(String wardShiftsNurse) {
		this.wardShiftsNurse = wardShiftsNurse;
	}

	public String getWardSuccessionNurse() {
		return wardSuccessionNurse;
	}

	public void setWardSuccessionNurse(String wardSuccessionNurse) {
		this.wardSuccessionNurse = wardSuccessionNurse;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getBloodConstituent() {
		return bloodConstituent;
	}

	public void setBloodConstituent(String bloodConstituent) {
		this.bloodConstituent = bloodConstituent;
	}

	public String getBloodTransfusion() {
		return bloodTransfusion;
	}

	public void setBloodTransfusion(String bloodTransfusion) {
		this.bloodTransfusion = bloodTransfusion;
	}

	public Integer getBleedingAmount() {
		return bleedingAmount;
	}

	public void setBleedingAmount(Integer bleedingAmount) {
		this.bleedingAmount = bleedingAmount;
	}

	public Integer getInfusionVolume() {
		return infusionVolume;
	}

	public void setInfusionVolume(Integer infusionVolume) {
		this.infusionVolume = infusionVolume;
	}

	public Integer getUrineVolume() {
		return urineVolume;
	}

	public void setUrineVolume(Integer urineVolume) {
		this.urineVolume = urineVolume;
	}

	public Integer getPreoperativeMedication() {
		return preoperativeMedication;
	}

	public void setPreoperativeMedication(Integer preoperativeMedication) {
		this.preoperativeMedication = preoperativeMedication;
	}

	public Integer getMedicationUsed() {
		return medicationUsed;
	}

	public void setMedicationUsed(Integer medicationUsed) {
		this.medicationUsed = medicationUsed;
	}

	public Integer getWristband() {
		return wristband;
	}

	public void setWristband(Integer wristband) {
		this.wristband = wristband;
	}

	public Integer getBodySurface() {
		return bodySurface;
	}

	public void setBodySurface(Integer bodySurface) {
		this.bodySurface = bodySurface;
	}

	public Integer getBanDrinking() {
		return banDrinking;
	}

	public void setBanDrinking(Integer banDrinking) {
		this.banDrinking = banDrinking;
	}

	public Integer getFasting() {
		return fasting;
	}

	public void setFasting(Integer fasting) {
		this.fasting = fasting;
	}

	public Integer getSterilizationMark() {
		return sterilizationMark;
	}

	public void setSterilizationMark(Integer sterilizationMark) {
		this.sterilizationMark = sterilizationMark;
	}

}
