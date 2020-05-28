package dto;

import java.sql.Date;
import java.sql.Timestamp;

public class TodoDTO {
	public long id;
	public String title;
	public String name;
	public int sequence;
	public String type;
	public Timestamp regDate;
	
	public TodoDTO(long id, String title, String name, int sequence, String type, Timestamp regDate) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.sequence = sequence;
		this.type = type;
		this.regDate = regDate;
	}

	public long getId() {
		return id;
	}
	public void setId(int id) {
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
