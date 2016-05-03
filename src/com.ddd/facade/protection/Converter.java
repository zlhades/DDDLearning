package com.ddd.facade.protection;

import java.util.Date;

import com.ddd.call.entity.CallRecord;
import com.ddd.call.vo.CallRecordCreateSpecification;
import com.ddd.common.TimePeriod;
import com.ddd.fee.vo.CalculateTimePeriodFeeSpecification;
import com.ddd.fee.vo.CallFeeCreateSpecification;
import com.ddd.fee.vo.TotalFeeForPeriod;
import com.ddd.tax.vo.CallFeeTaxSpecification;
import com.ddd.user.entity.User;

public class Converter {

    public CallRecordCreateSpecification convert(User user, Date startTime, long length) {

        return new CallRecordCreateSpecification(startTime, length, user.getId(), user.getName());
    }

    public com.ddd.call.vo.User convert(User user) {

        return new com.ddd.call.vo.User(user.getId(), user.getName());
    }

    public CallFeeCreateSpecification convert(User user, CallRecord callRecord) {

        //通过用户和通话记录生成计费说明书
        return null;
    }

    public CalculateTimePeriodFeeSpecification convert(User user, TimePeriod timePeriod) {

        //通过用户和计费周期生成说明书
        return null;
    }

    public CallFeeTaxSpecification convert(TotalFeeForPeriod totalFeeForPeriod) {

        //通过totalFeeForPeriod生成说明书
        return null;
    }

    private static Converter instance = new Converter();

    private Converter() {

    }

    public static Converter getInstance() {

        return instance;
    }

}
