package com.ddd.facade;

import com.ddd.common.TimePeriod;
import com.ddd.facade.protection.Converter;
import com.ddd.fee.service.FeeService;
import com.ddd.fee.vo.TotalFeeForPeriod;
import com.ddd.tax.service.TaxService;
import com.ddd.user.entity.User;
import com.ddd.user.service.UserService;

public class CallFeeClearingService {

    public void monthlyClearingCallFee(long userId, TimePeriod timePeriod) {

        User user = UserService.getInstance().find(userId);

        TotalFeeForPeriod totalFeeForPeriod = FeeService.getInstance().calculateFee(Converter.getInstance().convert(user, timePeriod));

        double tax = TaxService.getInstance().getTax(Converter.getInstance().convert(totalFeeForPeriod));

        //发消息给财务模块
        //FinanceService.getInstance().createBill(Converter.getInstance().convert(totalFeeForPeriod, tax) );
    }

}
