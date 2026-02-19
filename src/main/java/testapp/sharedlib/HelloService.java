package testapp.sharedlib;


import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  public @NonNull String hello() {

    return "Hello";
  }

  public @NonNull String hello2() {

    return "Hello2";
  }
}
