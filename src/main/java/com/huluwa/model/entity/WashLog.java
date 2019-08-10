package com.huluwa.model.entity;

import java.util.Date;

public class WashLog {
    private Long id;

    private String do_cook_people;

    private String eat_people;

    private String wash_people;

    private Date eat_time;

    private String current_queue;

    private Date create_time;

    private Long creator;

    private Date update_time;

    private Long updator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDo_cook_people() {
        return do_cook_people;
    }

    public void setDo_cook_people(String do_cook_people) {
        this.do_cook_people = do_cook_people == null ? null : do_cook_people.trim();
    }

    public String getEat_people() {
        return eat_people;
    }

    public void setEat_people(String eat_people) {
        this.eat_people = eat_people == null ? null : eat_people.trim();
    }

    public String getWash_people() {
        return wash_people;
    }

    public void setWash_people(String wash_people) {
        this.wash_people = wash_people == null ? null : wash_people.trim();
    }

    public Date getEat_time() {
        return eat_time;
    }

    public void setEat_time(Date eat_time) {
        this.eat_time = eat_time;
    }

    public String getCurrent_queue() {
        return current_queue;
    }

    public void setCurrent_queue(String current_queue) {
        this.current_queue = current_queue == null ? null : current_queue.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Long getUpdator() {
        return updator;
    }

    public void setUpdator(Long updator) {
        this.updator = updator;
    }
}