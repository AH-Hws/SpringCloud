package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName GroupLeader
 * @Description 部门经理
 * @date 2022/6/9 14:43
 **/
public class Manager extends Handler {
    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    protected void hadlerLeave(LeaveRequst leaveRequst) {
        System.out.println(leaveRequst.getName() + "请假" + leaveRequst.getNum() + "天，事由:" + leaveRequst.getContent());
        System.out.println("部门经理：同意");
    }
}
