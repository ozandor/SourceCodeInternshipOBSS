package tr.com.obss.jip.exception;


public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {

    }

    public UserNotFoundException(String message){

        super(message);
    }

}
