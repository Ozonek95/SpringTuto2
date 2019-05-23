package kacpi.implementations;

import kacpi.api.Logger;
import kacpi.api.UserRepository;
import kacpi.domain.User;

/**
 * @author Kacper Staszek
 */
public class UserRepositoryImpl implements UserRepository {

  private Logger logger;

  public User createUser(String name) {
    logger.log("Create user "+name);
    return new User(name);
  }

  public void setLogger(Logger logger) {
    this.logger=logger;
  }
}
