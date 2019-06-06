package zadaniePierwsze.pakietDrugi;

import org.springframework.stereotype.Repository;
import zadaniePierwsze.pakietCzwarty.User;

/**
 * @author Kacper Staszek
 */
@Repository
class UserRepositoryImpl implements UserRepository{

  @Override
  public void save(User user) {
    System.out.println("Save user "+user);
  }
}
