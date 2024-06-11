package com.example.design.responsibility;

/**
 * 抽象处理者类
 *
 * @author liayun
 * @create 2021-09-16 17:56
 */
public abstract class Handler {

    // 定义三个常量
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导处理的请假天数区间
    private int numStart; // 请假的开始时间。例如，对部门经理而言，他的numStart就是1
    private int numEnd; // 请假的结束时间。例如，对部门经理而言，他的numEnd就是3

    // 声明后继者（即声明上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置后继者（即设置上级领导）
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各级领导处理请假条的方法。注意，该方法是一个抽象方法，因为不同的领导处理请假条可能稍微有点不一样
    protected abstract void handleLeave(LeaveRequest leave);

    /**
     * 提交请假条。例如，张三要请假，那么他得进行一个提交，即将请假条提交给他的小组长，若小组长能处理则处理，
     * 若处理不了，则他就要把张三的请假条再提交给他的上级领导了，以此类推...
     * <p>
     * 注意了，该方法我们要声明成final的，这是因为要求子类不能去重写该方法。
     */
    public final void submit(LeaveRequest leave) {
        // 该领导进行审批
        this.handleLeave(leave);
        // 该领导审批完了之后，还得进行一个判断，判断他还有没有上级领导，以及请假天数是否超出他最大处理的请假天数
        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            // 若还有上级并且请假天数超过了当前领导的处理范围，则提交给上级领导进行审批
            this.nextHandler.submit(leave);
        } else {
            /*
             * 请假流程结束有两个条件：
             *      1. 当前领导没有上级领导了，也就是说当前领导就是最大的领导
             *      2. 请假天数在当前领导审批的范围之内
             *
             *      例如，张三要请两天的假，由于小组长只能处理1天以下的假，所以他就会把请假条继续提交给部门经理进行审批，
             *      对于部门经理而言，张三请假的天数在他审批的范围之内，这样，部门经理直接审批就完事了，也就是说请假流程
             *      到部门经理这块就结束了，而不需要继续再往总经理那边走了。
             */
            System.out.println("流程结束！");
        }
    }

}
