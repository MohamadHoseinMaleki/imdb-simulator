/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.Serial;

public class Exceptions extends Throwable {

    public Exceptions(String entity_is_unprocessable) {
    }

    @ControllerAdvice
    public static class ProductExceptionController {
        @ExceptionHandler(value = ProductNotfoundException.class)
        public ResponseEntity<Object> exception(ProductNotfoundException exception) {
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }
    public static class ProductNotfoundException extends RuntimeException {
        @Serial
        private static final long serialVersionUID = 1L;
    }

    @ExceptionHandler(value = ProductNotfoundException.class)

    public ResponseEntity<Object> exception(ProductNotfoundException exception) {
    return null;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable String id) {
        throw new ProductNotfoundException();
    }

    public static class BadInputException extends Exceptions {
        public BadInputException() {
            super("ENTITY IS UNPROCESSABLE");
        }
    }
}
