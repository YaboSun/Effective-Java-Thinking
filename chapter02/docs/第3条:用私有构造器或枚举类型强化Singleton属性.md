# 背景  

Singleton是指仅仅被实例化一次的类，Singleton通常被用来代表那些**本质上唯一**的系统组件
比如窗口管理器或者文件系统（这个不是很理解是什么意思）

实现Singleton方法：  

1. 私有构造器，公有静态final域  

2. 私有构造器，公有静态工厂方法  

3. 单元素枚举类型（最佳方法）  

# 私有构造器，公有静态final域  

代码示例：    
```Java      
public class SingletonWithFinalField {
    public static final SingletonWithFinalField INSTANCE = new SingletonWithFinalField();

    /**
     * 私有构造器
     */
    private SingletonWithFinalField() {}

    public void print() {
        System.out.println("This is SingletonWithFinalField method");
    }
}    
``  

测试案例：    
  
```Java    
public class SingletonWithFinalFieldTest {

    @Test
    public void print() {
        SingletonWithFinalField swff = SingletonWithFinalField.INSTANCE;
        swff.print();
    }
}  
``      
由于缺少公有的或者受保护的构造器，可以保证类的全局唯一性，但是有一点，享有特权的客户端可以借助
AccessibleObject.setAccessible，通过反射机制调用私有构造器（不是很明白，需要后面学习反射）  

# 私有构造器，公有静态工厂方法  
详细代码参考``src``中的说明

# 单元素枚举类型（最佳方法）  
详细说明以及代码实现参考源码
