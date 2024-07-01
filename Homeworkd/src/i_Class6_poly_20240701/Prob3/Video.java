package i_Class6_poly_20240701.Prob3;

public class Video extends Content {

  private String genre;

  public Video() {
  }

  public Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void totalPrice() {
    if (this.genre.equals("new")) {
      this.setPrice(2000);
    } else if (this.genre.equals("comic")) {
      this.setPrice(1500);
    } else if (this.genre.equals("child")) {
      this.setPrice(1000);
    } else {
      this.setPrice(500);
    }
  }
}
