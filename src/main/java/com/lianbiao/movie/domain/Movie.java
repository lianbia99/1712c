package com.lianbiao.movie.domain;

public class Movie {
	private Integer id;
	private String name;
	private String dyname;
	private Integer price;
	private String uptime;
	private Integer lotime;
	private String type;
	private String ntime;
	private String area;
	private Integer ztai;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDyname() {
		return dyname;
	}
	public void setDyname(String dyname) {
		this.dyname = dyname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getLotime() {
		return lotime;
	}
	public void setLotime(Integer lotime) {
		this.lotime = lotime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getZtai() {
		return ztai;
	}
	public void setZtai(Integer ztai) {
		this.ztai = ztai;
	}
	public Movie(Integer id, String name, String dyname, Integer price, String uptime, Integer lotime, String type,
			String ntime, String area, Integer ztai) {
		super();
		this.id = id;
		this.name = name;
		this.dyname = dyname;
		this.price = price;
		this.uptime = uptime;
		this.lotime = lotime;
		this.type = type;
		this.ntime = ntime;
		this.area = area;
		this.ztai = ztai;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", dyname=" + dyname + ", price=" + price + ", uptime=" + uptime
				+ ", lotime=" + lotime + ", type=" + type + ", ntime=" + ntime + ", area=" + area + ", ztai=" + ztai
				+ "]";
	}
	
	
	
	
}
