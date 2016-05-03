package com.ddd.fee.service;

import com.ddd.fee.entity.CallFee;
import com.ddd.fee.vo.CalculateTimePeriodFeeSpecification;
import com.ddd.fee.vo.CallFeeCreateSpecification;
import com.ddd.fee.vo.TotalFeeForPeriod;

public class FeeService {

    public CallFee generate(CallFeeCreateSpecification specification) {

        //通过说明书计费
        return new CallFee();
    }

    public TotalFeeForPeriod calculateFee(CalculateTimePeriodFeeSpecification specification) {

        //通过说明书计算这个时间内所有的费用。
        return new TotalFeeForPeriod(null, 0, null);
    }

    private static FeeService instance = new FeeService();

    private FeeService() {

    }

    public static FeeService getInstance() {

        return instance;
    }

}
