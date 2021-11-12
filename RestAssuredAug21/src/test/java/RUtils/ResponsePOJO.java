package RUtils;
import java.awt.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponsePOJO {
	public int page;
	public int per_page;
	public int total;
	public int total_pages;
	public ArrayList<DataPOJO> data;
	
	public  ResponsePOJO(int page,int per_page,int total, int total_pages, ArrayList<DataPOJO> data) {
		this.page=page;
		this.per_page=per_page;
		this.total =total;
		this.total_pages=total_pages;
		this.data=data;
	}
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public DataPOJO[] getData() {
		return data;
	}

	public void setData(DataPOJO[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		   return "{page:" + page + ","+" per_page:" + per_page +","+ "total:"+total+","+"total_pages:"+total_pages+","
				   +"data:"+data+"}";
		}
}
