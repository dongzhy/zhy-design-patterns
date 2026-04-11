package Single_Pattern.DoubleCheckedLocking;

/**
 * 双重检查锁定
 * 结合懒汉式延迟加载和饿汉式的高性能，首次创建时加索，后续访问则跳过同步块，从而减少锁开销
 */
public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
