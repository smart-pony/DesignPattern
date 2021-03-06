package com.yadong.pattern.creational.prototype.shallow_clone;

/**
 * 实现Cloneable接口
 * 当前类是浅拷贝
 * 步骤1:创建Mail类,实现Cloneable共接口
 */
public class Mail implements  Cloneable{

    private String mName;
    private String mEmailAddress;
    private String mContent;

    public Mail() {
        System.out.println("无参构造方法");
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getEmailAddress() {
        return mEmailAddress;
    }

    public void setEmailAddress(String mEmailAddress) {
        this.mEmailAddress = mEmailAddress;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mName='" + mName + '\'' +
                ", mEmailAddress='" + mEmailAddress + '\'' +
                ", mContent='" + mContent + '\'' +
                '}';
    }

    /**
     * 步骤2:重写clone 方法
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("重写Mail对象的clone方法");
        return super.clone();
    }
}
