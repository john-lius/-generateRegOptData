package com.digihealth.doc.entity;

public class DocAnaesRecord {
	/**
	 * �����¼������
	 */
	private String anaRecordId;

	/**
	 * ����ID
	 */
	private String regOptId;

	/**
	 * ����ʼʱ��
	 */
	private String anaesStartTime;

	/**
	 * �������ʱ��
	 */
	private String anaesEndTime;

	/**
	 * ASA�ּ�
	 */
	private String asaLevel;

	/**
	 * ����ּ�
	 */
	private String anaesLevel;

	/**
	 * ������λ
	 */
	private String optBody;

	private String operStartTime;

	private String operEndTime;

	/**
	 * ����ʱ��
	 */
	private String inOperRoomTime;

	/**
	 * ����ʱ��
	 */
	private String outOperRoomTime;

	/**
	 * �������
	 */
	private String leaveTo;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * �������
	 */
	private String specialInfection;

	private String materialPart;

	private String other;

	private Boolean asaLevelE;

	/**
	 * ��ʹ��ʽ 0:��; 1:PCIA; 2:PCEA; 3:PCSA; 4:PCNA
	 */
	private String analgesicMethod;

	/**
	 * �����Կ���ʹ 0:��; 1:����; 2:׵����; 3:�ֲ�;
	 */
	private String patAnalgesia;

	private Integer frontOperForbidTake; // ��ǰ��ʳ:0-��;1-��;

	private String frontOperSpecialCase; // ��ǰ�������

	private Float f; // ����Ƶ��

	private String ie;// ������

	private Float vt;// ������

	private Integer postOperState;

	private String operRoomName;

	private String medicineKeep;

	private Float flow1;

	private String flowUnit1;

	private Float flow2;

	private String flowUnit2;

	private String optLevel;

	private String anaesEffect;

	public String getAnaRecordId() {
		return anaRecordId;
	}

	public void setAnaRecordId(String anaRecordId) {
		this.anaRecordId = anaRecordId;
	}

	public String getRegOptId() {
		return regOptId;
	}

	public void setRegOptId(String regOptId) {
		this.regOptId = regOptId;
	}

	public String getAnaesStartTime() {
		return anaesStartTime;
	}

	public void setAnaesStartTime(String anaesStartTime) {
		this.anaesStartTime = anaesStartTime;
	}

	public String getAnaesEndTime() {
		return anaesEndTime;
	}

	public void setAnaesEndTime(String anaesEndTime) {
		this.anaesEndTime = anaesEndTime;
	}

	public String getAsaLevel() {
		return asaLevel;
	}

	public void setAsaLevel(String asaLevel) {
		this.asaLevel = asaLevel;
	}

	public String getAnaesLevel() {
		return anaesLevel;
	}

	public void setAnaesLevel(String anaesLevel) {
		this.anaesLevel = anaesLevel;
	}

	public String getOptBody() {
		return optBody;
	}

	public void setOptBody(String optBody) {
		this.optBody = optBody;
	}

	public String getOperStartTime() {
		return operStartTime;
	}

	public void setOperStartTime(String operStartTime) {
		this.operStartTime = operStartTime;
	}

	public String getOperEndTime() {
		return operEndTime;
	}

	public void setOperEndTime(String operEndTime) {
		this.operEndTime = operEndTime;
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

	public String getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getSpecialInfection() {
		return specialInfection;
	}

	public void setSpecialInfection(String specialInfection) {
		this.specialInfection = specialInfection;
	}

	public String getMaterialPart() {
		return materialPart;
	}

	public void setMaterialPart(String materialPart) {
		this.materialPart = materialPart;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Boolean getAsaLevelE() {
		return asaLevelE;
	}

	public void setAsaLevelE(Boolean asaLevelE) {
		this.asaLevelE = asaLevelE;
	}

	public String getAnalgesicMethod() {
		return analgesicMethod;
	}

	public void setAnalgesicMethod(String analgesicMethod) {
		this.analgesicMethod = analgesicMethod;
	}

	public String getPatAnalgesia() {
		return patAnalgesia;
	}

	public void setPatAnalgesia(String patAnalgesia) {
		this.patAnalgesia = patAnalgesia;
	}

	public Integer getFrontOperForbidTake() {
		return frontOperForbidTake;
	}

	public void setFrontOperForbidTake(Integer frontOperForbidTake) {
		this.frontOperForbidTake = frontOperForbidTake;
	}

	public String getFrontOperSpecialCase() {
		return frontOperSpecialCase;
	}

	public void setFrontOperSpecialCase(String frontOperSpecialCase) {
		this.frontOperSpecialCase = frontOperSpecialCase;
	}

	public Float getF() {
		return f;
	}

	public void setF(Float f) {
		this.f = f;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public Float getVt() {
		return vt;
	}

	public void setVt(Float vt) {
		this.vt = vt;
	}

	public Integer getPostOperState() {
		return postOperState;
	}

	public void setPostOperState(Integer postOperState) {
		this.postOperState = postOperState;
	}

	public String getOperRoomName() {
		return operRoomName;
	}

	public void setOperRoomName(String operRoomName) {
		this.operRoomName = operRoomName;
	}

	public String getMedicineKeep() {
		return medicineKeep;
	}

	public void setMedicineKeep(String medicineKeep) {
		this.medicineKeep = medicineKeep;
	}

	public Float getFlow1() {
		return flow1;
	}

	public void setFlow1(Float flow1) {
		this.flow1 = flow1;
	}

	public String getFlowUnit1() {
		return flowUnit1;
	}

	public void setFlowUnit1(String flowUnit1) {
		this.flowUnit1 = flowUnit1;
	}

	public Float getFlow2() {
		return flow2;
	}

	public void setFlow2(Float flow2) {
		this.flow2 = flow2;
	}

	public String getFlowUnit2() {
		return flowUnit2;
	}

	public void setFlowUnit2(String flowUnit2) {
		this.flowUnit2 = flowUnit2;
	}

	public String getOptLevel() {
		return optLevel;
	}

	public void setOptLevel(String optLevel) {
		this.optLevel = optLevel;
	}

	public String getAnaesEffect() {
		return anaesEffect;
	}

	public void setAnaesEffect(String anaesEffect) {
		this.anaesEffect = anaesEffect;
	}

}
