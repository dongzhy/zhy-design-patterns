package Single_Pattern.EnumSingleton;

/**
 * 枚举值在类加载时就创建，jvm保证枚举实例的线程安全和唯一性。同时，枚举对序列化和反射攻击具有天然防护能力
 */
public enum Singleton {
    INSTANCE;
}
