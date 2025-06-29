package org.group5.artisanconnect;

import jakarta.persistence.*;

//Connects to the Railway SQL Database and stores these attributes
@Entity
@Table(name ="prodTable") //Specifies the details of the database table that an
// entity class will be mapped to

public class Product
{
    @Id
    @GeneratedValue
    //Class attributes used to create a Product
    private Long id;
    @Column
    private String prodName;
    @Column
    private String description;
    @Column
    private String price;

    //Setters and getters for each respective attribute
    public void setId(Long id) { this.id = id; }
    public Long getId() { return id; }
    public void setProdName(String prodName) { this.prodName = prodName; }
    public String getProdName() { return prodName; }
    public void setDesc(String description) { this.description = description; }
    public String getDesc() { return description; }
    public void setPrice(String price) { this.price = price; }
    public String getPrice() { return price; }
}
