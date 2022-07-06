package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName GroupLeader
 * @Description 总经理
 * @date 2022/6/9 14:43
 **/
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    protected void hadlerLeave(LeaveRequst leaveRequst) {
        System.out.println(leaveRequst.getName() + "请假" + leaveRequst.getNum() + "天，事由:" + leaveRequst.getContent());
        System.out.println("总经理：同意");
    }
}
