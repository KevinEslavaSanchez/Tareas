
package eslavasanchez;

public class CircuitBreakerPattern {
         public static void main(String[] args){
    CircuitBreaker circuitBreaker = new CircuitBreaker(3, 5000); // Allow3 consecutive failures before opening for5 seconds
ExternalService externalservice = new ExternalService(circuitBreaker);
for (int i = 0; i < 10;  i++){
try { 
         String response = externalservice.performRequest();
         System.out.println("Response:" + response);
} catch (Exception ex){
System.out.println("Exception:" + ex.getMessage());
}
}
}

}
