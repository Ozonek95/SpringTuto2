package kacpi.implementations;

import java.time.LocalDate;
import kacpi.api.Logger;

/**
 * @author Kacper Staszek
 */
public class LoggerImpl implements Logger {

  public void log(String message) {
    System.out.println(LocalDate.now() + " : "+message);
  }
}
