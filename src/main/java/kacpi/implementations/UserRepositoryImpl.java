package kacpi.implementations;

import kacpi.api.Logger;
import kacpi.api.UserRepository;
import kacpi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Kacper Staszek
 */
public class UserRepositoryImpl implements UserRepository {
  @Autowired
  private Logger logger;
  private String localization;
  private String dbName;

  public UserRepositoryImpl(Logger logger, String localization, String dbName) {
    this.logger = logger;
    this.localization = localization;
    this.dbName = dbName;
  }

  public User createUser(String name) {
    logger.log("Create user "+name+" "+localization+" dbName: "+dbName);
    return new User(name);
  }

//  public void setLogger(Logger logger) {
//    System.out.println("Setter called");
//    this.logger = logger;
//  }
}
