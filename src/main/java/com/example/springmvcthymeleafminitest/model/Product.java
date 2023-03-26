package com.example.springmvcthymeleafminitest.model;

public class Product {
    //(id, mã tranh, kích thước chiều cao, kích thước chiều rộng, chất liệu, mô tả, giá)
    private int id;
    private String prod_id;
    private long prod_height;
    private long prod_width;
    private String material;
    private String desc;
    private long price;

    public Product() {
    }

    public Product(String prod_id, long prod_height, long prod_width, String material, String desc, long price) {
        this.prod_id = prod_id;
        this.prod_height = prod_height;
        this.prod_width = prod_width;
        this.material = material;
        this.desc = desc;
        this.price = price;
    }

    public Product(int id, String prod_id, long prod_height, long prod_width, String material, String desc, long price) {
        this.id = id;
        this.prod_id = prod_id;
        this.prod_height = prod_height;
        this.prod_width = prod_width;
        this.material = material;
        this.desc = desc;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_id() {
        return prod_id;
    }

    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public long getProd_height() {
        return prod_height;
    }

    public void setProd_height(long prod_height) {
        this.prod_height = prod_height;
    }

    public long getProd_width() {
        return prod_width;
    }

    public void setProd_width(long prod_width) {
        this.prod_width = prod_width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public Product clone(){
        Product product = new Product();
        product.setId(id);
        product.setProd_id(prod_id);
        product.setProd_height(prod_height);
        product.setProd_width(prod_width);
        product.setMaterial(material);
        product.setDesc(desc);
        product.setPrice(price);
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", prod_id='" + prod_id + '\'' +
                ", prod_height=" + prod_height +
                ", prod_width=" + prod_width +
                ", material='" + material + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
