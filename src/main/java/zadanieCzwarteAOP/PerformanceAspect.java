package zadanieCzwarteAOP;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Aspect
@Component
class PerformanceAspect {
  private Logger logger = Logger.getLogger(getClass().getName());

  @Pointcut("within(zadanieCzwarteAOP.*)")
  void repositoryClassMethods(){}

  @Before("execution(public boolean repoMethod())")
  void hello(){
    System.out.println("Helloooo");
  }

  @AfterReturning(pointcut = "execution(public boolean repoMethod())", returning = "zwrocil")
  void after(boolean zwrocil){
    System.out.println("Metodka zwróciła "+zwrocil);
  }

  @Around("repositoryClassMethods()")
  public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    long start = System.nanoTime();
    Object proceed = joinPoint.proceed();
    long end = System.nanoTime();
    String methodName = joinPoint.getSignature().getName();
    logger.info("Execution of "+methodName+" took "+ TimeUnit.NANOSECONDS.toMillis(end-start));
    return proceed;
  }

}
