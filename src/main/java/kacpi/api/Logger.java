package kacpi.api;

/**
 * @author Kacper Staszek
 */
public interface Logger {
  void log(String message);
  void setName(String name);
  void setVersion(int version);
}
