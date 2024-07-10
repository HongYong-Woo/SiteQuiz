package i_Class7_Wrap_20240709.prob1;

import java.util.Objects;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Owner {
  private String name;
  private String cellPhone;

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;

    if(! (obj instanceof Owner))
      return false;

    Owner owner = (Owner) obj;
    return Objects.equals(this.name, owner.name);
  }

  @Override
  public String toString() {
    return "소유주정보 : 이름은 " + this.name + "이고, 핸드폰 번호는 " + this.cellPhone + "입니다.\n";
  }
}
