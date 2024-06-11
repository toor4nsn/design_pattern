package com.example.design.responsibility;

/**
 * 小组长类（具体的处理者）
 * @author liayun
 * @create 2021-09-16 21:10
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        // 小组长能处理1天以下的请假
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        if (leave.getNum() > NUM_ONE){
            System.out.println("超过审批权限，需要上一级领导审批");
        }else {
            System.out.println("小组长审批：同意");
        }
    }

}
