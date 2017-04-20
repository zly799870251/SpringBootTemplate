package com.zhangly.template.model;

/**
 * Created by 青葉 on 2017/4/19.
 */
public class Person extends BaseEntity {

    private String name;
    private String description;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
