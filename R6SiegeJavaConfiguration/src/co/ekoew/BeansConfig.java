package co.ekoew;
import org.springframework.context.annotation.*;

@Configuration
public class BeansConfig {
   @Bean 
   public Operator ops(){
      return new Operator(stats());
   }
   
   @Bean 
   public Stats stats(){
      return new Stats();
   }
}