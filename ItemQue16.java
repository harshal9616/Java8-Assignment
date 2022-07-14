package assignment;

public class ItemQue16 {

	    int itemid;
	    public int getItemid() {
			return itemid;
		}
		public void setItemid(int itemid) {
			this.itemid = itemid;
		}
		public String getItem_name() {
			return item_name;
		}
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}
		public String getCategory_name() {
			return category_name;
		}
		public void setCategory_name(String category_name) {
			this.category_name = category_name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDate_of_manufacturing() {
			return date_of_manufacturing;
		}
		public void setDate_of_manufacturing(String date_of_manufacturing) {
			this.date_of_manufacturing = date_of_manufacturing;
		}
		public String getDate_of_expiry() {
			return date_of_expiry;
		}
		public void setDate_of_expiry(String date_of_expiry) {
			this.date_of_expiry = date_of_expiry;
		}
		String item_name,category_name;
	    double price ;
	    String date_of_manufacturing, date_of_expiry;
	   
	    protected ItemQue16(int itemid, String item_name, String category_name, double price, String date_of_manufacturing,
	            String date_of_expiry) {
	        super();
	        this.itemid = itemid;
	        this.item_name = item_name;
	        this.category_name = category_name;
	        this.price = price;
	        this.date_of_manufacturing = date_of_manufacturing;
	        this.date_of_expiry = date_of_expiry;
	    }
	    public ItemQue16() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    
	    @Override
	    public String toString() {
	        return "Item [Item Id=" + itemid + ", Item Name=" + item_name + ", Category Name=" + category_name + ", Price="
	                + price + ", Date of Manufacturing=" + date_of_manufacturing + ", Date of Expiry=" + date_of_expiry
	                + "]";
	    } 
   
}
