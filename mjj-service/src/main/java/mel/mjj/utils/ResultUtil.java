package mel.mjj.utils;

public class ResultUtil<T>{
    /**
     * 成功有返回数据
     * @param object 返回的数据
     * @return
     */
    public  AppResult<T> success(T data){
//        AppResult result = new AppResult();
//        result.setCode(AppResultCode.CODE_SUCCESS);
//        result.setMessage("success");
//        if(object != null){
//            result.setData(object);
//        }
        return new AppResult(AppResultCode.CODE_SUCCESS,AppResultCode.OPERATE_SUCCESS,"success",data);
    }

    /**
     * 成功但无数据返回，适用于更新或插入
     * @return
     */
    public  AppResult success(){
        return success(null);
    }

    /**
     * 失败方法
     * @param code 失败状态码
     * @param message 失败信息
     * @return
     */
    public static AppResult error(Integer code,String message){
        AppResult result = new AppResult();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }


//    public ResultUtil(Integer code, boolean status, String message, T data) {
//        super(code, status, message, data);
//    }
//
//    public ResultUtil(Throwable throwable) {
//        super(throwable);
//    }
}
