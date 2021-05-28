package entity;

public class CategoryQuestion {
	public int id;
	public String categoryName;
	@Override
	public String toString() {
		return "CategoryQuestion [id=" + id + ", categoryName=" + categoryName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
