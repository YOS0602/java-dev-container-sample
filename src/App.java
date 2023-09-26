public class App {
    public static void main(String[] args) throws Exception {
        // いくつでもインスタンスをつくることができる
        Animal mai = new Animal("mai", "dog");
        Animal mai2 = new Animal("mai", "dog");

        Animal puntan = new Animal("pun", "cat");

        // getName()すると異なる名前が表示される。
        System.out.println(mai.getName()); // -> mai
        System.out.println(mai2.getName()); // -> mai
        System.out.println(puntan.getName()); // -> pun
        System.out.println(mai);
        System.out.println(mai2);
        System.out.println(puntan);

        // Singletonクラスは外部からインスタンス化できない
        // Error Message: The constructor Singleton() is not visibleJava(134217859)
        // Singleton singleton = new Singleton();

        // getInstance()メソッドでのみインスタンスを取得できる
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        // getInstanceをどこで何度呼び出しても、同じインスタンスが返される
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
