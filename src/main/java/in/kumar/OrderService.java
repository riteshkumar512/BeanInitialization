package in.kumar;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {
    private PaymentService paymentService;


//    public OrderService() {
//        System.out.println("OrderService created");
//    }

    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
    public void getOrderDetail(){
        System.out.println("Order details");
    }
}
