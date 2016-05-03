package com.ddd.call.service;

import com.ddd.call.entity.CallRecord;
import com.ddd.call.vo.CallRecordCreateSpecification;

public class CallRecordService {

    public CallRecord save(CallRecordCreateSpecification specification) {

        //转成通话记录并存入系统
        return new CallRecord();
    }

    private static CallRecordService instance = new CallRecordService();

    private CallRecordService() {

    }

    public static CallRecordService getInstance() {

        return instance;
    }

}
