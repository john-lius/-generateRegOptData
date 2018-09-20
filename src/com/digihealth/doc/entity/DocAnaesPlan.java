package com.digihealth.doc.entity;

import java.util.Date;

public class DocAnaesPlan {
	private String id;

	private String regOptId;

	/**
	 * END,NO_END
	 */
	private String processState;

	/**
	 * �������
	 */
	private String specialCase;

	/**
	 * asa�ּ�
	 */
	private Integer asa;

	/**
	 * ������code
	 */
	private String anaesMethodCode;

	/**
	 * ����������
	 */
	private String anaesMethodName;

	/**
	 * �໤��Ŀ
	 */
	private String guardianship;

	/**
	 * �յ�����
	 */
	private String inductionMethod;

	/**
	 * �˹�����
	 */
	private String artificialAirway;

	/**
	 * ���̵�
	 */
	private Integer puncPoint;

	/**
	 * �����ͷ���
	 */
	private String nerveBlock;

	/**
	 * �������
	 */
	private String specialOperate;

	/**
	 * ������е
	 */
	private String anaesInstrument;

	/**
	 * ���ƹ�
	 */
	private Integer threadedPipe;

	/**
	 * ����
	 */
	private Integer mask;

	/**
	 * ��
	 */
	private Integer laryngoscope;

	/**
	 * ���ܵ���
	 */
	private Integer tracheaPipe;

	/**
	 * ���ܵ���ID
	 */
	private Integer tracheaPipeId;

	/**
	 * ˫ǻ���ܵ���
	 */
	private Integer doubleChamber;

	/**
	 * ˫ǻ���ܵ���ID
	 */
	private Integer doubleChamberId;

	/**
	 * ����ID
	 */
	private Integer laryngealId;

	/**
	 * ���ľ������̰�
	 */
	private Integer centralVenous;

	/**
	 * ѹ��������
	 */
	private Integer pressureSensor;

	/**
	 * ����������
	 */
	private Integer arterialPuncture;

	/**
	 * ΢����
	 */
	private Integer microPump;

	/**
	 * ������е
	 */
	private String otherInstrument;

	/**
	 * ����ҩ
	 */
	private String localAnest;

	/**
	 * ��������ҩ
	 */
	private String otherlocalAnest;

	/**
	 * ��ҩ
	 */
	private String sedatives;

	/**
	 * ������ҩ
	 */
	private String otherSedatives;

	/**
	 * ��ʹҩ
	 */
	private String analgesics;

	/**
	 * ������ʹҩ
	 */
	private String otherAnalgesics;

	/**
	 * ����ҩ
	 */
	private String muscleRelaxant;

	/**
	 * ��������ҩ
	 */
	private String otherMuscleRelaxant;

	/**
	 * ����ȫ��ҩ
	 */
	private String intravenousAnest;

	/**
	 * ��������ȫ��ҩ
	 */
	private String otherIntravenousAnest;

	/**
	 * ��������ҩ
	 */
	private String inhalationAnest;

	/**
	 * ������������ҩ
	 */
	private String otherInhalationAnest;

	/**
	 * ������ҩ
	 */
	private String adjuvantTherapy;

	/**
	 * ����������ҩ
	 */
	private String otherAdjuvantTherapy;

	/**
	 * ������ҩ
	 */
	private String aidMedication;

	/**
	 * ����������ҩ
	 */
	private String otherAidMedication;

	/**
	 * ��Һ
	 */
	private String infusion;

	/**
	 * ������Һ
	 */
	private String otherInfusion;

	/**
	 * ��ʹ�÷���
	 */
	private String analgesicPumpMethod;

	/**
	 * ȥ��
	 */
	private Integer leaveTo;

	/**
	 * ����ҽ��ID
	 */
	private String anaesDoctorId;

	/**
	 * ����ҽ������
	 */
	private String anaesDoctorName;

	/**
	 * ����
	 */
	private Date date;

	private Integer intraspAnes;

	private Integer generalAnes;

	private Integer nerveBlockAnes;

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

	public String getSpecialCase() {
		return specialCase;
	}

	public void setSpecialCase(String specialCase) {
		this.specialCase = specialCase;
	}

	public Integer getAsa() {
		return asa;
	}

	public void setAsa(Integer asa) {
		this.asa = asa;
	}

	public String getAnaesMethodCode() {
		return anaesMethodCode;
	}

