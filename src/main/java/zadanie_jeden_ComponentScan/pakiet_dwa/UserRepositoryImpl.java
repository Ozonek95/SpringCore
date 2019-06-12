package zadanie_jeden_ComponentScan.pakiet_dwa;

import org.springframework.stereotype.Repository;
import zadanie_jeden_ComponentScan.pakiet_cztery.User;

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
