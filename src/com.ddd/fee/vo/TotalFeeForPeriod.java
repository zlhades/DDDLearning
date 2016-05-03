package com.ddd.fee.vo;

import com.ddd.common.TimePeriod;
import com.ddd.fee.entity.CallFee;
import com.sun.tools.javac.util.List;

public class TotalFeeForPeriod {
    private List<CallFee> callFeeDetail;
    private double total;
    private TimePeriod timePeriod;

    public TotalFeeForPeriod(List<CallFee> callFeeDetail, double total, TimePeriod timePeriod) {

        this.callFeeDetail = callFeeDetail;
        this.total = total;
        this.timePeriod = timePeriod;
    }

    public List<CallFee> getCallFeeDetail() {

        return callFeeDetail;
    }

    public double getTotal() {

        return total;
    }

    public TimePeriod getTimePeriod() {

        return timePeriod;
    }
}
