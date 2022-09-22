package tr.com.obss.jip.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import tr.com.obss.jip.dto.ErrorDto;

import javax.servlet.http.HttpServletRequest;

@ResponseBody
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDto handleException(UserNotFoundException ex, HttpServletRequest request){
        return new ErrorDto(ex.getMessage(),100000L,request.getRequestURI());
    }


}
