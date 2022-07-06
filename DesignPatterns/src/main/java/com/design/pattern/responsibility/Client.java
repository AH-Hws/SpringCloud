package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Client
 * @Description
 * @date 2022/6/9 14:48
 **/
public class Client {

    public static void main(String[] args) {
        LeaveRequst leaveRequst = new LeaveRequst("小米", 2, "身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequst);
    }
}
