package com.cniao5.entity;

/**
 * 
 * 当前类注释:
 * ProjectName：36KrDataCrawler
 * Author:<a href="http://www.cniao5.com">菜鸟窝</a>
 * Description：
 * 菜鸟窝是一个只专注做Android开发技能的在线学习平台，课程以实战项目为主，对课程与服务”吹毛求疵”般的要求，
 * 打造极致课程，是菜鸟窝不变的承诺
 */
public class FindAdBean {
	 private String id;
	 private String type;
	 private String weight;
	 private String img_url;
	 private String link_url;
	 private String title;
	 private String operator;
	 private String background_color;
	 private String deleted_at;
	 private String created_at;
	 private String updated_at;
	public FindAdBean() {
		super();
	}
	public FindAdBean(String id, String type, String weight, String img_url,
			String link_url, String title, String operator,
			String background_color, String deleted_at, String created_at,
			String updated_at) {
		super();
		this.id = id;
		this.type = type;
		this.weight = weight;
		this.img_url = img_url;
		this.link_url = link_url;
		this.title = title;
		this.operator = operator;
		this.background_color = background_color;
		this.deleted_at = deleted_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getLink_url() {
		return link_url;
	}
	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getBackground_color() {
		return background_color;
	}
	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}
	public String getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "FindAdBean [id=" + id + ", type=" + type + ", weight=" + weight
				+ ", img_url=" + img_url + ", link_url=" + link_url
				+ ", title=" + title + ", operator=" + operator
				+ ", background_color=" + background_color + ", deleted_at="
				+ deleted_at + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}

}
