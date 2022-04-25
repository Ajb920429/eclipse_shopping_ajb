package shopping;

public class productDTO {
	private int number;
	private String pdNumber; // 상품 번호
	private String pdType; // 상품 종류
	private String pdName; // 상품 이름
	private int pdPrice = 10000000; // 상품 가격
	private int pdInventory = 100; // 상품재고
	
	
	
	
	public productDTO() {
		
	}



	public productDTO(int number, String pdNumber, String pdType, String pdName, int pdPrice, int pdInventory) {
		super();
		this.number = number;
		this.pdNumber = pdNumber;
		this.pdType = pdType;
		this.pdName = pdName;
		this.pdPrice = pdPrice;
		this.pdInventory = pdInventory;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getPdNumber() {
		return pdNumber;
	}



	public void setPdNumber(String pdNumber) {
		this.pdNumber = pdNumber;
	}



	public String getPdType() {
		return pdType;
	}



	public void setPdType(String pdType) {
		this.pdType = pdType;
	}



	public String getPdName() {
		return pdName;
	}



	public void setPdName(String pdName) {
		this.pdName = pdName;
	}



	public int getPdPrice() {
		return pdPrice;
	}



	public void setPdPrice(int pdPrice) {
		this.pdPrice = pdPrice;
	}



	public int getPdInventory() {
		return pdInventory;
	}



	public void setPdInventory(int pdInventory) {
		this.pdInventory = pdInventory;
	}



	@Override
	public String toString() {
		return "productDTO [number=" + number + ", pdNumber=" + pdNumber + ", pdType=" + pdType + ", pdName=" + pdName
				+ ", pdPrice=" + pdPrice + ", pdInventory=" + pdInventory + "]";
	}



	


	



	
	
	
}
