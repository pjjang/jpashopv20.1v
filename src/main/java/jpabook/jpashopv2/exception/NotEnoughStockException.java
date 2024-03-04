package jpabook.jpashopv2.exception;

public class NotEnoughStockException extends RuntimeException{

    public NotEnoughStockException() {
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

}
