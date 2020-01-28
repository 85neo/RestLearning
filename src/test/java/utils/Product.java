package utils;

public class Product {
	
	
	
	/*
	 
	 {
  "name": "string",
  "type": "string",
  "price": 0,
  "shipping": 0,
  "upc": "string",
  "description": "string",
  "manufacturer": "string",
  "model": "string",
  "url": "string",
  "image": "string"
}
	 */
	
	public String name;
	public String type;
	public String upc;
	public String description;
	public String manufacturer;
	public String model;
	public String url;
	public String image;
	public int price;
	public int shipping;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getShipping() {
		return shipping;
	}
	public void setShipping(int shipping) {
		this.shipping = shipping;
	}
	
	public Product(String name, String type, String upc, String description, String manufacturer, String model,
			String url, String image, int price, int shipping) {
		super();
		this.name = name;
		this.type = type;
		this.upc = upc;
		this.description = description;
		this.manufacturer = manufacturer;
		this.model = model;
		this.url = url;
		this.image = image;
		this.price = price;
		this.shipping = shipping;
	}
	
	
	

}
