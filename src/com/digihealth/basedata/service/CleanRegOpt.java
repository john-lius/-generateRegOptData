package com.digihealth.basedata.service;

import com.digihealth.doc.dao.DocAccedeDao;

public class CleanRegOpt {

	public static void clean(String name) {
		DocAccedeDao.deleteByRegOptId(name);
	}

	public static void main(String[] params) {
		if (params != null && params.length > 0) {
			String name = params[0];
			clean(name);
		}
	}

}
