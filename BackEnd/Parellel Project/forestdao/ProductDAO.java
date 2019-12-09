package com.cgi.parellelproject.forestdao;


import java.util.List;

import com.cgi.parellelproject.bean.ProductBean;

public interface ProductDAO {
		boolean addProduct(ProductBean bean);
		boolean deleteProduct(int productId);
		boolean modifyProduct(String name);
}
