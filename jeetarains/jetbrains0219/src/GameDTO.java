public class GameDTO {

  private static final GameDTO INSTANCE = new GameDTO();
  private int damege = 0;
  private int stamina = 0;
  private int power = 0;
  private int intelligence = 0;
  private int skillNum = 0;
  private int cre = 0;
  private String name;
  private String 종족 = "";

  public static GameDTO getInstance() {
    return INSTANCE;
  }

  public int getCre() {
    return cre;
  }

  public void setCre(int cre) {
    this.cre = cre;
  }

  public int getDamege() {
    return damege;
  }

  public void setDamege(int damege) {
    this.damege = damege;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getSkillNum() {
    return skillNum;
  }

  public void setSkillNum(int skillNum) {
    this.skillNum = skillNum;
  }

  public int getStamina() {
    return stamina;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String get종족() {
    return 종족;
  }

  public void set종족(String 종족) {
    this.종족 = 종족;
  }

}
