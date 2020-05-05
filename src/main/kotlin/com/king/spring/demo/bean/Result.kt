package com.king.spring.demo.bean

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

data class Result<T>(val code: Int,val msg: String,val data: T?)