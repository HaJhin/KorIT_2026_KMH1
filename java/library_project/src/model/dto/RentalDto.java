package model.dto;

import java.time.LocalDateTime;

public class RentalDto {
	private int rentalId;
	private int customerId;
	private int BookId;
	private LocalDateTime rentalDate;
	
	public RentalDto(int rentalId, int customerId, int bookId, LocalDateTime rentalDate) {
		super();
		this.rentalId = rentalId;
		this.customerId = customerId;
		BookId = bookId;
		this.rentalDate = rentalDate;
	} // Ctor ed

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public LocalDateTime getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDateTime rentalDate) {
		this.rentalDate = rentalDate;
	}
	
} // DTO ed
