package com.ddd.fee.entity;

import com.ddd.common.AbstractEntity;
import com.ddd.fee.vo.CallRecord;
import com.ddd.fee.vo.User;

public class CallFee extends AbstractEntity {

    private double total;

    private double initFee;
    private double longFee;

    private User owner;
    private CallRecord callRecord;

    public double getTotal() {

        return total;
    }

    public void setTotal(double total) {

        this.total = total;
    }

    public double getInitFee() {

        return initFee;
    }

    public void setInitFee(double initFee) {

        this.initFee = initFee;
    }

    public double getLongFee() {

        return longFee;
    }

    public void setLongFee(double longFee) {

        this.longFee = longFee;
    }

    public User getOwner() {

        return owner;
    }

    public void setOwner(User owner) {

        this.owner = owner;
    }

    public CallRecord getCallRecord() {

        return callRecord;
    }

    public void setCallRecord(CallRecord callRecord) {

        this.callRecord = callRecord;
    }
}
