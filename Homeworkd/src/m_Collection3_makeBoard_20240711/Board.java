package m_Collection3_makeBoard_20240711;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter

public class Board {
  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;
  private Date date;

  Board(){}

  Board(String title, String content, String writer) {
    this.btitle = title;
    this.bcontent = content;
    this.bwriter = writer;
  }
  Board(int no, String title, String content, String writer) {
    this.bno = no;
    this.btitle = title;
    this.bcontent = content;
    this.bwriter = writer;
  }

  @Override
  public String toString() {
      return  "번호 : " + bno +
        "\n제목 : " + btitle +
        "\n내용 : " + bcontent +
        "\n작성자 : " + bwriter +
        "\n날짜 : " + date ;
  }
}
