package com.online.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.online.project.util.OnlineBookStoreConstants;

@Entity
@Table(name= "Books")
public class Book {
	@Id
	@Column(name = "ISBN")
	private String ISBN_Number;
	@Column(name = "Title")
	private String title;
	@Column(name = "Authors")
	private String authers;
	@Column(name = "Publisher")
	private String publisher;
	@DateTimeFormat(pattern = OnlineBookStoreConstants.DATE_FORMAT)
	@Column(name= "YOP")
	private String yop;
	@Column(name = "Available_copies")
	private int availableCopies;
	@Column(name = "Price")
	private double price;
	@NotNull
	@Column(name = "Format")
	@Enumerated(EnumType.STRING)
	private Format format;
	@Column(name = "Subject")
	private String subject;
	@Column(name = "image_loc")
	private String imageLocation;
	@Column(name = "description")
	private String description;
	@Column(name = "Category_id")
	private Integer cat_id;
	
	public Book() {
		
	}

	/**
	 * @return the iSBN_Number
	 */
	public String getISBN_Number() {
		return ISBN_Number;
	}

	/**
	 * @param iSBN_Number the iSBN_Number to set
	 */
	public void setISBN_Number(String iSBN_Number) {
		ISBN_Number = iSBN_Number;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the authers
	 */
	public String getAuthers() {
		return authers;
	}

	/**
	 * @param authers the authers to set
	 */
	public void setAuthers(String authers) {
		this.authers = authers;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the yop
	 */
	public String getYop() {
		return yop;
	}

	/**
	 * @param yop the yop to set
	 */
	public void setYop(String yop) {
		this.yop = yop;
	}

	/**
	 * @return the availableCopies
	 */
	public int getAvailableCopies() {
		return availableCopies;
	}

	/**
	 * @param availableCopies the availableCopies to set
	 */
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the format
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(Format format) {
		this.format = format;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the imageLocation
	 */
	public String getImageLocation() {
		return imageLocation;
	}

	/**
	 * @param imageLocation the imageLocation to set
	 */
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the cat_id
	 */
	public Integer getCat_id() {
		return cat_id;
	}

	/**
	 * @param cat_id the cat_id to set
	 */
	public void setCat_id(Integer cat_id) {
		this.cat_id = cat_id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [ISBN_Number=" + ISBN_Number + ", title=" + title + ", authers=" + authers + ", publisher="
				+ publisher + ", yop=" + yop + ", availableCopies=" + availableCopies + ", price=" + price + ", format="
				+ format + ", subject=" + subject + ", imageLocation=" + imageLocation + ", description=" + description
				+ ", cat_id=" + cat_id + "]";
	}
	
	
	
}
