package com.company.匿名内部类.接口匿名;

public class Main {
    public static void main(String[] args) {
        TestBall testBall=new TestBall();
        BBall ball=new RedBall();
        testBall.testBall(ball);
        testBall.getColor(new Ball() {
            @Override
            void getColor() {
                System.out.println("我是黄色的球");
            }
        });
    testBall.testBall(new YellowBall(){
        @Override
        public void getPrice() {
            System.out.println("我是黄色的球，价格五元");
        }
    });
    testBall.testBall(new BlueBall());
    }
}
