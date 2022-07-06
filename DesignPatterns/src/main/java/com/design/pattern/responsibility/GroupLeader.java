package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName GroupLeader
 * @Description
 * @date 2022/6/9 14:43
 **/
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, NUM_ONE);
    }

    protected void hadlerLeave(LeaveRequst leaveRequst) {
        System.out.println(leaveRequst.getName() + "请假" + leaveRequst.getNum() + "天，事由:" + leaveRequst.getContent());
        System.out.println("小组长审批：同意");
    }
}
