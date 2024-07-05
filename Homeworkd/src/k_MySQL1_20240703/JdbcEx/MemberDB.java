package k_MySQL1_20240703.JdbcEx;

import java.io.IOException;

public abstract class MemberDB {

  public abstract String[] login();
  public abstract void menuSelect() throws IOException;

}
