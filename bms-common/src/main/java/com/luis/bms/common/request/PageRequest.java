package com.luis.bms.common.request;

/**  
* @ClassName: PageRequest  
* @Description: 统一分页请求对象  
* @author luis  
* @date 2019年5月16日  
*/
public class PageRequest extends Request{

	private static final long serialVersionUID = -3050742133697877479L;
	
	public static final int DEFAULT_PAGE = 1; 
	
	public static final int DEFAULT_PAGE_SIZE = 10;
	
	public static final int DEFAULT_MAX_PAGE_SIZE = 1000;
	
	
	//当前页，默认为第1页
	private Integer currentPage = DEFAULT_PAGE;
	
	//当前页数据，默认为10条
	private Integer perPageCount = DEFAULT_PAGE_SIZE;

	public Integer getCurrentPage() {
		if(null == currentPage) {
			setCurrentPage(DEFAULT_PAGE);
		}
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPerPageCount() {
		if(null == perPageCount) {
			setPerPageCount(DEFAULT_PAGE_SIZE);
		}
		return perPageCount;
	}

	public void setPerPageCount(Integer perPageCount) {
		if(perPageCount > DEFAULT_MAX_PAGE_SIZE) {
			this.perPageCount = DEFAULT_MAX_PAGE_SIZE;
		}else {
			this.perPageCount = perPageCount;
		}
	}

}
