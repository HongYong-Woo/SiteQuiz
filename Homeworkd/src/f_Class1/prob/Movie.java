package f_Class1.prob;

public class Movie {

  private String title;
  private String genre;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  /** 영화 정보 출력 */
  public  void play() {
    System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
  }

}
