package kacpi.api;

import kacpi.domain.User;

/**
 * @author Kacper Staszek
 */
public interface UserRepository {
  User createUser(String name);
}
