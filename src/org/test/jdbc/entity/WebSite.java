package org.test.jdbc.entity;

/**
 * @author Andy 网站信息
 */
public class WebSite {

	private int id;
	private String name;
	private String url;
	private int alexa;
	private String country;

	public WebSite() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getAlexa() {
		return alexa;
	}

	public void setAlexa(int alexa) {
		this.alexa = alexa;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
