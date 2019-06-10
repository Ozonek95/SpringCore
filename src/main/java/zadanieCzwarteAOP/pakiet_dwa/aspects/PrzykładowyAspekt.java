package zadanieCzwarteAOP.pakiet_dwa.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Aspect
@Component
class PrzykładowyAspekt {

  @Before("within(zadanieCzwarteAOP.pakiet_dwa.człowieki.set*)")
  void przedSetteremCzłowiek() {
    System.out.println("Przed setterem człowiek");
  }

  @Before("execution( * zadanieCzwarteAOP.pakiet_dwa.człowieki.*.get*(..))")
  void przedGetteremCzłowiek(){
    System.out.println("Przed getterem człowiek");
  }

  @Before("execution(* zadanieCzwarteAOP.pakiet_dwa.*.*.set*(..))")
  void przedSetteremZJoinPointem(JoinPoint joinPoint){
    System.out.println("Before advice przed metodą "+joinPoint.getSignature().getName());
  }

  @Before("przedKażdąPointcut()")
  void przedKażdąMetodą(){
    System.out.println("Przed każdą metodą");
  }

  @Before("przedZwierzakami()")
  void odpalPrzedZwierzakami(){
    System.out.println("Tylko przez metodami z pakietu zwierzaki");
  }

  @Pointcut("within(zadanieCzwarteAOP.pakiet_dwa..*)")
  void przedKażdąPointcut(){}

  @Pointcut("within(zadanieCzwarteAOP.pakiet_dwa.człowieki.*)")
  void przedPakietemCzłowieki(){}

  @Pointcut("within(zadanieCzwarteAOP.pakiet_dwa.zwierzaki.*)")
  void przedZwierzakami(){}
}
