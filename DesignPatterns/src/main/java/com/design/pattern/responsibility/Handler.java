package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Handler
 * @Description 抽象处理者
 * @date 2022/6/9 14:27
 **/
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    // 声明后续者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    // 各级领导处理请求条的方法
    protected abstract void hadlerLeave(LeaveRequst leaveRequst);

    // 提交请求条
    public final void submit(LeaveRequst leaveRequst) {
        this.hadlerLeave(leaveRequst);
        if(this.nextHandler != null && leaveRequst.getNum() > this.numEnd){
            // 提交给上级领导
            this.nextHandler.submit(leaveRequst);
        } else {
            System.out.println("流程结束");
        }
    }
}
