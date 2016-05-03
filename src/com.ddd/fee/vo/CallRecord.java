package com.ddd.fee.vo;

import java.util.Date;

public class CallRecord {

    private long id;
    private Date startTime;
    private long length;

    public CallRecord(long id, Date startTime, long length) {

        this.id = id;
        this.startTime = startTime;
        this.length = length;
    }

    public Date getStartTime() {

        return startTime;
    }

    public long getLength() {

        return length;
    }

}
