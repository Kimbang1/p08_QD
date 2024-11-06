package pack.jdbc;

public class DataBean { //DTO
	
	private int num;
	private String goodsCode; 
	private String goodsName; 
	private int price; 
	private int count;
	
		

	public int getNum() {
		return num;
	}
	
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	} 
}