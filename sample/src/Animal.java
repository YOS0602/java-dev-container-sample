public class Animal {
  private String _name;
  private String _kind;

  public Animal(String name, String kind) {
    // コンストラクタ
    this._name = name;
    this._kind = kind;
  }

  public String getName() {
    return this._name;
  }

  public String getKind() {
    return this._kind;
  }
}