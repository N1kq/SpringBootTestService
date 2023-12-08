package models;

public class BaseResponse {
    private final String bookName;
    private final String status;
    private final Integer code;

    public BaseResponse(String bookName, String status, Integer code) {
        this.bookName = bookName;
        this.status = status;
        this.code = code;
    }

    public String getBookName() {
        return bookName;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }
}
