package leets.enhance.global.response.code;

public interface BaseErrorCode {

    public ErrorReasonDto getReason();

    public ErrorReasonDto getReasonHttpStatus();
}
