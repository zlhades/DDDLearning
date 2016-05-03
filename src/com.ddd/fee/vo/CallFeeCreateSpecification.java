package com.ddd.fee.vo;

import java.util.Date;

public class CallFeeCreateSpecification {

    private long callRecordId;
    private Date startTime;
    private long length;
    private long userId;
    private String userName;

    public CallFeeCreateSpecification(long callRecordId, Date startTime, long length, long userId, String userName) {

        this.callRecordId = callRecordId;
        this.startTime = startTime;
        this.length = length;
        this.userId = userId;
        this.userName = userName;
    }

    public long getCallRecordId() {

        return callRecordId;
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
