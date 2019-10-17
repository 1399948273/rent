package com.gameloft9.demo.mgrframework.beans.error;


/**
 * 错误码封装
 * @author gameloft9 2017-11-10
 * */
public interface IErrCode {
    /**
     *
     * @return string
     */
    String getCode();

    /**
     *
     * @return string
     */
    String getDesc();

    /**
     *
     * @return string
     */
    @Override
    String toString();
}
