public class Instancee {
  //상속 관계시 가능한 것들

  //코드계의 유전자검사
//  잘못된 캐스팅 하면 ClassCastException 터지니까 검사 필.
//  if (obj instanceof Child) {
//    Child childObj = (Child) obj; // 안전한 다운캐스팅
//  }

  //상속때의 부모님 소환술
//Parent p = new Child();  // 자식 객체를 부모 타입으로 업캐스팅
//자식의 고유기능은 부모니까 못쓴다.

  //다시 상속관계로 만듦
//  Child c = (Child) p;  // 부모 타입을 다시 자식 타입으로 다운캐스팅
// 원래 자식 객체였을 때만 가능! 아니면 ClassCastException 터짐.
//  그래서 다운캐스팅 전에 instanceof로 검사하는 게 중요

}
