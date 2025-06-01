package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    public KatoIchiro_Chapter18() {
        setGivenName(); // コンストラクタで初期化する場合
    }

    public void setGivenName() {
        this.givenName = "一郎";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}