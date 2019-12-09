package com.cgi.parellelproject.forestdao;

import java.util.List;

import com.cgi.parellelproject.bean.ContractDetailsBean;

public interface ContractDAO {
	
	boolean addContractor(ContractDetailsBean bean);
	boolean deleteContractor(int contractNo);
	boolean modifyContractor(int contractNo);
	public List<ContractDetailsBean> getContractor();

}
