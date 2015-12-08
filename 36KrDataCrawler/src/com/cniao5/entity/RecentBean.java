package com.cniao5.entity;

/**
 * 
 * 当前类注释:近期活动数据信息实体类
 * ProjectName：36KrDataCrawler
 * Author:<a href="http://www.cniao5.com">菜鸟窝</a>
 * Description：
 * 菜鸟窝是一个只专注做Android开发技能的在线学习平台，课程以实战项目为主，对课程与服务”吹毛求疵”般的要求，
 * 打造极致课程，是菜鸟窝不变的承诺
 */
public class RecentBean {
	 private String title;//活动标题
	 private String imgurl; //活动图片
	 private String href;  //地址详情地址
	 private String status;  //活动状态  1.报名中  2.已结束  3.活动中 4.已报名(该状态暂时不考虑)
	 private String desc;    //活动
	 private String location;  //活动地点
	 private String timetext;    //活动时间
	public RecentBean() {
		super();
	}
	public RecentBean(String title, String imgurl, String href, String status,
			String desc, String location, String timetext) {
		super();
		this.title = title;
		this.imgurl = imgurl;
		this.href = href;
		this.status = status;
		this.desc = desc;
		this.location = location;
		this.timetext = timetext;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimetext() {
		return timetext;
	}
	public void setTimetext(String timetext) {
		this.timetext = timetext;
	}
	@Override
	public String toString() {
		return "RecetBean [title=" + title + ", imgurl=" + imgurl + ", href="
				+ href + ", status=" + status + ", desc=" + desc
				+ ", location=" + location + ", timetext=" + timetext + "]";
	}
	 
	 

}
