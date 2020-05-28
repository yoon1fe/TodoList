package dto;

import java.sql.Date;
import java.sql.Timestamp;

public class TodoDTO {
	private long id;
	private String title;
	private String name;
	private int sequence;
	private String type;
	private Timestamp regDate;
	
	public TodoDTO(String title, String name, int sequence) {
		super();
		this.title = title;
		this.name = name;
		this.sequence = sequence;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "TodoDTO [id=" + id + ", title=" + title + ", name=" + name + ", sequence=" + sequence + ", type=" + type
				+ ", regDate=" + regDate + "]";
	}
	
	
	
}