	public void setAnaesMethodCode(String anaesMethodCode) {
		this.anaesMethodCode = anaesMethodCode;
	}

	public String getAnaesMethodName() {
		return anaesMethodName;
	}

	public void setAnaesMethodName(String anaesMethodName) {
		this.anaesMethodName = anaesMethodName;
	}

	public String getGuardianship() {
		return guardianship;
	}

	public void setGuardianship(String guardianship) {
		this.guardianship = guardianship;
	}

	public String getInductionMethod() {
		return inductionMethod;
	}

	public void setInductionMethod(String inductionMethod) {
		this.inductionMethod = inductionMethod;
	}

	public String getArtificialAirway() {
		return artificialAirway;
	}

	public void setArtificialAirway(String artificialAirway) {
		this.artificialAirway = artificialAirway;
	}

	public Integer getPuncPoint() {
		return puncPoint;
	}

	public void setPuncPoint(Integer puncPoint) {
		this.puncPoint = puncPoint;
	}

	public String getNerveBlock() {
		return nerveBlock;
	}

	public void setNerveBlock(String nerveBlock) {
		this.nerveBlock = nerveBlock;
	}

	public String getSpecialOperate() {
		return specialOperate;
	}

	public void setSpecialOperate(String specialOperate) {
		this.specialOperate = specialOperate;
	}

	public String getAnaesInstrument() {
		return anaesInstrument;
	}

	public void setAnaesInstrument(String anaesInstrument) {
		this.anaesInstrument = anaesInstrument;
	}

	public Integer getThreadedPipe() {
		return threadedPipe;
	}

	public void setThreadedPipe(Integer threadedPipe) {
		this.threadedPipe = threadedPipe;
	}

	public Integer getMask() {
		return mask;
	}

	public void setMask(Integer mask) {
		this.mask = mask;
	}

	public Integer getLaryngoscope() {
		return laryngoscope;
	}

	public void setLaryngoscope(Integer laryngoscope) {
		this.laryngoscope = laryngoscope;
	}

	public Integer getTracheaPipe() {
		return tracheaPipe;
	}

	public void setTracheaPipe(Integer tracheaPipe) {
		this.tracheaPipe = tracheaPipe;
	}

	public Integer getTracheaPipeId() {
		return tracheaPipeId;
	}

	public void setTracheaPipeId(Integer tracheaPipeId) {
		this.tracheaPipeId = tracheaPipeId;
	}

	public Integer getDoubleChamber() {
		return doubleChamber;
	}

	public void setDoubleChamber(Integer doubleChamber) {
		this.doubleChamber = doubleChamber;
	}

	public Integer getDoubleChamberId() {
		return doubleChamberId;
	}

	public void setDoubleChamberId(Integer doubleChamberId) {
		this.doubleChamberId = doubleChamberId;
	}

	public Integer getLaryngealId() {
		return laryngealId;
	}

	public void setLaryngealId(Integer laryngealId) {
		this.laryngealId = laryngealId;
	}

	public Integer getCentralVenous() {
		return centralVenous;
	}

	public void setCentralVenous(Integer centralVenous) {
		this.centralVenous = centralVenous;
	}

	public Integer getPressureSensor() {
		return pressureSensor;
	}

	public void setPressureSensor(Integer pressureSensor) {
		this.pressureSensor = pressureSensor;
	}

	public Integer getArterialPuncture() {
		return arterialPuncture;
	}

	public void setArterialPuncture(Integer arterialPuncture) {
		this.arterialPuncture = arterialPuncture;
	}

	public Integer getMicroPump() {
		return microPump;
	}

	public void setMicroPump(Integer microPump) {
		this.microPump = microPump;
	}

	public String getOtherInstrument() {
		return otherInstrument;
	}

	public void setOtherInstrument(String otherInstrument) {
		this.otherInstrument = otherInstrument;
	}

	public String getLocalAnest() {
		return localAnest;
	}

	public void setLocalAnest(String localAnest) {
		this.localAnest = localAnest;
	}

	public String getOtherlocalAnest() {
		return otherlocalAnest;
	}

	public void setOtherlocalAnest(String otherlocalAnest) {
		this.otherlocalAnest = otherlocalAnest;
	}

	public String getSedatives() {
		return sedatives;
	}

