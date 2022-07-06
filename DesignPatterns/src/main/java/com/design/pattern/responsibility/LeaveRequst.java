package com.design.pattern.responsibility;

/**
 * @author Huws
 * @version v1.0
 * @ClassName LeaveRequst
 * @Description 请假条
 * @date 2022/6/9 14:24
 **/
public class LeaveRequst {
    // 请假人
    private String name;

    // 请假天数
    private int num;

    // 请假内容
    private String content;

    public LeaveRequst(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
