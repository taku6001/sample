package jp.co.chiyoda.kmcommon.pages;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.co.chiyoda.kmcommon.biz.List01Biz;
import jp.co.chiyoda.kmcommon.item.CountryCodeItem;

@Named
@RequestScoped
public class List01Page {
	@Inject
	private List01Biz listBiz;
	
	@Inject
	private CountryCodeItem countryCodeItem;

	private List<CountryCodeItem> countryCodeItems;
	
	public List01Page() {
	}

	/* リストの先頭行に1行追加するためのメソッド	 */
	public String addNewRecodeField(){
		System.out.println("Add New Line");
		
		if(countryCodeItems != null){
			CountryCodeItem item = new CountryCodeItem();
			item.setIsTarget(Boolean.valueOf(false));
			countryCodeItems.add(0, item);
		}
		return "";
	}
	
	@PostConstruct
	public void initSample(){
		countryCodeItems = new ArrayList<>();
		CountryCodeItem item1 = new CountryCodeItem();
		item1.setIsTarget(Boolean.valueOf(true));
		item1.setCountryCode("JP");
		item1.setCountryNameAbbrEn("Japan");
		item1.setCountryNameEn("Japan");
		CountryCodeItem item2 = new CountryCodeItem();
		item2.setIsTarget(Boolean.valueOf(true));
		item2.setCountryCode("US");
		item2.setCountryNameAbbrEn("United States of America");
		item2.setCountryNameEn("America");
		countryCodeItems.add(item1);
		countryCodeItems.add(item2);
	}
	
	
	
	/* Accessor Methods for Page Class Fields */
	
	public List01Biz getListBiz() {
		return listBiz;
	}

	public void setListBiz(List01Biz listBiz) {
		this.listBiz = listBiz;
	}

	public CountryCodeItem getCountryCodeItem() {
		return countryCodeItem;
	}

	public void setCountryCodeItem(CountryCodeItem countryCodeItem) {
		this.countryCodeItem = countryCodeItem;
	}

	public List<CountryCodeItem> getCountryCodeItems() {
		return countryCodeItems;
	}

	public void setCountryCodeItems(List<CountryCodeItem> countryCodeItems) {
		this.countryCodeItems = countryCodeItems;
	}

	
}
