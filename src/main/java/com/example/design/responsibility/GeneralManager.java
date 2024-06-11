package com.example.design.responsibility;

/**
 * 总经理类（具体的处理者）
 * @author liayun
 * @create 2021-09-16 21:10
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        // 总经理能处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        if (leave.getNum() > NUM_SEVEN){
            System.out.println("超过最大普通请假天数，需要走特批流程");
        }else {
            System.out.println("总经理审批：同意");
        }
    }

}
