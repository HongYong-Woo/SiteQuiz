package i_Class7_Wrap_20240709.prob1;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {
  private Owner owner;
  private int price;

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;

    if(!(obj instanceof Vehicle))
      return false;
    Vehicle vehicle = (Vehicle) obj;
    return Objects.equals(this.owner, vehicle.owner);
  }

  @Override
  public String toString() {
    return owner.toString() + "차량정보 : 가격은 : " + this.price + "입니다.";
  }
}
