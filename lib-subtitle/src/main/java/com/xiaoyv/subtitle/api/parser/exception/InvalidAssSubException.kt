package com.xiaoyv.subtitle.api.parser.exception

class InvalidAssSubException : InvalidSubException {
    constructor()
    constructor(message: String?) : super(message)
    constructor(message: Throwable?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(
        message: String?,
        cause: Throwable?,
        enableSuppression: Boolean,
        writableStackTrace: Boolean
    ) : super(
        message,
        cause,
        enableSuppression,
        writableStackTrace
    )
}
