package Single_Pattern.InitializationOnDemandHolder;

/**
 * 静态内部类，利用jvm加载内部类时并不立即加载内部类特性，将实例的创建延迟到真正访问内部类，既能延迟加载，又能借助类加载的线程安全特性
 */
public class Singleton {
    private Singleton() {}
    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
