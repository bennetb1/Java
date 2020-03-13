import java.util.Date;

public class Item {
	
	public Item() {
		this.status = false ; 
		this.title = "New title" ; 
		this.desc = " " ; 
		this.created = new Date() ; 
	}
	public Item(String title, String desc) {
		this.status = status ; 
		this.title = title ; 
		this.desc = desc ; 
		this.created = new Date() ;
	} 
	
	
	private String title ; 
	private String desc ; 
	private boolean status ; 
	private final Date created;
	private Date completed;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCompleted() {
		return completed;
	}
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	public Date getCreated() {
		return created;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", "
				+ "desc=" + desc + ", "
						+ "status=" + status + ", "
								+ "created=" + created
				+ ", completed=" + completed + "]";
	}
	
	
		
	}
