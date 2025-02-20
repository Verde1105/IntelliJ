public interface Character {
  //캐릭터 스텟
  String name = "";
  String 종족 = "";
  int damege = 0;
  int stamina = 0;
  int power = 0;
  int intelligence = 0;
  int skillNum = 0;
  int cre = 0;

  static Character getInstance() {
    return new Character() {
    };
  }
}
