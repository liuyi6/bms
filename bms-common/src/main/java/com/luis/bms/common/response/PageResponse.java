package com.luis.bms.common.response;

import java.util.List;

/**  
* @ClassName: PageResponse  
* @Description: 统一分页返回对象  
* @author luis  
* @date 2019年5月16日  
*/
public class PageResponse<T> extends Response<T>{

	private static final long serialVersionUID = 2032558206570503559L;
	
	private int totalPage;
	
	private int currentPage;
	
	private int perPageCount;
	
	private List<T> dataList;

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPerPageCount() {
		return perPageCount;
	}

	public void setPerPageCount(int perPageCount) {
		this.perPageCount = perPageCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
}
