package com.ddd.facade;

import java.util.Date;

import com.ddd.call.entity.CallRecord;
import com.ddd.call.service.CallRecordService;
import com.ddd.facade.protection.Converter;
import com.ddd.fee.service.FeeService;
import com.ddd.user.entity.User;
import com.ddd.user.service.UserService;

public class UserCallService {

    public void makeCall(int userId, Date startTime, long length) {

        User user = UserService.getInstance().find(userId);

        CallRecord callRecord = CallRecordService.getInstance().save(Converter.getInstance().convert(user, startTime, length));

        FeeService.getInstance().generate(Converter.getInstance().convert(user, callRecord));
    }
}
