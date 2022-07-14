package assignment;

public class ItemQue6 {

	float itemno;
	protected ItemQue6() {
	super();
	// TODO Auto-generated constructor stub
	}
	public float getItemno() {
	return itemno;
	}
	public void setItemno(float itemno) {
	this.itemno = itemno;
	}
	public String getItemname() {
	return itemname;
	}
	public void setItemname(String itemname) {
	this.itemname = itemname;
	}
	public float getItemprice() {
	return itemprice;
	}
	public void setItemprice(float itemprice) {
	this.itemprice = itemprice;
	}
	protected ItemQue6(float itemno, String itemname, float itemprice) {
	super();
	this.itemno = itemno;
	this.itemname = itemname;
	this.itemprice = itemprice;
	}
	String itemname;
	float itemprice;
	
}
