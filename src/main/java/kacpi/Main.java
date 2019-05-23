package kacpi;

import kacpi.api.Logger;
import kacpi.api.UserRepository;
import kacpi.implementations.LoggerImpl;
import kacpi.implementations.UserRepositoryImpl;

/**
 * @author Kacper Staszek
 */
class Main {

  public static void main(String[] args) {
    Logger logger = new LoggerImpl();
    UserRepository repository = new UserRepositoryImpl();
    repository.setLogger(logger);
    repository.createUser("Kacpi");
  }

}
