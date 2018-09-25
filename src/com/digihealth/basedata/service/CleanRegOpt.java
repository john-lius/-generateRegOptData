package com.digihealth.basedata.service;

import com.digihealth.doc.dao.DocAccedeDao;

public class CleanRegOpt {

	public static void clean() {
		DocAccedeDao.deleteByRegOptId();
	}

	public static void main(String[] args) {
		clean();
	}

}
