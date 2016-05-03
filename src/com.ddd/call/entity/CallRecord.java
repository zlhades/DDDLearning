package com.ddd.call.entity;

import java.util.Date;

import com.ddd.call.vo.User;
import com.ddd.common.AbstractEntity;

public class CallRecord extends AbstractEntity {

    private Date startTime;
    private long length;

    private User owner;

    public Date getStartTime() {

        return startTime;
    }

    public void setStartTime(Date startTime) {

        this.startTime = startTime;
    }

    public long getLength() {

        return length;
    }

    public void setLength(long length) {

        this.length = length;
    }

    public User getOwner() {

        return owner;
    }

    public void setOwner(User owner) {

        this.owner = owner;
    }
}
