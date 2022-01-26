package com.itheima_01;


/*多线程程序执行方法一，
创建Thread的子类mythread，并且重写run()方法
setName和getName方法用来设置线程名以及获得线程名

public class ThreadDemo2 {
    public static void main(String[] args) {
        mythreadDemo mt =new mythreadDemo();
        mt.setName("thread_001");
        mt.start();
        mythreadDemo mt2 =new mythreadDemo();
        mt2.start();
        mt2.setName("thread_002");
    }
}
*/


//方法二
// 声明实现runable接口的类mythread_runable，重写该类的run方法，
// 并经实例化的的对象作为 thread()的传入参数；

//***为何有了方法一种继承thread类并重写run()函数的方法后还需要方法二的办法，
//原因是java的单继承特性 如果重写了thread的子类，将不能再继承其他类
public class ThreadDemo2{
    public static void main(String[] args) {
        mythread_runable mr=new mythread_runable();
        Thread it= new Thread(mr);
        it.setName("laowang");
        it.start();

        mythread_runable mr1=new mythread_runable();
        Thread it1= new Thread(mr1);
        it1.setName("xiaoli");
        it1.start();

    }
    //封装上面的代码+++++++++++++++++++++++++++++
//    public void method(){
//        mythread_runable mr=new mythread_runable();
//        Thread it= new Thread(mr);
//        it.setName("laowang");
//        it.start();
//
//        mythread_runable mr1=new mythread_runable();
//        Thread it1= new Thread(mr1);
//        it1.setName("xiaoli");
//        it1.start();
//
//    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++

}
