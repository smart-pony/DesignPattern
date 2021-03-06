package com.yadong.pattern.structural.bridge;

/**
 * 桥接模式
 * 定义:将抽象部分与它的具体实现部分分离,使它们都可以独立地变换
 * 特征:通过组合的方式建立两个类之间的联系,而不是继承
 * 类型:结构型
 *
 * 适用场景:
 *      1.抽象和具体之间增加更多的灵活性
 *      2.一个类存在两个(或多个)独立变化的维度,且这两个(或多个)维度都需要独立进行扩展
 *      3.不希望使用继承,或因为多层继承导致系统类的个数剧增
 * 优点:
 *      1.分离抽象部分和具体实现部分
 *      2.提高了系统的可扩展性
 *      3.符合开闭原则
 *      4.符合合成复用原则
 * 缺点:
 *      1.增加了系统的理解和设计难度
 *      2.需要正确的识别出系统中两个独立变化的维度
 */
public class TestBridge {


    /**
     * 抽象和实现分离,这是最重要的
     * 场景:中国有很多银行,有农业银行和工商银行,有自己的账号,然后分为定期和活期,我们想一下,一块是银行,一块是账号
     * 目的:以后银行会越来越多,希望用桥接模式去进行设计
     */
    public static void test() {
        //工商银行,然后账号类型是 定期
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        //工商银行,然后账号类型是 活期
        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        //农业银行,然后账号类型是 活期
        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

    }

}
