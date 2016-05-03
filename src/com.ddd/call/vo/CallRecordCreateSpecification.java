package com.ddd.call.vo;

import java.util.Date;

public class CallRecordCreateSpecification {

    private Date startTime;
    private long length;
    private long userId;
    private String userName;

    public CallRecordCreateSpecification(Date startTime, long length, long userId, String userName) {

        this.startTime = startTime;
        this.length = length;
        this.userId = userId;
        this.userName = userName;
    }

    public Date getStartTime() {

        return startTime;
    }

    public long getLength() {

        return length;
    }

    public long getUserId() {

        return userId;
    }

    public String getUserName() {

        return userName;
    }
}
