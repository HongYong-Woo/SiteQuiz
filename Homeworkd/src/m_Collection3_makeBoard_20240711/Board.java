package m_Collection3_makeBoard_20240711;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Board {
  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;
  private Date date;


}
