package testFront;

import java.util.Objects;

public class Book {
	private String author;
	private String title;
	private Double price;
	
	public Book() {
		super();
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Book(String author, String title, Double price) {
		super();
		this.author = author;
		this.title = title;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
}
