package Pojo;

public class Summary {
	private int id;
	private String productName;
	private String productCode;
	private int totalQty;
	private int soldQty;
	private int availabeQty;
	private Product product;

	public Summary() {
		super();
	}

	public Summary(int id, String productName, String productCode, int totalQty, int soldQty, int availabeQty,
			Product product) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCode = productCode;
		this.totalQty = totalQty;
		this.soldQty = soldQty;
		this.availabeQty = availabeQty;
		this.product = product;
	}

	public Summary(String productName, String productCode, int totalQty, int soldQty, int availabeQty,
			Product product) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.totalQty = totalQty;
		this.soldQty = soldQty;
		this.availabeQty = availabeQty;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getSoldQty() {
		return soldQty;
	}

	public void setSoldQty(int soldQty) {
		this.soldQty = soldQty;
	}

	public int getAvailabeQty() {
		return availabeQty;
	}

	public void setAvailabeQty(int availabeQty) {
		this.availabeQty = availabeQty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
