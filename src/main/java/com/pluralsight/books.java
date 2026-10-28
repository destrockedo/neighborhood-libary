package com.pluralsight;

public class books {
    private int bookid;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkOutTo;

    public books(int bookid, String isbn, String title, boolean isCheckedOut, String checkOutTo){
        this.bookid = bookid;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkOutTo = checkOutTo;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.checkOutTo = checkOutTo;
    }
    public void checkOut(String name) {
        this.checkOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkIn(){
        this.checkOutTo = "";
        this.isCheckedOut = false;
    }

    @Override
    public String toString() {
        return bookid + " | " + isbn + " | " + title + " | " + isCheckedOut + " | " + checkOutTo;
                /*"books{" +
                "bookid=" + bookid +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkOutTo='" + checkOutTo + '\'' +
                '}';*/
    }
}