	public void setSedatives(String sedatives) {
		this.sedatives = sedatives;
	}

	public String getOtherSedatives() {
		return otherSedatives;
	}

	public void setOtherSedatives(String otherSedatives) {
		this.otherSedatives = otherSedatives;
	}

	public String getAnalgesics() {
		return analgesics;
	}

	public void setAnalgesics(String analgesics) {
		this.analgesics = analgesics;
	}

	public String getOtherAnalgesics() {
		return otherAnalgesics;
	}

	public void setOtherAnalgesics(String otherAnalgesics) {
		this.otherAnalgesics = otherAnalgesics;
	}

	public String getMuscleRelaxant() {
		return muscleRelaxant;
	}

	public void setMuscleRelaxant(String muscleRelaxant) {
		this.muscleRelaxant = muscleRelaxant;
	}

	public String getOtherMuscleRelaxant() {
		return otherMuscleRelaxant;
	}

	public void setOtherMuscleRelaxant(String otherMuscleRelaxant) {
		this.otherMuscleRelaxant = otherMuscleRelaxant;
	}

	public String getIntravenousAnest() {
		return intravenousAnest;
	}

	public void setIntravenousAnest(String intravenousAnest) {
		this.intravenousAnest = intravenousAnest;
	}

	public String getOtherIntravenousAnest() {
		return otherIntravenousAnest;
	}

	public void setOtherIntravenousAnest(String otherIntravenousAnest) {
		this.otherIntravenousAnest = otherIntravenousAnest;
	}

	public String getInhalationAnest() {
		return inhalationAnest;
	}

	public void setInhalationAnest(String inhalationAnest) {
		this.inhalationAnest = inhalationAnest;
	}

	public String getOtherInhalationAnest() {
		return otherInhalationAnest;
	}

	public void setOtherInhalationAnest(String otherInhalationAnest) {
		this.otherInhalationAnest = otherInhalationAnest;
	}

	public String getAdjuvantTherapy() {
		return adjuvantTherapy;
	}

	public void setAdjuvantTherapy(String adjuvantTherapy) {
		this.adjuvantTherapy = adjuvantTherapy;
	}

	public String getOtherAdjuvantTherapy() {
		return otherAdjuvantTherapy;
	}

	public void setOtherAdjuvantTherapy(String otherAdjuvantTherapy) {
		this.otherAdjuvantTherapy = otherAdjuvantTherapy;
	}

	public String getAidMedication() {
		return aidMedication;
	}

	public void setAidMedication(String aidMedication) {
		this.aidMedication = aidMedication;
	}

	public String getOtherAidMedication() {
		return otherAidMedication;
	}

	public void setOtherAidMedication(String otherAidMedication) {
		this.otherAidMedication = otherAidMedication;
	}

	public String getInfusion() {
		return infusion;
	}

	public void setInfusion(String infusion) {
		this.infusion = infusion;
	}

	public String getOtherInfusion() {
		return otherInfusion;
	}

	public void setOtherInfusion(String otherInfusion) {
		this.otherInfusion = otherInfusion;
	}

	public String getAnalgesicPumpMethod() {
		return analgesicPumpMethod;
	}

	public void setAnalgesicPumpMethod(String analgesicPumpMethod) {
		this.analgesicPumpMethod = analgesicPumpMethod;
	}

	public Integer getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Integer leaveTo) {
		this.leaveTo = leaveTo;
	}

	public String getAnaesDoctorId() {
		return anaesDoctorId;
	}

	public void setAnaesDoctorId(String anaesDoctorId) {
		this.anaesDoctorId = anaesDoctorId;
	}

	public String getAnaesDoctorName() {
		return anaesDoctorName;
	}

	public void setAnaesDoctorName(String anaesDoctorName) {
		this.anaesDoctorName = anaesDoctorName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getIntraspAnes() {
		return intraspAnes;
	}

	public void setIntraspAnes(Integer intraspAnes) {
		this.intraspAnes = intraspAnes;
	}

	public Integer getGeneralAnes() {
		return generalAnes;
	}

	public void setGeneralAnes(Integer generalAnes) {
		this.generalAnes = generalAnes;
	}

	public Integer getNerveBlockAnes() {
		return nerveBlockAnes;
	}

	public void setNerveBlockAnes(Integer nerveBlockAnes) {
		this.nerveBlockAnes = nerveBlockAnes;
	}

}
