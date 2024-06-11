package com.example.design.responsibility;

/**
 * 请假条类
 * @author liayun
 * @create 2021-09-16 17:41
 */
public class LeaveRequest {

    // 请假人姓名
    private String name;
    // 请假天数
    private int num;
    // 请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }

}
