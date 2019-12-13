package dao;

import java.util.Date;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/27 22:03
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class Car {
	private String no;
	private String id;
	private String color;
	private Date createDate;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "car{" +
				"no='" + no + '\'' +
				", id='" + id + '\'' +
				", color='" + color + '\'' +
				", createDate=" + createDate +
				'}';
	}
}
