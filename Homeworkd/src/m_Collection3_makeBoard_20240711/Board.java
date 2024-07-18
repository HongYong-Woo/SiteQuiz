package m_Collection3_makeBoard_20240711;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
  private LocalDate date;
  private String stringDate;

  Board(){}

  //생성, 업데이트에 쓰임
  Board(String title, String content, String writer) {
    this.btitle = title;
    this.bcontent = content;
    this.bwriter = writer;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    this.date = LocalDate.now();
    stringDate = date.format(formatter);
  }
  
  //조회에 쓰임
  Board(int no, String title, String content, String writer, LocalDate date) {
    this.bno = no;
    this.btitle = title;
    this.bcontent = content;
    this.bwriter = writer;
    this.date = date;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    this.date = LocalDate.now();
    stringDate = date.format(formatter);

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
