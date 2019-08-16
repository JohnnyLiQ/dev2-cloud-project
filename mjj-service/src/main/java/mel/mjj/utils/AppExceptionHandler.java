package mel.mjj.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public AppResult handleException(Exception e){
        log.error("进入统一异常处理");
        if(e instanceof AppException){
            AppException exception = (AppException) e;
            return ResultUtil.error(exception.getCode(),exception.getMessage());
        }
        else{
            return ResultUtil.error(500,"系统异常");
        }
    }

}
