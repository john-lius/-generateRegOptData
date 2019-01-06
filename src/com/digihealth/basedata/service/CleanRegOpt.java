package com.digihealth.basedata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.digihealth.basedata.dao.BasDao;
import com.digihealth.basedata.dao.BasRegOptDao;
import com.digihealth.basedata.entity.BasRegOpt;
import com.digihealth.utils.ParseMySql;

public class CleanRegOpt {

	/**
	 * ��ȡ��Ҫɾ��ҵ�����ݵ����б�
	 * @return
	 */
	public static List<Map<String, Object>> getNeedDeleteTables() {
		List<Map<String, Object>> tables = ParseMySql.getTableNames();
		List<Map<String, Object>> needDeleteTables = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : tables) {
			String table = (String) map.get("table");
			List<String> fields = ParseMySql.getColumnNames(table);
			for (String field : fields) {
				if (field.contains("regOptId") && !"bas_region_bed".equals(table)) {
					needDeleteTables.add(map);
				}
			}
		}
		return needDeleteTables;
	}

	public static void deleteBySql(String name) {
		List<Map<String, Object>> list = getNeedDeleteTables();
		BasRegOptDao basRegOptDao = new BasRegOptDao();
		BasDao dao = new BasDao();
		List<BasRegOpt> regOpt = basRegOptDao.searchRegOptByName(name);
		String regOptId = "";
		for (BasRegOpt basRegOpt : regOpt) {
			if (StringUtils.isBlank(regOptId)) {
				regOptId = "'" + basRegOpt.getRegOptId() + "'";
			} else {
				regOptId += ",'" + basRegOpt.getRegOptId() + "'";
			}
		}
		if (StringUtils.isNotBlank(regOptId)) {
			for (Map<String, Object> map : list) {
				String sql = "DELETE FROM " + map.get("table") + " WHERE regOptId IN(" + regOptId + ")";
				System.out.println(sql);
				//ɾ�������ܽ���ر�����
				if ("doc_anaes_summary".equals(map.get("table").toString())) {
					BasDao.delete("DELETE FROM doc_anaes_summary_allergic_reaction WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
					BasDao.delete("DELETE FROM doc_anaes_summary_appendix_canal WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
					BasDao.delete("DELETE FROM doc_anaes_summary_appendix_gen WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
					BasDao.delete("DELETE FROM doc_anaes_summary_appendix_visit WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
					BasDao.delete("DELETE FROM doc_anaes_summary_venipuncture WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
					BasDao.delete("DELETE FROM doc_spinal_canal_puncture WHERE anaSumId IN(SELECT anaSumId FROM doc_anaes_summary WHERE regOptId IN(" + regOptId + "))");
				}
				BasDao.delete(sql);
			}
			BasDao.delete("UPDATE bas_region_bed SET regOptId = NULL, `status` = 0 WHERE regOptId IN(" + regOptId + ")");
			BasDao.delete("UPDATE bas_collect_config SET patientId = NULL WHERE patientId IN(" + regOptId + ")");
		}
		System.out.println("ɾ���ɹ�!");
	}

	public static void main(String[] params) {
		if (params != null && params.length > 0) {
			String value = params[0];
			System.out.println("��ǰ�ֵ�:" + BaseDataService.getCurBasBusEntity().getName() + "\n");
			if (StringUtils.isNotBlank(value)) {
				deleteBySql(value);
			} else {
				System.out.println("��Ч�Ĳ���");
			}
		} else {
			System.out.println("���������");
		}
	}

}
