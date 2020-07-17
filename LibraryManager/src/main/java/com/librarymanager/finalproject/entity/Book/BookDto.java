package com.librarymanager.finalproject.entity.Book;

import com.librarymanager.finalproject.entity.Category.Category;

public class BookDto {
    public int id;
    public String name;
    public Category categoryId;
    public Integer authorId;
    public Integer publisherId;
    public double price;
    public int publishingYear;
    public int quantity;
    public int status;
    public int createdAt;
    public int createdBy;
    public int updateAt;
    public int updateBy;

    public BookDto() {
    }

    public BookDto(int id, String name, Category categoryId, Integer authorId, Integer publisherId, double price,
                   int publishingYear, int quantity, int status, int createdAt, int createdBy, int updateAt, int updateBy)
    {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.authorId = authorId;
        this.publisherId = publisherId;
        this.price = price;
        this.publishingYear = publishingYear;
        this.quantity = quantity;
        this.status = status;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
    }
}
