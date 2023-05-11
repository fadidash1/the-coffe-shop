package com.example.demo.dto;

public class CartDTO {
    private long id;
    private  long iduser;
    private long idproduct;

    public CartDTO(long id, long iduser, long idproduct) {
        this.id = id;
        this.iduser = iduser;
        this.idproduct = idproduct;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public long getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(long idproduct) {
        this.idproduct = idproduct;
    }
}
