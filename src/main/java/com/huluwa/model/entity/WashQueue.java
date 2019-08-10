package com.huluwa.model.entity;

public class WashQueue {
    private Long id;

    private String name;

    private Integer points;

    private String pre;

    private String next;

    private Integer wash_count;

    private Integer cook_count;

    private Integer uneat_count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre == null ? null : pre.trim();
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next == null ? null : next.trim();
    }

    public Integer getWash_count() {
        return wash_count;
    }

    public void setWash_count(Integer wash_count) {
        this.wash_count = wash_count;
    }

    public Integer getCook_count() {
        return cook_count;
    }

    public void setCook_count(Integer cook_count) {
        this.cook_count = cook_count;
    }

    public Integer getUneat_count() {
        return uneat_count;
    }

    public void setUneat_count(Integer uneat_count) {
        this.uneat_count = uneat_count;
    }
}