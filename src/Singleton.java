public class Singleton {
  /** インスタンスを保持するクラス変数 */
  private static final Singleton _instance = new Singleton();

  /**
   * privateでコンストラクタを宣言することで、Singletonクラス内部でしかインスタンス化できない
   */
  private Singleton() {
    //
  }

  /**
   * Singletonクラスの唯一のインスタンスをreturnする。
   * インスタンス化してなくても呼び出せるようにstaticで定義。
   * 
   * @return Singletonクラスインスタンス
   */
  public static Singleton getInstance() {
    return Singleton._instance;
  }

  /**
   * インスタンスを保持するのを内部クラスに任せる例もある。
   * see https://magazine.techacademy.jp/magazine/18939
   */
  static class SingletonHolder {
    private static final Singleton _instance = new Singleton();
  }
}
