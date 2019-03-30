package com.pinyougou.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ASUS
 * @description com.pinyougou.pojo
 * @date 2019/3/27
 */
@Table(name = "tb_brand")
public class Brand implements Serializable {
    /**主键ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column
    private String name;
    @Column(name = "first_char")
    private String firstChar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
