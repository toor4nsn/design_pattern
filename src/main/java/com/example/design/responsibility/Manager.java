package com.example.design.responsibility;

/**
 * 部门经理类（具体的处理者）
 * @author liayun
 * @create 2021-09-16 21:10
 */
public class Manager extends Handler {

    public Manager() {
        // 部门经理能处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        if (leave.getNum() > NUM_THREE){
            System.out.println("超过审批权限，需要上一级领导审批");
        }else {
            System.out.println("部门经理审批：同意");
        }
    }

}
